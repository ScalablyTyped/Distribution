package typings.ngprogress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NgProgress {
  
  trait INgProgress extends StObject {
    
    def color(color: String): Unit
    
    def complete(): Unit
    
    def height(height: String): Unit
    
    def reset(): Unit
    
    def set(value: Double): Unit
    
    def start(): Unit
    
    def status(): Double
    
    def stop(): Unit
  }
  object INgProgress {
    
    @scala.inline
    def apply(
      color: String => Unit,
      complete: () => Unit,
      height: String => Unit,
      reset: () => Unit,
      set: Double => Unit,
      start: () => Unit,
      status: () => Double,
      stop: () => Unit
    ): INgProgress = {
      val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color), complete = js.Any.fromFunction0(complete), height = js.Any.fromFunction1(height), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[INgProgress]
    }
    
    @scala.inline
    implicit class INgProgressMutableBuilder[Self <: INgProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String => Unit): Self = StObject.set(x, "color", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeight(value: String => Unit): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStatus(value: () => Double): Self = StObject.set(x, "status", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait INgProgressFactory extends StObject {
    
    def createInstance(): INgProgress
  }
  object INgProgressFactory {
    
    @scala.inline
    def apply(createInstance: () => INgProgress): INgProgressFactory = {
      val __obj = js.Dynamic.literal(createInstance = js.Any.fromFunction0(createInstance))
      __obj.asInstanceOf[INgProgressFactory]
    }
    
    @scala.inline
    implicit class INgProgressFactoryMutableBuilder[Self <: INgProgressFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateInstance(value: () => INgProgress): Self = StObject.set(x, "createInstance", js.Any.fromFunction0(value))
    }
  }
}
