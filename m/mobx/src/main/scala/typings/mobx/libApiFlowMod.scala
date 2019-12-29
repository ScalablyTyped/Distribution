package typings.mobx

import typings.std.AsyncGenerator
import typings.std.Error
import typings.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/flow", JSImport.Namespace)
@js.native
object libApiFlowMod extends js.Object {
  def flow[R, Args /* <: js.Array[_] */](generator: js.Function1[/* args */ Args, (Generator[_, R, _]) | (AsyncGenerator[_, R, _])]): js.Function1[/* args */ Args, CancellablePromise[R]] = js.native
  def isFlowCancellationError(error: Error): Boolean = js.native
  @js.native
  object FlowCancellationError extends js.Object {
    var prototype: js.Any = js.native
    def apply(): Unit = js.native
  }
  
  type CancellablePromise[T] = js.Promise[T] with Anon_Cancel
}

