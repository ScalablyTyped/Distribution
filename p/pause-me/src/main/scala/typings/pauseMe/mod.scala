package typings.pauseMe

import typings.node.timersMod.global.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * @param callback function or lambda that you want executed after duration
    * @param duration Milliseconds to set the timeout to
    * @param repeating When true the timeout is treated as an interval
    */
  inline def apply(callback: js.Function0[Unit], duration: Double): PausableTimeout = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[PausableTimeout]
  inline def apply(callback: js.Function0[Unit], duration: Double, repeating: Boolean): PausableTimeout = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], repeating.asInstanceOf[js.Any])).asInstanceOf[PausableTimeout]
  
  @JSImport("pause-me", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PausableTimeout extends StObject {
    
    def pause(): Unit
    
    def resume(): Unit
    
    def start(): Unit
    
    def stop(): Unit
    
    def timer(): Timeout | Null
  }
  object PausableTimeout {
    
    inline def apply(
      pause: () => Unit,
      resume: () => Unit,
      start: () => Unit,
      stop: () => Unit,
      timer: () => Timeout | Null
    ): PausableTimeout = {
      val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), timer = js.Any.fromFunction0(timer))
      __obj.asInstanceOf[PausableTimeout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PausableTimeout] (val x: Self) extends AnyVal {
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTimer(value: () => Timeout | Null): Self = StObject.set(x, "timer", js.Any.fromFunction0(value))
    }
  }
}
