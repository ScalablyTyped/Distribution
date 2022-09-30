package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiometricsLivenessActive extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var video_settings: js.UndefOr[BiometricsLivenessActiveVideoSettings] = js.undefined
}
object BiometricsLivenessActive {
  
  inline def apply(): BiometricsLivenessActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiometricsLivenessActive]
  }
  
  extension [Self <: BiometricsLivenessActive](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setVideo_settings(value: BiometricsLivenessActiveVideoSettings): Self = StObject.set(x, "video_settings", value.asInstanceOf[js.Any])
    
    inline def setVideo_settingsUndefined: Self = StObject.set(x, "video_settings", js.undefined)
  }
}
