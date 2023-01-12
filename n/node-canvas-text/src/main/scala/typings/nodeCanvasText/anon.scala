package typings.nodeCanvasText

import typings.nodeCanvasText.nodeCanvasTextStrings.baseline
import typings.nodeCanvasText.nodeCanvasTextStrings.bottom
import typings.nodeCanvasText.nodeCanvasTextStrings.box
import typings.nodeCanvasText.nodeCanvasTextStrings.center
import typings.nodeCanvasText.nodeCanvasTextStrings.left
import typings.nodeCanvasText.nodeCanvasTextStrings.right
import typings.nodeCanvasText.nodeCanvasTextStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<node-canvas-text.node-canvas-text.DrawOptions> */
  trait PartialDrawOptions extends StObject {
    
    var drawRect: js.UndefOr[Boolean] = js.undefined
    
    var fillPadding: js.UndefOr[Double] = js.undefined
    
    var fitMethod: js.UndefOr[baseline | box] = js.undefined
    
    var granularity: js.UndefOr[Double] = js.undefined
    
    var hAlign: js.UndefOr[center | left | right] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var rectFillOnlyText: js.UndefOr[Boolean] = js.undefined
    
    var rectFillStyle: js.UndefOr[String] = js.undefined
    
    var textFillStyle: js.UndefOr[String] = js.undefined
    
    var textPadding: js.UndefOr[Double] = js.undefined
    
    var vAlign: js.UndefOr[bottom | center | top] = js.undefined
  }
  object PartialDrawOptions {
    
    inline def apply(): PartialDrawOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDrawOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDrawOptions] (val x: Self) extends AnyVal {
      
      inline def setDrawRect(value: Boolean): Self = StObject.set(x, "drawRect", value.asInstanceOf[js.Any])
      
      inline def setDrawRectUndefined: Self = StObject.set(x, "drawRect", js.undefined)
      
      inline def setFillPadding(value: Double): Self = StObject.set(x, "fillPadding", value.asInstanceOf[js.Any])
      
      inline def setFillPaddingUndefined: Self = StObject.set(x, "fillPadding", js.undefined)
      
      inline def setFitMethod(value: baseline | box): Self = StObject.set(x, "fitMethod", value.asInstanceOf[js.Any])
      
      inline def setFitMethodUndefined: Self = StObject.set(x, "fitMethod", js.undefined)
      
      inline def setGranularity(value: Double): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
      
      inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
      
      inline def setHAlign(value: center | left | right): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setRectFillOnlyText(value: Boolean): Self = StObject.set(x, "rectFillOnlyText", value.asInstanceOf[js.Any])
      
      inline def setRectFillOnlyTextUndefined: Self = StObject.set(x, "rectFillOnlyText", js.undefined)
      
      inline def setRectFillStyle(value: String): Self = StObject.set(x, "rectFillStyle", value.asInstanceOf[js.Any])
      
      inline def setRectFillStyleUndefined: Self = StObject.set(x, "rectFillStyle", js.undefined)
      
      inline def setTextFillStyle(value: String): Self = StObject.set(x, "textFillStyle", value.asInstanceOf[js.Any])
      
      inline def setTextFillStyleUndefined: Self = StObject.set(x, "textFillStyle", js.undefined)
      
      inline def setTextPadding(value: Double): Self = StObject.set(x, "textPadding", value.asInstanceOf[js.Any])
      
      inline def setTextPaddingUndefined: Self = StObject.set(x, "textPadding", js.undefined)
      
      inline def setVAlign(value: bottom | center | top): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
}
