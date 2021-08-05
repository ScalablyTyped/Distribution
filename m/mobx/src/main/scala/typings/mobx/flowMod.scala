package typings.mobx

import typings.std.AsyncGenerator
import typings.std.Error
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  @JSImport("mobx/lib/api/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FlowCancellationError {
    
    inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
    
    @JSImport("mobx/lib/api/flow", "FlowCancellationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/api/flow", "FlowCancellationError.prototype")
    @js.native
    def prototype: js.Any = js.native
    inline def prototype_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  inline def flow[R, Args /* <: js.Array[js.Any] */](
    generator: js.Function1[
      /* args */ Args, 
      (Generator[js.Any, R, js.Any]) | (AsyncGenerator[js.Any, R, js.Any])
    ]
  ): js.Function1[/* args */ Args, CancellablePromise[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flow")(generator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, CancellablePromise[R]]]
  
  inline def isFlowCancellationError(error: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowCancellationError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait CancellablePromise[T]
    extends js.Promise[T] {
    
    def cancel(): Unit = js.native
  }
}
