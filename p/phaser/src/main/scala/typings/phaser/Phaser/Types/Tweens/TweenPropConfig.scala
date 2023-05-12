package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.Tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenPropConfig extends StObject {
  
  /**
    * Time in milliseconds before tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The ease function this tween uses.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Should toggleFlipX be called when yoyo or repeat happens?
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should toggleFlipY be called when yoyo or repeat happens?
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * What the property will be set to immediately when this tween becomes active.
    */
  var getActive: js.UndefOr[GetActiveCallback] = js.undefined
  
  /**
    * What the property will be at the END of the Tween.
    */
  var getEnd: js.UndefOr[GetEndCallback] = js.undefined
  
  /**
    * What the property will be at the START of the Tween.
    */
  var getStart: js.UndefOr[GetStartCallback] = js.undefined
  
  /**
    * Time in milliseconds the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    */
  var hold: js.UndefOr[Double] = js.undefined
  
  /**
    * The interpolation function to use if the `value` given is an array of numbers.
    */
  var interpolation: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in milliseconds before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * What the property will be at the END of the Tween.
    */
  var value: js.UndefOr[Double | js.Array[Double] | String | GetEndCallback | TweenPropConfig] = js.undefined
  
  /**
    * Determines whether the tween should return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}
object TweenPropConfig {
  
  inline def apply(): TweenPropConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenPropConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenPropConfig] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setGetActive(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "getActive", js.Any.fromFunction6(value))
    
    inline def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
    
    inline def setGetEnd(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "getEnd", js.Any.fromFunction6(value))
    
    inline def setGetEndUndefined: Self = StObject.set(x, "getEnd", js.undefined)
    
    inline def setGetStart(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "getStart", js.Any.fromFunction6(value))
    
    inline def setGetStartUndefined: Self = StObject.set(x, "getStart", js.undefined)
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setInterpolation(value: String | js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setValue(value: Double | js.Array[Double] | String | GetEndCallback | TweenPropConfig): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction6(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "value", js.Any.fromFunction6(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
    
    inline def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
  }
}
