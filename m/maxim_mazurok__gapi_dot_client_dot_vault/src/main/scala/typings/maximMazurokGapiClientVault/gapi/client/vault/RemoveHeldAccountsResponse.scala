package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveHeldAccountsResponse extends StObject {
  
  /** A list of statuses for deleted accounts. Results have the same order as the request. */
  var statuses: js.UndefOr[js.Array[Status]] = js.undefined
}
object RemoveHeldAccountsResponse {
  
  @scala.inline
  def apply(): RemoveHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveHeldAccountsResponse]
  }
  
  @scala.inline
  implicit class RemoveHeldAccountsResponseMutableBuilder[Self <: RemoveHeldAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatuses(value: js.Array[Status]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: Status*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
