package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitConfigSourceResponse extends StObject {
  
  /** The generated service configuration. */
  var serviceConfig: js.UndefOr[Service] = js.undefined
}
object SubmitConfigSourceResponse {
  
  inline def apply(): SubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitConfigSourceResponse]
  }
  
  extension [Self <: SubmitConfigSourceResponse](x: Self) {
    
    inline def setServiceConfig(value: Service): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigUndefined: Self = StObject.set(x, "serviceConfig", js.undefined)
  }
}
