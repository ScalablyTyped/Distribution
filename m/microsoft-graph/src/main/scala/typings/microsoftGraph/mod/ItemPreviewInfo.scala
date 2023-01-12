package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemPreviewInfo extends StObject {
  
  var getUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var postParameters: js.UndefOr[NullableOption[String]] = js.undefined
  
  var postUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object ItemPreviewInfo {
  
  inline def apply(): ItemPreviewInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemPreviewInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemPreviewInfo] (val x: Self) extends AnyVal {
    
    inline def setGetUrl(value: NullableOption[String]): Self = StObject.set(x, "getUrl", value.asInstanceOf[js.Any])
    
    inline def setGetUrlNull: Self = StObject.set(x, "getUrl", null)
    
    inline def setGetUrlUndefined: Self = StObject.set(x, "getUrl", js.undefined)
    
    inline def setPostParameters(value: NullableOption[String]): Self = StObject.set(x, "postParameters", value.asInstanceOf[js.Any])
    
    inline def setPostParametersNull: Self = StObject.set(x, "postParameters", null)
    
    inline def setPostParametersUndefined: Self = StObject.set(x, "postParameters", js.undefined)
    
    inline def setPostUrl(value: NullableOption[String]): Self = StObject.set(x, "postUrl", value.asInstanceOf[js.Any])
    
    inline def setPostUrlNull: Self = StObject.set(x, "postUrl", null)
    
    inline def setPostUrlUndefined: Self = StObject.set(x, "postUrl", js.undefined)
  }
}
