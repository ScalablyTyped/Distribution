package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitConfigSourceRequest extends StObject {
  
  /** Required. The source configuration for the service. */
  var configSource: js.UndefOr[ConfigSource] = js.native
  
  /**
    * Optional. If set, this will result in the generation of a `google.api.Service` configuration based on the `ConfigSource` provided, but the generated config and the sources will NOT
    * be persisted.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object SubmitConfigSourceRequest {
  
  @scala.inline
  def apply(): SubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitConfigSourceRequest]
  }
  
  @scala.inline
  implicit class SubmitConfigSourceRequestMutableBuilder[Self <: SubmitConfigSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigSource(value: ConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
