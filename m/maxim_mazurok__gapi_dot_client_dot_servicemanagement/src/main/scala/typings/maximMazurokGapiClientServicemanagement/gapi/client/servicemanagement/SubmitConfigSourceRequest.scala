package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitConfigSourceRequest extends StObject {
  
  /** Required. The source configuration for the service. */
  var configSource: js.UndefOr[ConfigSource] = js.undefined
  
  /**
    * Optional. If set, this will result in the generation of a `google.api.Service` configuration based on the `ConfigSource` provided, but the generated config and the sources will NOT
    * be persisted.
    */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object SubmitConfigSourceRequest {
  
  inline def apply(): SubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitConfigSourceRequest]
  }
  
  extension [Self <: SubmitConfigSourceRequest](x: Self) {
    
    inline def setConfigSource(value: ConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
