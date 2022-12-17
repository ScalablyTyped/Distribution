package typings.pkijs.anon

import typings.pkijs.mod.ResponseBytesSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBytes extends StObject {
  
  var responseBytes: js.UndefOr[ResponseBytesSchema] = js.undefined
  
  var responseStatus: js.UndefOr[String] = js.undefined
}
object ResponseBytes {
  
  inline def apply(): ResponseBytes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseBytes]
  }
  
  extension [Self <: ResponseBytes](x: Self) {
    
    inline def setResponseBytes(value: ResponseBytesSchema): Self = StObject.set(x, "responseBytes", value.asInstanceOf[js.Any])
    
    inline def setResponseBytesUndefined: Self = StObject.set(x, "responseBytes", js.undefined)
    
    inline def setResponseStatus(value: String): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
  }
}
