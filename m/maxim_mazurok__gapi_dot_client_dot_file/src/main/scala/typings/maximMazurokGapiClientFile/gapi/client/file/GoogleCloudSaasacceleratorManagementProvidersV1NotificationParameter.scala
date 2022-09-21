package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter extends StObject {
  
  /** Optional. Array of string values. e.g. instance's replica information. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter]
  }
  
  extension [Self <: GoogleCloudSaasacceleratorManagementProvidersV1NotificationParameter](x: Self) {
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
