package typings.phaser.Phaser.Types.Tweens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenCallbacks extends StObject {
  
  /**
    * A function to call when the tween becomes active within the Tween Manager.
    */
  var onActive: js.UndefOr[TweenOnActiveCallback] = js.undefined
  
  /**
    * A function to call when the tween completes.
    */
  var onComplete: js.UndefOr[TweenOnCompleteCallback] = js.undefined
  
  /**
    * A function to call each time the tween loops.
    */
  var onLoop: js.UndefOr[TweenOnLoopCallback] = js.undefined
  
  /**
    * A function to call each time the tween is paused.
    */
  var onPause: js.UndefOr[TweenOnPauseCallback] = js.undefined
  
  /**
    * A function to call each time the tween repeats. Called once per property per target.
    */
  var onRepeat: js.UndefOr[TweenOnRepeatCallback] = js.undefined
  
  /**
    * A function to call each time the tween is resumed.
    */
  var onResume: js.UndefOr[TweenOnResumeCallback] = js.undefined
  
  /**
    * A function to call when the tween starts playback, after any delays have expired.
    */
  var onStart: js.UndefOr[TweenOnStartCallback] = js.undefined
  
  /**
    * A function to call when the tween is stopped.
    */
  var onStop: js.UndefOr[TweenOnStopCallback] = js.undefined
  
  /**
    * A function to call each time the tween steps. Called once per property per target.
    */
  var onUpdate: js.UndefOr[TweenOnUpdateCallback] = js.undefined
  
  /**
    * A function to call each time the tween yoyos. Called once per property per target.
    */
  var onYoyo: js.UndefOr[TweenOnYoyoCallback] = js.undefined
}
object TweenCallbacks {
  
  inline def apply(): TweenCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TweenCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnActive(value: TweenOnActiveCallback): Self = StObject.set(x, "onActive", value.asInstanceOf[js.Any])
    
    inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    inline def setOnComplete(value: TweenOnCompleteCallback): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnLoop(value: TweenOnLoopCallback): Self = StObject.set(x, "onLoop", value.asInstanceOf[js.Any])
    
    inline def setOnLoopUndefined: Self = StObject.set(x, "onLoop", js.undefined)
    
    inline def setOnPause(value: TweenOnPauseCallback): Self = StObject.set(x, "onPause", value.asInstanceOf[js.Any])
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnRepeat(value: TweenOnRepeatCallback): Self = StObject.set(x, "onRepeat", value.asInstanceOf[js.Any])
    
    inline def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
    
    inline def setOnResume(value: TweenOnResumeCallback): Self = StObject.set(x, "onResume", value.asInstanceOf[js.Any])
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStart(value: TweenOnStartCallback): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnStop(value: TweenOnStopCallback): Self = StObject.set(x, "onStop", value.asInstanceOf[js.Any])
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setOnUpdate(value: TweenOnUpdateCallback): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setOnYoyo(value: TweenOnYoyoCallback): Self = StObject.set(x, "onYoyo", value.asInstanceOf[js.Any])
    
    inline def setOnYoyoUndefined: Self = StObject.set(x, "onYoyo", js.undefined)
  }
}
