package typings.mobx

import typings.std.AsyncGenerator
import typings.std.Error
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  object FlowCancellationError {
    
    @JSImport("mobx/lib/api/flow", "FlowCancellationError")
    @js.native
    def apply(): Unit = js.native
    @JSImport("mobx/lib/api/flow", "FlowCancellationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mobx/lib/api/flow", "FlowCancellationError.prototype")
    @js.native
    def prototype: js.Any = js.native
    @scala.inline
    def prototype_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mobx/lib/api/flow", "flow")
  @js.native
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
  
  @JSImport("mobx/lib/api/flow", "isFlowCancellationError")
  @js.native
  def isFlowCancellationError(error: Error): Boolean = js.native
  
  /* Inlined std.Promise<T> & {cancel (): void} */
  @js.native
  trait CancellablePromise[T] extends StObject {
    
    def cancel(): Unit = js.native
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TResult](): js.Promise[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[T | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(): js.Promise[T] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
}
