package typings.plottable

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.drawStepMod.AppliedDrawStep
import typings.plottable.drawerMod.IDrawer
import typings.plottable.interfacesMod.AttributeToAppliedProjector
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasDrawerMod {
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "CanvasDrawer")
  @js.native
  class CanvasDrawer protected ()
    extends StObject
       with IDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
    
    var _context: js.Any = js.native
    
    var _drawStep: js.Any = js.native
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    /* CompleteClass */
    override def draw(data: js.Array[js.Any], drawSteps: js.Array[AppliedDrawStep]): Unit = js.native
    
    def getDrawStep(): CanvasDrawStep = js.native
    
    /**
      * Get the visual primitive for the given *data* index.
      */
    /* CompleteClass */
    override def getVisualPrimitiveAtIndex(index: Double): Element = js.native
    
    /**
      * Get the the last drawn visual primitives.
      */
    /* CompleteClass */
    override def getVisualPrimitives(): js.Array[Element] = js.native
    
    /**
      * Called when the Drawer is no longer needed - implementors may use this to cleanup
      * any resources they've created
      */
    /* CompleteClass */
    override def remove(): Unit = js.native
  }
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "ContextStyleAttrs")
  @js.native
  val ContextStyleAttrs: js.Array[String] = js.native
  
  @scala.inline
  def getStrokeDashArray(style: Record[String, js.Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeDashArray")(style.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getStrokeWidth(style: Record[String, js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeWidth")(style.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area_[js.Any],
    data: js.Array[js.Any],
    style: IFillStyle & IStrokeStyle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArea")(context.asInstanceOf[js.Any], d3Area.asInstanceOf[js.Any], data.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def renderLine(
    context: CanvasRenderingContext2D,
    d3Line: Line_[js.Any],
    data: js.Array[js.Any],
    style: IStrokeStyle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLine")(context.asInstanceOf[js.Any], d3Line.asInstanceOf[js.Any], data.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderPathWithStyle")(context.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: js.Any, index: Double): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAttributes")(projector.asInstanceOf[js.Any], attrKeys.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  
  @scala.inline
  def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: js.Any, index: Double): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAttributesSubsetWithStyles")(projector.asInstanceOf[js.Any], extraKeys.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  
  type CanvasDrawStep = js.Function3[
    /* context */ CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ AttributeToAppliedProjector, 
    Unit
  ]
  
  trait IFillStyle extends StObject {
    
    var fill: js.UndefOr[String] = js.undefined
    
    var `fill-opacity`: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
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
  
  trait IStrokeStyle extends StObject {
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var `stroke-dasharray`: js.UndefOr[String] = js.undefined
    
    var `stroke-opacity`: js.UndefOr[Double] = js.undefined
    
    var `stroke-width`: js.UndefOr[Double] = js.undefined
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
