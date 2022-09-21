package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITrackEntry extends StObject {
  
  var alpha: Double
  
  var animationEnd: Double
  
  var delay: Double
  
  var interruptAlpha: Double
  
  var listener: IAnimationStateListener
  
  var loop: Boolean
  
  var mixDuration: Double
  
  var mixTime: Double
  
  var nextTrackLast: Double
  
  var timeScale: Double
  
  var totalAlpha: Double
  
  var trackEnd: Double
  
  var trackIndex: Double
  
  var trackLast: Double
  
  var trackTime: Double
}
object ITrackEntry {
  
  inline def apply(
    alpha: Double,
    animationEnd: Double,
    delay: Double,
    interruptAlpha: Double,
    listener: IAnimationStateListener,
    loop: Boolean,
    mixDuration: Double,
    mixTime: Double,
    nextTrackLast: Double,
    timeScale: Double,
    totalAlpha: Double,
    trackEnd: Double,
    trackIndex: Double,
    trackLast: Double,
    trackTime: Double
  ): ITrackEntry = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animationEnd = animationEnd.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], interruptAlpha = interruptAlpha.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], mixDuration = mixDuration.asInstanceOf[js.Any], mixTime = mixTime.asInstanceOf[js.Any], nextTrackLast = nextTrackLast.asInstanceOf[js.Any], timeScale = timeScale.asInstanceOf[js.Any], totalAlpha = totalAlpha.asInstanceOf[js.Any], trackEnd = trackEnd.asInstanceOf[js.Any], trackIndex = trackIndex.asInstanceOf[js.Any], trackLast = trackLast.asInstanceOf[js.Any], trackTime = trackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrackEntry]
  }
  
  extension [Self <: ITrackEntry](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAnimationEnd(value: Double): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setInterruptAlpha(value: Double): Self = StObject.set(x, "interruptAlpha", value.asInstanceOf[js.Any])
    
    inline def setListener(value: IAnimationStateListener): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMixDuration(value: Double): Self = StObject.set(x, "mixDuration", value.asInstanceOf[js.Any])
    
    inline def setMixTime(value: Double): Self = StObject.set(x, "mixTime", value.asInstanceOf[js.Any])
    
    inline def setNextTrackLast(value: Double): Self = StObject.set(x, "nextTrackLast", value.asInstanceOf[js.Any])
    
    inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
    
    inline def setTotalAlpha(value: Double): Self = StObject.set(x, "totalAlpha", value.asInstanceOf[js.Any])
    
    inline def setTrackEnd(value: Double): Self = StObject.set(x, "trackEnd", value.asInstanceOf[js.Any])
    
    inline def setTrackIndex(value: Double): Self = StObject.set(x, "trackIndex", value.asInstanceOf[js.Any])
    
    inline def setTrackLast(value: Double): Self = StObject.set(x, "trackLast", value.asInstanceOf[js.Any])
    
    inline def setTrackTime(value: Double): Self = StObject.set(x, "trackTime", value.asInstanceOf[js.Any])
  }
}
