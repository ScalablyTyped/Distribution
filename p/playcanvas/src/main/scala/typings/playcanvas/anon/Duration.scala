package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var onEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onPause: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onPlay: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onResume: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onStop: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var pitch: js.UndefOr[Double] = js.native
  
  var startTime: js.UndefOr[Double] = js.native
  
  var volume: js.UndefOr[Double] = js.native
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    @scala.inline
    def setOnPause(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    @scala.inline
    def setOnPlay(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    @scala.inline
    def setOnResume(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onResume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    @scala.inline
    def setOnStop(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
