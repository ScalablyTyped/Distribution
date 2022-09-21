package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningStatusInfo extends StObject {
  
  var errorInformation: js.UndefOr[NullableOption[ProvisioningErrorInfo]] = js.undefined
  
  // Possible values are: success, warning, failure, skipped, unknownFutureValue.
  var status: js.UndefOr[NullableOption[ProvisioningResult]] = js.undefined
}
object ProvisioningStatusInfo {
  
  inline def apply(): ProvisioningStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningStatusInfo]
  }
  
  extension [Self <: ProvisioningStatusInfo](x: Self) {
    
    inline def setErrorInformation(value: NullableOption[ProvisioningErrorInfo]): Self = StObject.set(x, "errorInformation", value.asInstanceOf[js.Any])
    
    inline def setErrorInformationNull: Self = StObject.set(x, "errorInformation", null)
    
    inline def setErrorInformationUndefined: Self = StObject.set(x, "errorInformation", js.undefined)
    
    inline def setStatus(value: NullableOption[ProvisioningResult]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
