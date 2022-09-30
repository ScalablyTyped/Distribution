package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiometricsLivenessActiveVideoSettings extends StObject {
  
  var bitrate: js.UndefOr[Double] = js.undefined
  
  var codec: js.UndefOr[String] = js.undefined
  
  var codec_profile: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var exposure_lock: js.UndefOr[Boolean] = js.undefined
  
  var focusLock: js.UndefOr[Boolean] = js.undefined
  
  var framerate: js.UndefOr[Double] = js.undefined
  
  var white_balanceLock: js.UndefOr[Boolean] = js.undefined
}
object BiometricsLivenessActiveVideoSettings {
  
  inline def apply(): BiometricsLivenessActiveVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiometricsLivenessActiveVideoSettings]
  }
  
  extension [Self <: BiometricsLivenessActiveVideoSettings](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setCodec_profile(value: Double): Self = StObject.set(x, "codec_profile", value.asInstanceOf[js.Any])
    
    inline def setCodec_profileUndefined: Self = StObject.set(x, "codec_profile", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExposure_lock(value: Boolean): Self = StObject.set(x, "exposure_lock", value.asInstanceOf[js.Any])
    
    inline def setExposure_lockUndefined: Self = StObject.set(x, "exposure_lock", js.undefined)
    
    inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
    
    inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
    
    inline def setWhite_balanceLock(value: Boolean): Self = StObject.set(x, "white_balanceLock", value.asInstanceOf[js.Any])
    
    inline def setWhite_balanceLockUndefined: Self = StObject.set(x, "white_balanceLock", js.undefined)
  }
}
