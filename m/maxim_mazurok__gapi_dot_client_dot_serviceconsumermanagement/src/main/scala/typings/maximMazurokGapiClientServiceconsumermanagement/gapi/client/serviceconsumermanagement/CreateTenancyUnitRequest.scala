package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTenancyUnitRequest extends StObject {
  
  /**
    * Optional. Optional service producer-provided identifier of the tenancy unit. Must be no longer than 40 characters and preferably URI friendly. If it isn't provided, a UID for the
    * tenancy unit is automatically generated. The identifier must be unique across a managed service. If the tenancy unit already exists for the managed service and service consumer
    * pair, calling `CreateTenancyUnit` returns the existing tenancy unit if the provided identifier is identical or empty, otherwise the call fails.
    */
  var tenancyUnitId: js.UndefOr[String] = js.undefined
}
object CreateTenancyUnitRequest {
  
  inline def apply(): CreateTenancyUnitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTenancyUnitRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTenancyUnitRequest] (val x: Self) extends AnyVal {
    
    inline def setTenancyUnitId(value: String): Self = StObject.set(x, "tenancyUnitId", value.asInstanceOf[js.Any])
    
    inline def setTenancyUnitIdUndefined: Self = StObject.set(x, "tenancyUnitId", js.undefined)
  }
}
