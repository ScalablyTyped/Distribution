package typings.openidClient.anon

import typings.node.bufferMod.global.Buffer
import typings.openidClient.mod.DPoPInput
import typings.openidClient.openidClientStrings.DELETE
import typings.openidClient.openidClientStrings.GET
import typings.openidClient.openidClientStrings.HEAD
import typings.openidClient.openidClientStrings.OPTIONS
import typings.openidClient.openidClientStrings.PATCH
import typings.openidClient.openidClientStrings.POST
import typings.openidClient.openidClientStrings.PUT
import typings.openidClient.openidClientStrings.TRACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headers extends StObject {
  
  var DPoP: js.UndefOr[DPoPInput] = js.undefined
  
  var body: js.UndefOr[String | Buffer] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var method: js.UndefOr[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE | PATCH] = js.undefined
  
  var tokenType: js.UndefOr[String] = js.undefined
}
object Headers {
  
  inline def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  extension [Self <: Headers](x: Self) {
    
    inline def setBody(value: String | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDPoP(value: DPoPInput): Self = StObject.set(x, "DPoP", value.asInstanceOf[js.Any])
    
    inline def setDPoPUndefined: Self = StObject.set(x, "DPoP", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
  }
}
