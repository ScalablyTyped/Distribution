package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var onEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onPause: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onPlay: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onResume: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onStop: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var volume: js.UndefOr[Double] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnEnd(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnPause(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnResume(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onResume", js.Any.fromFunction1(value))
    
    inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
    
    inline def setOnStop(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
