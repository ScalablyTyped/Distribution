package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.StateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenFrameDataConfig extends StObject {
  
  /**
    * Time in milliseconds before tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * Duration of the tween in milliseconds, excludes time for yoyo or repeats.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Delta counter
    */
  var elapsed: js.UndefOr[Double] = js.undefined
  
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
}
object TweenFrameDataConfig {
  
  inline def apply(index: Double, key: String, target: Any): TweenFrameDataConfig = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenFrameDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenFrameDataConfig] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setElapsedUndefined: Self = StObject.set(x, "elapsed", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setGen(value: TweenDataGenConfig): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setGenUndefined: Self = StObject.set(x, "gen", js.undefined)
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatCounter(value: Double): Self = StObject.set(x, "repeatCounter", value.asInstanceOf[js.Any])
    
    inline def setRepeatCounterUndefined: Self = StObject.set(x, "repeatCounter", js.undefined)
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setState(value: StateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTotalDuration(value: Double): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
    
    inline def setTotalDurationUndefined: Self = StObject.set(x, "totalDuration", js.undefined)
  }
}
