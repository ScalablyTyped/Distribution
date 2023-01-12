package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tracker {
  
  /**
    * A Computation object represents code that is repeatedly rerun
    * in response to
    * reactive data changes. Computations don't have return values; they just
    * perform actions, such as rerendering a template on the screen. Computations
    * are created using Tracker.autorun. Use stop to prevent further rerunning of a
    * computation.
    */
  trait Computation extends StObject {
    
    /**
      * True during the initial run of the computation at the time `Tracker.autorun` is called, and false on subsequent reruns and at other times.
      */
    var firstRun: Boolean
    
    /**
      * Invalidates this computation so that it will be rerun.
      */
    def invalidate(): Unit
    
    /**
      * True if this computation has been invalidated (and not yet rerun), or if it has been stopped.
      */
    var invalidated: Boolean
    
    /**
      * Registers `callback` to run when this computation is next invalidated, or runs it immediately if the computation is already invalidated.  The callback is run exactly once and not upon
      * future invalidations unless `onInvalidate` is called again after the computation becomes valid again.
      * @param callback Function to be called on invalidation. Receives one argument, the computation that was invalidated.
      */
    def onInvalidate(callback: js.Function): Unit
    
    /**
      * Registers `callback` to run when this computation is stopped, or runs it immediately if the computation is already stopped.  The callback is run after any `onInvalidate` callbacks.
      * @param callback Function to be called on stop. Receives one argument, the computation that was stopped.
      */
    def onStop(callback: js.Function): Unit
    
    /**
      * Prevents this computation from rerunning.
      */
    def stop(): Unit
    
    /**
      * True if this computation has been stopped.
      */
    var stopped: Boolean
  }
  object Computation {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: Computation] (val x: Self) extends AnyVal {
      
      inline def setFirstRun(value: Boolean): Self = StObject.set(x, "firstRun", value.asInstanceOf[js.Any])
      
      inline def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
      
      inline def setInvalidated(value: Boolean): Self = StObject.set(x, "invalidated", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidate(value: js.Function => Unit): Self = StObject.set(x, "onInvalidate", js.Any.fromFunction1(value))
      
      inline def setOnStop(value: js.Function => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction1(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dependency extends StObject {
    
    /**
      * Invalidate all dependent computations immediately and remove them as dependents.
      */
    def changed(): Unit = js.native
    
    /**
      * Declares that the current computation (or `fromComputation` if given) depends on `dependency`.  The computation will be invalidated the next time `dependency` changes.
      * If there is no current computation and `depend()` is called with no arguments, it does nothing and returns false.
      * Returns true if the computation is a new dependent of `dependency` rather than an existing one.
      * @param fromComputation An optional computation declared to depend on `dependency` instead of the current computation.
      */
    def depend(): Boolean = js.native
    def depend(fromComputation: Computation): Boolean = js.native
    
    /**
      * True if this Dependency has one or more dependent Computations, which would be invalidated if this Dependency were to change.
      */
    def hasDependents(): Boolean = js.native
  }
  
  /**
    * A Dependency represents an atomic unit of reactive data that a
    * computation might depend on. Reactive data sources such as Session or
    * Minimongo internally create different Dependency objects for different
    * pieces of data, each of which may be depended on by multiple computations.
    * When the data changes, the computations are invalidated.
    */
  @js.native
  trait DependencyStatic
    extends StObject
       with Instantiable0[Dependency]
}
