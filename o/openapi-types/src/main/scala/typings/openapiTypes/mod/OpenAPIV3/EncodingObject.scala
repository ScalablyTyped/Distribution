package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingObject extends StObject {
  
  var allowReserved: js.UndefOr[Boolean] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var explode: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
}
object EncodingObject {
  
  @scala.inline
  def apply(): EncodingObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingObject]
  }
  
  @scala.inline
  implicit class EncodingObjectMutableBuilder[Self <: EncodingObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowReserved(value: Boolean): Self = StObject.set(x, "allowReserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReservedUndefined: Self = StObject.set(x, "allowReserved", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setExplode(value: Boolean): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[ReferenceObject | HeaderObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
