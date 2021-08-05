package typings.meteor

import org.scalablytyped.runtime.Instantiable0
import typings.meteor.anon.OnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackerMod {
  
  object Tracker {
    
    @JSImport("meteor/tracker", "Tracker")
    @js.native
    val ^ : js.Any = js.native
    
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
      
      @JSImport("meteor/tracker", "Tracker.Computation")
      @js.native
      def apply(): Unit = js.native
      
      extension [Self <: Computation](x: Self) {
        
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
    class DependencyCls ()
      extends StObject
         with Dependency
    
    inline def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/tracker", "Tracker.active")
    @js.native
    def active: Boolean = js.native
    inline def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    inline def afterFlush(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFlush")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any]).asInstanceOf[Computation]
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Computation]
    
    @JSImport("meteor/tracker", "Tracker.currentComputation")
    @js.native
    def currentComputation: Computation = js.native
    inline def currentComputation_=(x: Computation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentComputation")(x.asInstanceOf[js.Any])
    
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    inline def nonreactive[T](func: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("nonreactive")(func.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def onInvalidate(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInvalidate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @js.native
    trait DependencyStatic
      extends StObject
         with Instantiable0[Dependency]
  }
}
