package typings.plottable

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typings.plottable.buildSrcDrawersDrawStepMod.AppliedDrawStep
import typings.plottable.buildSrcDrawersDrawerMod.IDrawer
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersCanvasDrawerMod {
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/canvasDrawer", "CanvasDrawer")
  @js.native
  open class CanvasDrawer protected ()
    extends StObject
       with IDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _drawStep: Any = js.native
    
    /**
      * Mutate the surface to reflect the data being passed in. This method is responsible
      * for calling the animators at the right time and order.
      * @param data The data to be drawn.
      * @param drawSteps The draw steps that the data go through.
      */
    /* CompleteClass */
    override def draw(data: js.Array[Any], drawSteps: js.Array[AppliedDrawStep]): Unit = js.native
    
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
  
  inline def getStrokeDashArray(style: Record[String, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeDashArray")(style.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getStrokeWidth(style: Record[String, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeWidth")(style.asInstanceOf[js.Any]).asInstanceOf[Double]
  
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
  
  type CanvasDrawStep = js.Function3[
    /* context */ CanvasRenderingContext2D, 
    /* data */ js.Array[Any], 
    /* attrToAppliedProjector */ AttributeToAppliedProjector, 
    Unit
  ]
  
  trait IFillStyle extends StObject {
    
    var fill: js.UndefOr[String] = js.undefined
    
    var `fill-opacity`: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object IFillStyle {
    
    inline def apply(): IFillStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFillStyle]
    }
    
    extension [Self <: IFillStyle](x: Self) {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def `setFill-opacity`(value: Double): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
      
      inline def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
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
    
    inline def apply(): IStrokeStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStrokeStyle]
    }
    
    extension [Self <: IStrokeStyle](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dasharray`(value: String): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
      
      inline def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
      
      inline def `setStroke-opacity`(value: Double): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
      
      inline def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
      
      inline def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
