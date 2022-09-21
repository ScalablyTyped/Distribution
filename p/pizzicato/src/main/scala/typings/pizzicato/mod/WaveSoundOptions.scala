package typings.pizzicato.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaveSoundOptions
  extends StObject
     with SoundOptions {
  
  /** The frequency of the wave. Defaults to 440, which is an A note. */
  var frequency: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[WaveType] = js.undefined
}
object WaveSoundOptions {
  
  inline def apply(): WaveSoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveSoundOptions]
  }
  
  extension [Self <: WaveSoundOptions](x: Self) {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setType(value: WaveType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
