package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1ObjectTrackingConfig extends StObject {
  
  /** Model to use for object tracking. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1ObjectTrackingConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1ObjectTrackingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1ObjectTrackingConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1ObjectTrackingConfigMutableBuilder[Self <: GoogleCloudVideointelligenceV1ObjectTrackingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
