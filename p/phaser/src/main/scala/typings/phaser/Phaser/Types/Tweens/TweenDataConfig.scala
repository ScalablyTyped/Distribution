package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.StateType
import typings.phaser.Phaser.Tweens.Tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenDataConfig extends StObject {
  
  /**
    * The current propety value.
    */
  var current: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in milliseconds before tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration of the tween in milliseconds, excludes time for yoyo or repeats.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The ease function this tween uses.
    */
  var ease: js.Function
  
  /**
    * Delta counter
    */
  var elapsed: js.UndefOr[Double] = js.undefined
  
  /**
    * The property value at the end of the ease.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Automatically call toggleFlipX when the TweenData yoyos or repeats
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically call toggleFlipY when the TweenData yoyos or repeats
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * LoadValue generation functions.
    */
  var gen: js.UndefOr[TweenDataGenConfig] = js.undefined
  
  /**
    * If not null, is invoked _immediately_ as soon as the TweenData is running, and is set on the target property.
    */
  var getActiveValue: GetActiveCallback | Null
  
  /**
    * The returned value sets what the property will be at the END of the Tween.
    */
  def getEndValue(target: Any, key: String, value: Double, targetIndex: Double, totalTargets: Double, tween: Tween): Double
  /**
    * The returned value sets what the property will be at the END of the Tween.
    */
  @JSName("getEndValue")
  var getEndValue_Original: GetEndCallback
  
  /**
    * The returned value sets what the property will be at the START of the Tween.
    */
  def getStartValue(target: Any, key: String, value: Double, targetIndex: Double, totalTargets: Double, tween: Tween): Double
  /**
    * The returned value sets what the property will be at the START of the Tween.
    */
  @JSName("getStartValue")
  var getStartValue_Original: GetStartCallback
  
  /**
    * Time in milliseconds the tween will pause before running the yoyo or starting a repeat.
    */
  var hold: js.UndefOr[Double] = js.undefined
  
  /**
    * The target index within the Tween targets array.
    */
  var index: Double
  
  /**
    * The property of the target being tweened.
    */
  var key: String
  
  /**
    * The previous property value.
    */
  var previous: js.UndefOr[Double] = js.undefined
  
  /**
    * Between 0 and 1 showing completion of this TweenData.
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    * How many repeats are left to run?
    */
  var repeatCounter: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in milliseconds before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The property value at the start of the ease.
    */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
    * TWEEN_CONST.CREATED
    */
  var state: js.UndefOr[StateType] = js.undefined
  
  /**
    * The target to tween.
    */
  var target: Any
  
  /**
    * The total calculated duration of this TweenData (based on duration, repeat, delay and yoyo)
    */
  var totalDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Cause the tween to return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}
object TweenDataConfig {
  
  inline def apply(
    ease: js.Function,
    getEndValue: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double,
    getStartValue: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double,
    index: Double,
    key: String,
    target: Any
  ): TweenDataConfig = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any], getEndValue = js.Any.fromFunction6(getEndValue), getStartValue = js.Any.fromFunction6(getStartValue), index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], getActiveValue = null)
    __obj.asInstanceOf[TweenDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenDataConfig] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setGen(value: TweenDataGenConfig): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setGenUndefined: Self = StObject.set(x, "gen", js.undefined)
    
    inline def setGetActiveValue(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "getActiveValue", js.Any.fromFunction6(value))
    
    inline def setGetActiveValueNull: Self = StObject.set(x, "getActiveValue", null)
    
    inline def setGetEndValue(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "getEndValue", js.Any.fromFunction6(value))
    
    inline def setGetStartValue(
      value: (/* target */ Any, /* key */ String, /* value */ Double, /* targetIndex */ Double, /* totalTargets */ Double, /* tween */ Tween) => Double
    ): Self = StObject.set(x, "getStartValue", js.Any.fromFunction6(value))
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatCounter(value: Double): Self = StObject.set(x, "repeatCounter", value.asInstanceOf[js.Any])
    
    inline def setRepeatCounterUndefined: Self = StObject.set(x, "repeatCounter", js.undefined)
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setState(value: StateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
    
    inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
    
    inline def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
  }
}
