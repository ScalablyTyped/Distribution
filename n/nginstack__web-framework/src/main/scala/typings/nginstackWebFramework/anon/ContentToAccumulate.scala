package typings.nginstackWebFramework.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentToAccumulate extends StObject {
  
  var contentToAccumulate: js.UndefOr[Double] = js.undefined
  
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var cssStyle: js.UndefOr[Record[String, String]] = js.undefined
  
  var key: js.UndefOr[Double] = js.undefined
  
  var renderContentAsHtml: js.UndefOr[Boolean] = js.undefined
  
  var showBottomLine: js.UndefOr[Boolean] = js.undefined
  
  var showTopLine: js.UndefOr[Boolean] = js.undefined
  
  var tagAttributes: js.UndefOr[Record[String, String]] = js.undefined
  
  var totalContentWeight: js.UndefOr[Double] = js.undefined
}
object ContentToAccumulate {
  
  inline def apply(): ContentToAccumulate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentToAccumulate]
  }
  
  extension [Self <: ContentToAccumulate](x: Self) {
    
    inline def setContentToAccumulate(value: Double): Self = StObject.set(x, "contentToAccumulate", value.asInstanceOf[js.Any])
    
    inline def setContentToAccumulateUndefined: Self = StObject.set(x, "contentToAccumulate", js.undefined)
    
    inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
    
    inline def setCssStyle(value: Record[String, String]): Self = StObject.set(x, "cssStyle", value.asInstanceOf[js.Any])
    
    inline def setCssStyleUndefined: Self = StObject.set(x, "cssStyle", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRenderContentAsHtml(value: Boolean): Self = StObject.set(x, "renderContentAsHtml", value.asInstanceOf[js.Any])
    
    inline def setRenderContentAsHtmlUndefined: Self = StObject.set(x, "renderContentAsHtml", js.undefined)
    
    inline def setShowBottomLine(value: Boolean): Self = StObject.set(x, "showBottomLine", value.asInstanceOf[js.Any])
    
    inline def setShowBottomLineUndefined: Self = StObject.set(x, "showBottomLine", js.undefined)
    
    inline def setShowTopLine(value: Boolean): Self = StObject.set(x, "showTopLine", value.asInstanceOf[js.Any])
    
    inline def setShowTopLineUndefined: Self = StObject.set(x, "showTopLine", js.undefined)
    
    inline def setTagAttributes(value: Record[String, String]): Self = StObject.set(x, "tagAttributes", value.asInstanceOf[js.Any])
    
    inline def setTagAttributesUndefined: Self = StObject.set(x, "tagAttributes", js.undefined)
    
    inline def setTotalContentWeight(value: Double): Self = StObject.set(x, "totalContentWeight", value.asInstanceOf[js.Any])
    
    inline def setTotalContentWeightUndefined: Self = StObject.set(x, "totalContentWeight", js.undefined)
  }
}
