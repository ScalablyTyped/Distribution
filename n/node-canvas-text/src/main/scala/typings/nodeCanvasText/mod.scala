package typings.nodeCanvasText

import typings.nodeCanvasText.anon.PartialDrawOptions
import typings.nodeCanvasText.nodeCanvasTextStrings.baseline
import typings.nodeCanvasText.nodeCanvasTextStrings.bottom
import typings.nodeCanvasText.nodeCanvasTextStrings.box
import typings.nodeCanvasText.nodeCanvasTextStrings.center
import typings.nodeCanvasText.nodeCanvasTextStrings.left
import typings.nodeCanvasText.nodeCanvasTextStrings.right
import typings.nodeCanvasText.nodeCanvasTextStrings.top
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-canvas-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ctx: CanvasRenderingContext2D,
    text: String,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ctx: CanvasRenderingContext2D,
    text: String,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ Any,
    rect: Unit,
    options: PartialDrawOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], font.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ctx: CanvasRenderingContext2D,
    text: String,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ Any,
    rect: DrawRectangle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], font.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    ctx: CanvasRenderingContext2D,
    text: String,
    font: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Font */ Any,
    rect: DrawRectangle,
    options: PartialDrawOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], font.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DrawOptions extends StObject {
    
    var drawRect: Boolean
    
    var fillPadding: Double
    
    var fitMethod: baseline | box
    
    var granularity: Double
    
    var hAlign: center | left | right
    
    var maxSize: Double
    
    var minSize: Double
    
    var rectFillOnlyText: Boolean
    
    var rectFillStyle: String
    
    var textFillStyle: String
    
    var textPadding: Double
    
    var vAlign: bottom | center | top
  }
  object DrawOptions {
    
    inline def apply(
      drawRect: Boolean,
      fillPadding: Double,
      fitMethod: baseline | box,
      granularity: Double,
      hAlign: center | left | right,
      maxSize: Double,
      minSize: Double,
      rectFillOnlyText: Boolean,
      rectFillStyle: String,
      textFillStyle: String,
      textPadding: Double,
      vAlign: bottom | center | top
    ): DrawOptions = {
      val __obj = js.Dynamic.literal(drawRect = drawRect.asInstanceOf[js.Any], fillPadding = fillPadding.asInstanceOf[js.Any], fitMethod = fitMethod.asInstanceOf[js.Any], granularity = granularity.asInstanceOf[js.Any], hAlign = hAlign.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], rectFillOnlyText = rectFillOnlyText.asInstanceOf[js.Any], rectFillStyle = rectFillStyle.asInstanceOf[js.Any], textFillStyle = textFillStyle.asInstanceOf[js.Any], textPadding = textPadding.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawOptions] (val x: Self) extends AnyVal {
      
      inline def setDrawRect(value: Boolean): Self = StObject.set(x, "drawRect", value.asInstanceOf[js.Any])
      
      inline def setFillPadding(value: Double): Self = StObject.set(x, "fillPadding", value.asInstanceOf[js.Any])
      
      inline def setFitMethod(value: baseline | box): Self = StObject.set(x, "fitMethod", value.asInstanceOf[js.Any])
      
      inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setHAlign(value: center | left | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setRectFillOnlyText(value: Boolean): Self = StObject.set(x, "rectFillOnlyText", value.asInstanceOf[js.Any])
      
      inline def setRectFillStyle(value: String): Self = StObject.set(x, "rectFillStyle", value.asInstanceOf[js.Any])
      
      inline def setTextFillStyle(value: String): Self = StObject.set(x, "textFillStyle", value.asInstanceOf[js.Any])
      
      inline def setTextPadding(value: Double): Self = StObject.set(x, "textPadding", value.asInstanceOf[js.Any])
      
      inline def setVAlign(value: bottom | center | top): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawRectangle extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object DrawRectangle {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): DrawRectangle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawRectangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawRectangle] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
