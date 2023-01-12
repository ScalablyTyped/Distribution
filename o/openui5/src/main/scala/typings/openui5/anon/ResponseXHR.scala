package typings.openui5.anon

import typings.openui5.sapMUploadUploadSetItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseXHR extends StObject {
  
  /**
    * The item that was uploaded.
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * A JSON object containing the additional response parameters like response, responseXML, readyState, status
    * and headers. Sample response object:
    * ```javascript
    *
    * {
    *    response: "\n...\n",
    *    responseXML: null,
    *    readyState: 2,
    *    status: 404,
    *    headers: "allow: GET, HEAD"
    * }
    * ```
    */
  var responseXHR: js.UndefOr[js.Object] = js.undefined
}
object ResponseXHR {
  
  inline def apply(): ResponseXHR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseXHR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseXHR] (val x: Self) extends AnyVal {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setResponseXHR(value: js.Object): Self = StObject.set(x, "responseXHR", value.asInstanceOf[js.Any])
    
    inline def setResponseXHRUndefined: Self = StObject.set(x, "responseXHR", js.undefined)
  }
}
