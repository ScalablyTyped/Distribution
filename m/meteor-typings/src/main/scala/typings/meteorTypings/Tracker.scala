package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tracker {
  
  trait Computation extends StObject {
    
    var firstRun: Boolean
    
    def invalidate(): Unit
    
    var invalidated: Boolean
    
    def onInvalidate(callback: js.Function): Unit
    
    def onStop(callback: js.Function): Unit
    
    def stop(): Unit
    
    var stopped: Boolean
  }
  object Computation {
    
    @scala.inline
    def apply(
      firstRun: Boolean,
      invalidate: () => Unit,
      invalidated: Boolean,
      onInvalidate: js.Function => Unit,
      onStop: js.Function => Unit,
      stop: () => Unit,
      stopped: Boolean
    ): Computation = {
      val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], invalidate = js.Any.fromFunction0(invalidate), invalidated = invalidated.asInstanceOf[js.Any], onInvalidate = js.Any.fromFunction1(onInvalidate), onStop = js.Any.fromFunction1(onStop), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computation]
    }
    
    @scala.inline
    implicit class ComputationMutableBuilder[Self <: Computation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstRun(value: Boolean): Self = StObject.set(x, "firstRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvalidated(value: Boolean): Self = StObject.set(x, "invalidated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnInvalidate(value: js.Function => Unit): Self = StObject.set(x, "onInvalidate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStop(value: js.Function => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dependency extends StObject {
    
    def changed(): Unit = js.native
    
    def depend(): Boolean = js.native
    def depend(fromComputation: Computation): Boolean = js.native
    
    def hasDependents(): Boolean = js.native
  }
  
  @js.native
  trait DependencyStatic
    extends StObject
       with Instantiable0[Dependency]
}
