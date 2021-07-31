package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1ShotChangeDetectionConfig extends StObject {
  
  /** Model to use for shot change detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1ShotChangeDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1ShotChangeDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1ShotChangeDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1ShotChangeDetectionConfigMutableBuilder[Self <: GoogleCloudVideointelligenceV1ShotChangeDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
