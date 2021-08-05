package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiServiceusageV1Service extends StObject {
  
  /**
    * The service configuration of the available service. Some fields may be filtered out of the configuration in responses to the `ListServices` method. These fields are present only in
    * responses to the `GetService` method.
    */
  var config: js.UndefOr[GoogleApiServiceusageV1ServiceConfig] = js.undefined
  
  /** The resource name of the consumer and service. A valid name would be: - projects/123/services/serviceusage.googleapis.com */
  var name: js.UndefOr[String] = js.undefined
  
  /** The resource name of the consumer. A valid name would be: - projects/123 */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Whether or not the service has been enabled for use by the consumer. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleApiServiceusageV1Service {
  
  inline def apply(): GoogleApiServiceusageV1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1Service]
  }
  
  extension [Self <: GoogleApiServiceusageV1Service](x: Self) {
    
    inline def setConfig(value: GoogleApiServiceusageV1ServiceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
