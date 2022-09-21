package typings.pizzicato.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundOptions extends StObject {
  
  /**
    * Value in seconds that indicates the fade-in time when the sound
    * is played. Defaults to 0.04.
    */
  var attack: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, the sound will not be connected to the context's
    * destination, and thus, will not be audible. Defaults to false.
    */
  var detached: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value in seconds that indicates the fade-out time once the sound
    * is stopped. Min: 0, Max: 1, Default: 1.
    */
  var release: js.UndefOr[Double] = js.undefined
  
  /** Loudness of the sound. Min: 0, Max: 1, Default: 1 */
  var volume: js.UndefOr[Double] = js.undefined
}
object SoundOptions {
  
  inline def apply(): SoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundOptions]
  }
  
  extension [Self <: SoundOptions](x: Self) {
    
    inline def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setAttackUndefined: Self = StObject.set(x, "attack", js.undefined)
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
