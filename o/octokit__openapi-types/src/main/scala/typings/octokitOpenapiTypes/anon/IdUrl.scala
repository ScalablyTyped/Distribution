package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdUrl extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @description The REST API URL for checking the status of the upload.
    */
  var url: js.UndefOr[String] = js.undefined
}
object IdUrl {
  
  inline def apply(): IdUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdUrl] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
