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
  
  @scala.inline
  def apply(): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfo]
  }
  
  @scala.inline
  implicit class ClientInfoMutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientInfoDetails(value: js.Array[ClientInfoDetail]): Self = StObject.set(x, "clientInfoDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInfoDetailsUndefined: Self = StObject.set(x, "clientInfoDetails", js.undefined)
    
    @scala.inline
    def setClientInfoDetailsVarargs(value: ClientInfoDetail*): Self = StObject.set(x, "clientInfoDetails", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
