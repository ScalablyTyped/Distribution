package typings.meteor.global

import typings.meteor.Tracker.Computation
import typings.meteor.Tracker.Dependency
import typings.meteor.Tracker.DependencyStatic
import typings.meteor.anon.OnError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tracker {
  
  @JSGlobal("Tracker")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Computation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Computation")().asInstanceOf[Unit]
  
  @JSGlobal("Tracker.Dependency")
  @js.native
  def Dependency: DependencyStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Tracker.Dependency")
  @js.native
  open class DependencyCls ()
    extends StObject
       with Dependency
  
  inline def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
  
  /**
    * True if there is a current computation, meaning that dependencies on reactive data sources will be tracked and potentially cause the current computation to be rerun.
    */
  @JSGlobal("Tracker.active")
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
  @JSGlobal("Tracker.currentComputation")
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
}
