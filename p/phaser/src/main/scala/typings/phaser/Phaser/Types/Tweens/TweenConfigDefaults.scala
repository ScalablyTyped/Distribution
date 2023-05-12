package typings.phaser.Phaser.Types.Tweens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenConfigDefaults extends StObject {
  
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String] = js.undefined
  
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.undefined
  
  /**
    * The interpolation function to use for array-based tween values.
    */
  var interpolation: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Retain the tween within the Tween Manager, even after playback completes?
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Object | js.Array[js.Object]
  
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.undefined
}
object TweenConfigDefaults {
  
  inline def apply(targets: js.Object | js.Array[js.Object]): TweenConfigDefaults = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenConfigDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenConfigDefaults] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseParams(value: js.Array[Any]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
    
    inline def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
    
    inline def setEaseParamsVarargs(value: Any*): Self = StObject.set(x, "easeParams", js.Array(value*))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setHold(value: Double): Self = StObject.set(x, "hold", value.asInstanceOf[js.Any])
    
    inline def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    inline def setInterpolation(value: js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setTargets(value: js.Object | js.Array[js.Object]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: js.Object*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
    
    inline def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
  }
}
