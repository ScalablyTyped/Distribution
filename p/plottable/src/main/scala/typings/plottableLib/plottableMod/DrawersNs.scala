package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Drawers")
@js.native
object DrawersNs extends js.Object {
  @js.native
  class ArcOutlineSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.ArcOutlineSVGDrawer
  
  @js.native
  class ArcSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.ArcSVGDrawer
  
  @js.native
  class AreaSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.AreaSVGDrawer
  
  @js.native
  class CanvasDrawer protected ()
    extends plottableLib.buildSrcDrawersMod.CanvasDrawer {
    /**
         * @param _context The context for a canvas that this drawer will draw to.
         * @param _drawStep The draw step logic that actually draws.
         */
    def this(_context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D, _drawStep: plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep) = this()
  }
  
  @js.native
  class LineSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.LineSVGDrawer
  
  @js.native
  class ProxyDrawer protected ()
    extends plottableLib.buildSrcDrawersMod.ProxyDrawer {
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
  }
  
  @js.native
  class RectangleCanvasDrawer protected ()
    extends plottableLib.buildSrcDrawersMod.RectangleCanvasDrawer {
    def this(ctx: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D) = this()
  }
  
  @js.native
  class RectangleSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.RectangleSVGDrawer {
    def this(_rootClassName: java.lang.String) = this()
  }
  
  @js.native
  class SVGDrawer protected ()
    extends plottableLib.buildSrcDrawersMod.SVGDrawer {
    /**
         * @param svgElementName an HTML/SVG tag name to be created, one per datum.
         * @param className CSS classes to be applied to the drawn primitives.
         * @param applyDefaultAttributes
         */
    def this(svgElementName: java.lang.String, className: java.lang.String) = this()
  }
  
  @js.native
  class SegmentSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.SegmentSVGDrawer
  
  @js.native
  class SymbolSVGDrawer ()
    extends plottableLib.buildSrcDrawersMod.SymbolSVGDrawer
  
  val ContextStyleAttrs: js.Array[java.lang.String] = js.native
  val RectangleCanvasDrawStep: plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def getStrokeDashArray(style: stdLib.Record[java.lang.String, _]): js.Array[scala.Double] = js.native
  def getStrokeWidth(style: stdLib.Record[java.lang.String, _]): scala.Double = js.native
  def makeAreaCanvasDrawStep(
    d3AreaFactory: js.Function0[d3DashShapeLib.d3DashShapeMod.Area[_]],
    d3LineFactory: js.Function0[d3DashShapeLib.d3DashShapeMod.Line[_]]
  ): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[d3DashShapeLib.d3DashShapeMod.Line[_]]): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    symbolProjector: js.Function0[
      plottableLib.buildSrcCoreInterfacesMod.IAccessor[plottableLib.buildSrcCoreSymbolFactoriesMod.SymbolFactory]
    ],
    sizeProjector: js.Function0[plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]]
  ): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def makeSymbolCanvasDrawStep(
    dataset: plottableLib.buildSrcCoreDatasetMod.Dataset,
    symbolProjector: js.Function0[
      plottableLib.buildSrcCoreInterfacesMod.IAccessor[plottableLib.buildSrcCoreSymbolFactoriesMod.SymbolFactory]
    ],
    sizeProjector: js.Function0[plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]],
    stepBuffer: plottableLib.buildSrcDrawersCanvasBufferMod.CanvasBuffer
  ): plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep = js.native
  def renderArea(
    context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    d3Area: d3DashShapeLib.d3DashShapeMod.Area[_],
    data: js.Array[_],
    style: plottableLib.buildSrcDrawersCanvasDrawerMod.IFillStyle with plottableLib.buildSrcDrawersCanvasDrawerMod.IStrokeStyle
  ): scala.Unit = js.native
  def renderLine(
    context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    d3Line: d3DashShapeLib.d3DashShapeMod.Line[_],
    data: js.Array[_],
    style: plottableLib.buildSrcDrawersCanvasDrawerMod.IStrokeStyle
  ): scala.Unit = js.native
  def renderPathWithStyle(
    context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D,
    style: stdLib.Record[java.lang.String, _]
  ): scala.Unit = js.native
  def resolveAttributes(
    projector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector,
    attrKeys: js.Array[java.lang.String],
    datum: js.Any,
    index: scala.Double
  ): stdLib.Record[java.lang.String, _] = js.native
  def resolveAttributesSubsetWithStyles(
    projector: plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector,
    extraKeys: js.Array[java.lang.String],
    datum: js.Any,
    index: scala.Double
  ): stdLib.Record[java.lang.String, _] = js.native
}

