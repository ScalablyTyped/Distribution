package typings.pizzicato.mod.Effects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A compressor allows reducing the range between the loudest and
  * the quietest parts of a sound. This is done by boosting the quiet
  *  segments and attenuating the loud ones.
  */
trait CompressorOptions extends StObject {
  
  /**
    * How soon the compressor starts to compress the dynamics after
    * the threshold is exceeded. Short values will result in a fast
    * response to sudden, loud sounds, but will make the changes in
    * volume more obvious to listeners. min: 0, max: 1, defaults to
    * 0.003.
    */
  var attack: js.UndefOr[Double] = js.undefined
  
  /**
    * A value representing the range above the threshold where the
    * curve smoothly transitions to the "ratio" portion.
    * min: 0, max: 40, defaults to 30.
    */
  var knee: js.UndefOr[Double] = js.undefined
  
  /**
    * Volume balance between the original audio and the effected
    * output. min: 0, max: 1, defaults to 0.5.
    */
  var mix: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of compression applied to the audio once it passes
    * the threshold level. The higher the Ratio the more the loud
    * parts of the audio will be compressed. min: 1, max: 20,
    * defaults to 12.
    */
  var ratio: js.UndefOr[Double] = js.undefined
  
  /**
    * How soon the compressor starts to release the volume level
    * back to normal after the level drops below the threshold.
    * min: 0, max: 1, defaults to 0.025.
    */
  var release: js.UndefOr[Double] = js.undefined
  
  /**
    * The decibel value above which the compression will start
    * taking effect. min: -100, max: 0, defaults to -24.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object CompressorOptions {
  
  inline def apply(): CompressorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompressorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompressorOptions] (val x: Self) extends AnyVal {
    
    inline def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setAttackUndefined: Self = StObject.set(x, "attack", js.undefined)
    
    inline def setKnee(value: Double): Self = StObject.set(x, "knee", value.asInstanceOf[js.Any])
    
    inline def setKneeUndefined: Self = StObject.set(x, "knee", js.undefined)
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setMixUndefined: Self = StObject.set(x, "mix", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
