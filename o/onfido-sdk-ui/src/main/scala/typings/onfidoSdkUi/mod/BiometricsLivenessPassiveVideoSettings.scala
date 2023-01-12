package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiometricsLivenessPassiveVideoSettings extends StObject {
  
  var bitrate: js.UndefOr[Double] = js.undefined
  
  var codec: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var exposure_lock: js.UndefOr[Boolean] = js.undefined
  
  var focus_lock: js.UndefOr[Boolean] = js.undefined
  
  var framerate: js.UndefOr[Double] = js.undefined
  
  var white_balance_lock: js.UndefOr[Boolean] = js.undefined
}
object BiometricsLivenessPassiveVideoSettings {
  
  inline def apply(): BiometricsLivenessPassiveVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiometricsLivenessPassiveVideoSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiometricsLivenessPassiveVideoSettings] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setExposure_lock(value: Boolean): Self = StObject.set(x, "exposure_lock", value.asInstanceOf[js.Any])
    
    inline def setExposure_lockUndefined: Self = StObject.set(x, "exposure_lock", js.undefined)
    
    inline def setFocus_lock(value: Boolean): Self = StObject.set(x, "focus_lock", value.asInstanceOf[js.Any])
    
    inline def setFocus_lockUndefined: Self = StObject.set(x, "focus_lock", js.undefined)
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
    
    inline def setWhite_balance_lock(value: Boolean): Self = StObject.set(x, "white_balance_lock", value.asInstanceOf[js.Any])
    
    inline def setWhite_balance_lockUndefined: Self = StObject.set(x, "white_balance_lock", js.undefined)
  }
}
