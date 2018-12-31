package typings
package plottableLib.buildSrcDrawersSvgDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/svgDrawer", "SVGDrawer")
@js.native
class SVGDrawer protected ()
  extends plottableLib.buildSrcDrawersDrawerMod.IDrawer {
  /**
    * @param svgElementName an HTML/SVG tag name to be created, one per datum.
    * @param className CSS classes to be applied to the drawn primitives.
    * @param applyDefaultAttributes
    */
  def this(svgElementName: java.lang.String, className: java.lang.String) = this()
  var _cachedVisualPrimitivesNodeMap: js.Any = js.native
  /**
    * Cache of the _selection.nodes().
    */
  var _cachedVisualPrimitivesNodes: js.Any = js.native
  var _className: java.lang.String = js.native
  /**
    * The root element holding the visual elements. The SVGDrawer owns
    * this variable and manipulates it accordingly.
    */
  var _root: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGElement, _, _, _] = js.native
  /**
    * All of the DOM elements from the last draw.
    */
  var _selection: js.Any = js.native
  var _svgElementName: java.lang.String = js.native
  /* protected */ def _applyDefaultAttributes(selection: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): scala.Unit = js.native
  /* private */ def _createAndDestroyDOMElements(data: js.Any): js.Any = js.native
  /**
    * Draws data using one step
    *
    * @param{AppliedDrawStep} step The step, how data should be drawn.
    */
  /* private */ def _drawStep(step: js.Any): js.Any = js.native
  def attachTo(parent: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGElement, _, _, _]): scala.Unit = js.native
  /**
    * Mutate the surface to reflect the data being passed in. This method is responsible
    * for calling the animators at the right time and order.
    * @param data The data to be drawn.
    * @param drawSteps The draw steps that the data go through.
    */
  /* CompleteClass */
  override def draw(data: js.Array[_], drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.AppliedDrawStep]): scala.Unit = js.native
  def getRoot(): d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.SVGElement, _, _, _] = js.native
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
    * Returns the CSS selector for this Drawer's visual elements.
    */
  def selector(): java.lang.String = js.native
}

