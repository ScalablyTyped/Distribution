package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientInfo extends StObject {
  
  /** The list of detailed information about client. */
  var clientInfoDetails: js.UndefOr[js.Array[ClientInfoDetail]] = js.undefined
  
  /** Required. Client name, such as gcloud. */
  var name: js.UndefOr[String] = js.undefined
}
object ClientInfo {
  
  inline def apply(): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfo]
  }
  
  extension [Self <: ClientInfo](x: Self) {
    
    inline def setClientInfoDetails(value: js.Array[ClientInfoDetail]): Self = StObject.set(x, "clientInfoDetails", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDetailsUndefined: Self = StObject.set(x, "clientInfoDetails", js.undefined)
    
    inline def setClientInfoDetailsVarargs(value: ClientInfoDetail*): Self = StObject.set(x, "clientInfoDetails", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
