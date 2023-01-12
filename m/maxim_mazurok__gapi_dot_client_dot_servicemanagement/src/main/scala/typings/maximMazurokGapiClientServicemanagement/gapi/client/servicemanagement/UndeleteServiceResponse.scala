package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeleteServiceResponse extends StObject {
  
  /** Revived service resource. */
  var service: js.UndefOr[ManagedService] = js.undefined
}
object UndeleteServiceResponse {
  
  inline def apply(): UndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndeleteServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setService(value: ManagedService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
