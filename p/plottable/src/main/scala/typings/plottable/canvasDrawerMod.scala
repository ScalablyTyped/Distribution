package typings.plottable

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.drawerMod.IDrawer
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.std.CanvasRenderingContext2D
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasDrawerMod {
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "CanvasDrawer")
  @js.native
  class CanvasDrawer protected () extends IDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
    
    var _context: js.Any = js.native
    
    var _drawStep: js.Any = js.native
    
    def getDrawStep(): CanvasDrawStep = js.native
  }
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "ContextStyleAttrs")
  @js.native
  val ContextStyleAttrs: js.Array[String] = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "getStrokeDashArray")
  @js.native
  def getStrokeDashArray(style: Record[String, _]): js.Array[Double] = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "getStrokeWidth")
  @js.native
  def getStrokeWidth(style: Record[String, _]): Double = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "renderArea")
  @js.native
  def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area_[_],
    data: js.Array[_],
    style: IFillStyle with IStrokeStyle
  ): Unit = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "renderLine")
  @js.native
  def renderLine(context: CanvasRenderingContext2D, d3Line: Line_[_], data: js.Array[_], style: IStrokeStyle): Unit = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "renderPathWithStyle")
  @js.native
  def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, _]): Unit = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "resolveAttributes")
  @js.native
  def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "resolveAttributesSubsetWithStyles")
  @js.native
  def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: js.Any, index: Double): Record[String, _] = js.native
  
  type CanvasDrawStep = js.Function3[
    /* context */ CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ AttributeToAppliedProjector, 
    Unit
  ]
  
  @js.native
  trait IFillStyle extends StObject {
    
    var fill: js.UndefOr[String] = js.native
    
    var `fill-opacity`: js.UndefOr[Double] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
  }
  object IFillStyle {
    
    @scala.inline
    def apply(): IFillStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFillStyle]
    }
    
    @scala.inline
    implicit class IFillStyleMutableBuilder[Self <: IFillStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFill-opacity`(value: Double): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait IStrokeStyle extends StObject {
    
    var opacity: js.UndefOr[Double] = js.native
    
    var stroke: js.UndefOr[String] = js.native
    
    var `stroke-dasharray`: js.UndefOr[String] = js.native
    
    var `stroke-opacity`: js.UndefOr[Double] = js.native
    
    var `stroke-width`: js.UndefOr[Double] = js.native
  }
  object IStrokeStyle {
    
    @scala.inline
    def apply(): IStrokeStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStrokeStyle]
    }
    
    @scala.inline
    implicit class IStrokeStyleMutableBuilder[Self <: IStrokeStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-dasharray`(value: String): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
      
      @scala.inline
      def `setStroke-opacity`(value: Double): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
      
      @scala.inline
      def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
