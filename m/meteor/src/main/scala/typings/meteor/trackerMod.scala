package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import typings.meteor.anon.OnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackerMod {
  
  /**
    * The namespace for Tracker-related methods.
    */
  object Tracker {
    
    @JSImport("meteor/tracker", "Tracker")
    @js.native
    val ^ : js.Any = js.native
    
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
      
      @JSImport("meteor/tracker", "Tracker.Computation")
      @js.native
      def apply(): Unit = js.native
      
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
    @JSImport("meteor/tracker", "Tracker.Dependency")
    @js.native
    def Dependency: DependencyStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/tracker", "Tracker.Dependency")
    @js.native
    open class DependencyCls ()
      extends StObject
         with Dependency
    
    inline def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
    
    /**
      * True if there is a current computation, meaning that dependencies on reactive data sources will be tracked and potentially cause the current computation to be rerun.
      */
    @JSImport("meteor/tracker", "Tracker.active")
    @js.native
    def active: Boolean = js.native
    inline def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    /**
      * Schedules a function to be called during the next flush, or later in the current flush if one is in progress, after all invalidated computations have been rerun.  The function will be run
      * once and not on subsequent flushes unless `afterFlush` is called again.
      * @param callback A function to call at flush time.
      */
    inline def afterFlush(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFlush")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Run a function now and rerun it later whenever its dependencies
      * change. Returns a Computation object that can be used to stop or observe the
      * rerunning.
      * @param runFunc The function to run. It receives one argument: the Computation object that will be returned.
      */
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any]).asInstanceOf[Computation]
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Computation]
    
    /**
      * The current computation, or `null` if there isn't one.  The current computation is the `Tracker.Computation` object created by the innermost active call to
      * `Tracker.autorun`, and it's the computation that gains dependencies when reactive data sources are accessed.
      */
    @JSImport("meteor/tracker", "Tracker.currentComputation")
    @js.native
    def currentComputation: Computation = js.native
    inline def currentComputation_=(x: Computation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentComputation")(x.asInstanceOf[js.Any])
    
    /**
      * Process all reactive updates immediately and ensure that all invalidated computations are rerun.
      */
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    /**
      * Run a function without tracking dependencies.
      * @param func A function to call immediately.
      */
    inline def nonreactive[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nonreactive")(func.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Registers a new `onInvalidate` callback on the current computation (which must exist), to be called immediately when the current computation is invalidated or stopped.
      * @param callback A callback function that will be invoked as `func(c)`, where `c` is the computation on which the callback is registered.
      */
    inline def onInvalidate(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInvalidate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
}
