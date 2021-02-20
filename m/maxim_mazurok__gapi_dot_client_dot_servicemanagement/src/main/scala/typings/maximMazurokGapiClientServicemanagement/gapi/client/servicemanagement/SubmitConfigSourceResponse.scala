package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitConfigSourceResponse extends StObject {
  
  /** The generated service configuration. */
  var serviceConfig: js.UndefOr[Service] = js.native
}
object SubmitConfigSourceResponse {
  
  @scala.inline
  def apply(): SubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitConfigSourceResponse]
  }
  
  @scala.inline
  implicit class SubmitConfigSourceResponseMutableBuilder[Self <: SubmitConfigSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceConfig(value: Service): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigUndefined: Self = StObject.set(x, "serviceConfig", js.undefined)
  }
}
