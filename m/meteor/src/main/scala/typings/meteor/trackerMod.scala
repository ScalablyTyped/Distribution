package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import typings.meteor.anon.OnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackerMod {
  
  object Tracker {
    
    @JSImport("meteor/tracker", "Tracker")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Computation extends StObject {
      
      var firstRun: Boolean = js.native
      
      def invalidate(): Unit = js.native
      
      var invalidated: Boolean = js.native
      
      def onInvalidate(callback: js.Function): Unit = js.native
      
      def onStop(callback: js.Function): Unit = js.native
      
      def stop(): Unit = js.native
      
      var stopped: Boolean = js.native
    }
    object Computation {
      
      @JSImport("meteor/tracker", "Tracker.Computation")
      @js.native
      def apply(): Unit = js.native
      
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
    @JSImport("meteor/tracker", "Tracker.Dependency")
    @js.native
    def Dependency: DependencyStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("meteor/tracker", "Tracker.Dependency")
    @js.native
    class DependencyCls () extends Dependency
    
    @scala.inline
    def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/tracker", "Tracker.active")
    @js.native
    def active: Boolean = js.native
    @scala.inline
    def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/tracker", "Tracker.afterFlush")
    @js.native
    def afterFlush(callback: js.Function): Unit = js.native
    
    @JSImport("meteor/tracker", "Tracker.autorun")
    @js.native
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
    @JSImport("meteor/tracker", "Tracker.autorun")
    @js.native
    def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = js.native
    
    @JSImport("meteor/tracker", "Tracker.currentComputation")
    @js.native
    def currentComputation: Computation = js.native
    @scala.inline
    def currentComputation_=(x: Computation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentComputation")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/tracker", "Tracker.flush")
    @js.native
    def flush(): Unit = js.native
    
    @JSImport("meteor/tracker", "Tracker.nonreactive")
    @js.native
    def nonreactive[T](func: js.Function0[T]): T = js.native
    
    @JSImport("meteor/tracker", "Tracker.onInvalidate")
    @js.native
    def onInvalidate(callback: js.Function): Unit = js.native
    
    @js.native
    trait DependencyStatic extends Instantiable0[Dependency]
  }
}
