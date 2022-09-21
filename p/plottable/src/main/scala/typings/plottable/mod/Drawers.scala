package typings.plottable.mod

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.canvasBufferMod.CanvasBuffer
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.canvasDrawerMod.IFillStyle
import typings.plottable.canvasDrawerMod.IStrokeStyle
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.symbolFactoriesMod.SymbolFactory
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawers {
  
  @JSImport("plottable", "Drawers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable", "Drawers.ArcOutlineSVGDrawer")
  @js.native
  open class ArcOutlineSVGDrawer ()
    extends typings.plottable.drawersMod.ArcOutlineSVGDrawer
  
  @JSImport("plottable", "Drawers.ArcSVGDrawer")
  @js.native
  open class ArcSVGDrawer ()
    extends typings.plottable.drawersMod.ArcSVGDrawer
  
  @JSImport("plottable", "Drawers.AreaSVGDrawer")
  @js.native
  open class AreaSVGDrawer ()
    extends typings.plottable.drawersMod.AreaSVGDrawer
  
  @JSImport("plottable", "Drawers.CanvasDrawer")
  @js.native
  open class CanvasDrawer protected ()
    extends typings.plottable.drawersMod.CanvasDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
  }
  
  @JSImport("plottable", "Drawers.ContextStyleAttrs")
  @js.native
  val ContextStyleAttrs: js.Array[String] = js.native
  
  @JSImport("plottable", "Drawers.LineSVGDrawer")
  @js.native
  open class LineSVGDrawer ()
    extends typings.plottable.drawersMod.LineSVGDrawer
  
  @JSImport("plottable", "Drawers.ProxyDrawer")
  @js.native
  open class ProxyDrawer protected ()
    extends typings.plottable.drawersMod.ProxyDrawer {
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
  
  @JSImport("plottable", "Drawers.RectangleCanvasDrawStep")
  @js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @JSImport("plottable", "Drawers.RectangleCanvasDrawer")
  @js.native
  open class RectangleCanvasDrawer protected ()
    extends typings.plottable.drawersMod.RectangleCanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("plottable", "Drawers.RectangleSVGDrawer")
  @js.native
  open class RectangleSVGDrawer ()
    extends typings.plottable.drawersMod.RectangleSVGDrawer {
    def this(_rootClassName: String) = this()
  }
  
  @JSImport("plottable", "Drawers.SVGDrawer")
  @js.native
  open class SVGDrawer protected ()
    extends typings.plottable.drawersMod.SVGDrawer {
    /**
      * @param svgElementName an HTML/SVG tag name to be created, one per datum.
      * @param className CSS classes to be applied to the drawn primitives.
      * @param applyDefaultAttributes
      */
    def this(svgElementName: String, className: String) = this()
  }
  
  @JSImport("plottable", "Drawers.SegmentSVGDrawer")
  @js.native
  open class SegmentSVGDrawer ()
    extends typings.plottable.drawersMod.SegmentSVGDrawer
  
  @JSImport("plottable", "Drawers.SymbolSVGDrawer")
  @js.native
  open class SymbolSVGDrawer ()
    extends typings.plottable.drawersMod.SymbolSVGDrawer
  
  inline def getStrokeDashArray(style: Record[String, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeDashArray")(style.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getStrokeWidth(style: Record[String, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeWidth")(style.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[Any]], d3LineFactory: js.Function0[Line_[Any]]): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAreaCanvasDrawStep")(d3AreaFactory.asInstanceOf[js.Any], d3LineFactory.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  
  inline def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[Any]]): CanvasDrawStep = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLineCanvasDrawStep")(d3LineFactory.asInstanceOf[js.Any]).asInstanceOf[CanvasDrawStep]
  
  inline def makeSymbolCanvasDrawStep(
    dataset: typings.plottable.datasetMod.Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  inline def makeSymbolCanvasDrawStep(
    dataset: typings.plottable.datasetMod.Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any], stepBuffer.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  
  inline def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area_[Any],
    data: js.Array[Any],
    style: IFillStyle & IStrokeStyle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArea")(context.asInstanceOf[js.Any], d3Area.asInstanceOf[js.Any], data.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderLine(context: CanvasRenderingContext2D, d3Line: Line_[Any], data: js.Array[Any], style: IStrokeStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLine")(context.asInstanceOf[js.Any], d3Line.asInstanceOf[js.Any], data.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderPathWithStyle")(context.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: Any, index: Double): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAttributes")(projector.asInstanceOf[js.Any], attrKeys.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: Any, index: Double): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAttributesSubsetWithStyles")(projector.asInstanceOf[js.Any], extraKeys.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
}
