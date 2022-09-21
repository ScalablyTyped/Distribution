package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The quadrafuzz effect divides the sound into separate bands and
  * then distorts each band independently, allowing you to control
  * which frequencies you distort and how much.
  */
trait QuadrafuzzOptions extends StObject {
  
  /** min: 0, max: 1, defaults to 0.6. */
  var highGain: js.UndefOr[Double] = js.undefined
  
  /** min: 0, max: 1, defaults to 0.6. */
  var lowGain: js.UndefOr[Double] = js.undefined
  
  /** min: 0, max: 1, defaults to 0.5. */
  var midHighGain: js.UndefOr[Double] = js.undefined
  
  /** min: 0, max: 1, defaults to 0.8. */
  var midLowGain: js.UndefOr[Double] = js.undefined
}
object QuadrafuzzOptions {
  
  inline def apply(): QuadrafuzzOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuadrafuzzOptions]
  }
  
  extension [Self <: QuadrafuzzOptions](x: Self) {
    
    inline def setHighGain(value: Double): Self = StObject.set(x, "highGain", value.asInstanceOf[js.Any])
    
    inline def setHighGainUndefined: Self = StObject.set(x, "highGain", js.undefined)
    
    inline def setLowGain(value: Double): Self = StObject.set(x, "lowGain", value.asInstanceOf[js.Any])
    
    inline def setLowGainUndefined: Self = StObject.set(x, "lowGain", js.undefined)
    
    inline def setMidHighGain(value: Double): Self = StObject.set(x, "midHighGain", value.asInstanceOf[js.Any])
    
    inline def setMidHighGainUndefined: Self = StObject.set(x, "midHighGain", js.undefined)
    
    inline def setMidLowGain(value: Double): Self = StObject.set(x, "midLowGain", value.asInstanceOf[js.Any])
    
    inline def setMidLowGainUndefined: Self = StObject.set(x, "midLowGain", js.undefined)
  }
}
