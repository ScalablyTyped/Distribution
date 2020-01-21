package typings.plottable

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.canvasBufferMod.CanvasBuffer
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.canvasDrawerMod.IFillStyle
import typings.plottable.canvasDrawerMod.IStrokeStyle
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.symbolFactoriesMod.SymbolFactory
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers", JSImport.Namespace)
@js.native
object drawersMod extends js.Object {
  @js.native
  class ArcOutlineSVGDrawer ()
    extends typings.plottable.arcOutlineDrawerMod.ArcOutlineSVGDrawer
  
  @js.native
  class ArcSVGDrawer ()
    extends typings.plottable.arcDrawerMod.ArcSVGDrawer
  
  @js.native
  class AreaSVGDrawer ()
    extends typings.plottable.areaDrawerMod.AreaSVGDrawer
  
  @js.native
  class CanvasDrawer protected ()
    extends typings.plottable.canvasDrawerMod.CanvasDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
  }
  
  @js.native
  class LineSVGDrawer ()
    extends typings.plottable.lineDrawerMod.LineSVGDrawer
  
  @js.native
  class ProxyDrawer protected ()
    extends typings.plottable.drawerMod.ProxyDrawer {
    /**
      * A Drawer draws svg elements based on the input Dataset.
      *
      * @constructor
      * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
      * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
      */
    def this(
      _svgDrawerFactory: js.Function0[typings.plottable.svgDrawerMod.SVGDrawer],
      _canvasDrawerFactory: js.Function1[/* ctx */ CanvasRenderingContext2D, typings.plottable.canvasDrawerMod.CanvasDrawer]
    ) = this()
  }
  
  @js.native
  class RectangleCanvasDrawer protected ()
    extends typings.plottable.rectangleDrawerMod.RectangleCanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @js.native
  class RectangleSVGDrawer ()
    extends typings.plottable.rectangleDrawerMod.RectangleSVGDrawer {
    def this(_rootClassName: String) = this()
  }
  
  @js.native
  class SVGDrawer protected ()
    extends typings.plottable.svgDrawerMod.SVGDrawer {
    /**
      * @param svgElementName an HTML/SVG tag name to be created, one per datum.
      * @param className CSS classes to be applied to the drawn primitives.
      * @param applyDefaultAttributes
      */
    def this(svgElementName: String, className: String) = this()
  }
  
  @js.native
  class SegmentSVGDrawer ()
    extends typings.plottable.segmentDrawerMod.SegmentSVGDrawer
  
  @js.native
  class SymbolSVGDrawer ()
    extends typings.plottable.symbolDrawerMod.SymbolSVGDrawer
  
  val ContextStyleAttrs: js.Array[String] = js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  def getStrokeDashArray(style: Record[String, _]): js.Array[Double] = js.native
  def getStrokeWidth(style: Record[String, _]): Double = js.native
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[_]], d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = js.native
  def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area_[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): Unit = js.native
  def renderLine(context: CanvasRenderingContext2D, d3Line: Line_[_], data: js.Array[_], style: IStrokeStyle): Unit = js.native
  def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, _]): Unit = js.native
  def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
  def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
}

