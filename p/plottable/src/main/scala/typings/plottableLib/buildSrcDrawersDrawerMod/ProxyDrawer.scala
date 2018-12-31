package typings
package plottableLib.buildSrcDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/drawer", "ProxyDrawer")
@js.native
class ProxyDrawer protected () extends IDrawer {
  /**
    * A Drawer draws svg elements based on the input Dataset.
    *
    * @constructor
    * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
    * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
    */
  def this(_svgDrawerFactory: js.Function0[plottableLib.buildSrcDrawersSvgDrawerMod.SVGDrawer], _canvasDrawerFactory: js.Function1[
      /* ctx */ d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D, 
      plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
    ]) = this()
  var _canvasDrawerFactory: js.Any = js.native
  var _currentDrawer: js.Any = js.native
  var _svgDrawerFactory: js.Any = js.native
  /**
    * Mutate the surface to reflect the data being passed in. This method is responsible
    * for calling the animators at the right time and order.
    * @param data The data to be drawn.
    * @param drawSteps The draw steps that the data go through.
    */
  /* CompleteClass */
  override def draw(data: js.Array[_], drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.AppliedDrawStep]): scala.Unit = js.native
  def getDrawer(): IDrawer = js.native
  /**
    * Get the visual primitive for the given *data* index.
    */
  /* CompleteClass */
  override def getVisualPrimitiveAtIndex(index: scala.Double): stdLib.Element = js.native
  /**
    * Get the the last drawn visual primitives.
    */
  /* CompleteClass */
  override def getVisualPrimitives(): js.Array[stdLib.Element] = js.native
  /**
    * Called when the Drawer is no longer needed - implementors may use this to cleanup
    * any resources they've created
    */
  /* CompleteClass */
  override def remove(): scala.Unit = js.native
  /**
    * Remove the old drawer and use Canvas rendering from now on.
    */
  def useCanvas(canvas: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.HTMLCanvasElement, _, _, _]): scala.Unit = js.native
  /**
    * Remove the old drawer and use SVG rendering from now on.
    */
  def useSVG(parent: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGElement, _, _, _]): scala.Unit = js.native
}

