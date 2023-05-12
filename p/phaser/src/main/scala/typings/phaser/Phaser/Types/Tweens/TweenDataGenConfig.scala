package typings.phaser.Phaser.Types.Tweens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenDataGenConfig extends StObject {
  
  /**
    * Time in milliseconds before tween will start.
    */
  var delay: js.Function
  
  /**
    * Duration of the tween in milliseconds, excludes time for yoyo or repeats.
    */
  var duration: js.Function
  
  /**
    * Time in milliseconds the tween will pause before running the yoyo or starting a repeat.
    */
  var hold: js.Function
  
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.Function
  
  /**
    * Time in milliseconds before the repeat will start.
    */
  var repeatDelay: js.Function
}
object TweenDataGenConfig {
  
  inline def apply(
    delay: js.Function,
    duration: js.Function,
    hold: js.Function,
    repeat: js.Function,
    repeatDelay: js.Function
  ): TweenDataGenConfig = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenDataGenConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenDataGenConfig] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: js.Function): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: js.Function): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHold(value: js.Function): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: js.Function): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: js.Function): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
  }
}
