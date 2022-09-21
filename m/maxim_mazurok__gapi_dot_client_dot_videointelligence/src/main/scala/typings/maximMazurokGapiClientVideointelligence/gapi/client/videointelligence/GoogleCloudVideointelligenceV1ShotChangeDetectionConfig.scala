package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1ShotChangeDetectionConfig extends StObject {
  
  /** Model to use for shot change detection. Supported values: "builtin/stable" (the default if unset), "builtin/latest", and "builtin/legacy". */
  var model: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1ShotChangeDetectionConfig {
  
  inline def apply(): GoogleCloudVideointelligenceV1ShotChangeDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1ShotChangeDetectionConfig]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1ShotChangeDetectionConfig](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
