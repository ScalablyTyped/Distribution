package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A high-pass filter attenuates signals with a frequency lower than
  * a pre-determined cutoff frequency and passes signals with
  * frequencies higher than the cutoff frequency.
  */
trait HighPassFilterOptions extends StObject {
  
  /**
    * The cutoff frequency of the high-pass filter. min: 10,
    * max: 22050, defaults to 350.
    */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates how peaked the frequency is around the cutoff
    * frequency. The greater the value is, the greater is the peak.
    * min: 0.0001, max: 1000, defaults to 1.
    */
  var peak: js.UndefOr[Double] = js.undefined
}
object HighPassFilterOptions {
  
  inline def apply(): HighPassFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighPassFilterOptions]
  }
  
  extension [Self <: HighPassFilterOptions](x: Self) {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setPeak(value: Double): Self = StObject.set(x, "peak", value.asInstanceOf[js.Any])
    
    inline def setPeakUndefined: Self = StObject.set(x, "peak", js.undefined)
  }
}
