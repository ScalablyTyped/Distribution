package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  clientId :string,   apiToken :string}> */
trait PartialclientIdstringapiT extends StObject {
  
  var apiToken: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
}
object PartialclientIdstringapiT {
  
  inline def apply(): PartialclientIdstringapiT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialclientIdstringapiT]
  }
  
  extension [Self <: PartialclientIdstringapiT](x: Self) {
    
    inline def setApiToken(value: String): Self = StObject.set(x, "apiToken", value.asInstanceOf[js.Any])
    
    inline def setApiTokenUndefined: Self = StObject.set(x, "apiToken", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
  }
}
