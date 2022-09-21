package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ring modulator effect combines two input signals, where one
  * of the inputs is a sine wave modulating the other.
  */
trait RingModulatorOptions extends StObject {
  
  /**
    * Level of distortion applied to the diode nodes. min: 0.2,
    * max: 50, defaults to 1.
    */
  var distortion: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume balance between the original audio and the effected
    *  output. min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
  
  /**
    * The frequency of the modulating signal. min: 0, max: 2000,
    * defaults to 30.
    */
  var speed: js.UndefOr[Double] = js.undefined
}
object RingModulatorOptions {
  
  inline def apply(): RingModulatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RingModulatorOptions]
  }
  
  extension [Self <: RingModulatorOptions](x: Self) {
    
    inline def setDistortion(value: Double): Self = StObject.set(x, "distortion", value.asInstanceOf[js.Any])
    
    inline def setDistortionUndefined: Self = StObject.set(x, "distortion", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
