package typings.node

import typings.node.NodeJS.Immediate
import typings.node.NodeJS.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timers", JSImport.Namespace)
@js.native
object timersMod extends js.Object {
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  @js.native
  object setImmediate extends js.Object {
    def apply(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
    @JSName("__promisify__")
    def promisify(): js.Promise[Unit] = js.native
    @JSName("__promisify__")
    def promisify[T](value: T): js.Promise[T] = js.native
  }
  
  @js.native
  object setTimeout extends js.Object {
    def apply(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
    @JSName("__promisify__")
    def promisify(ms: Double): js.Promise[Unit] = js.native
    @JSName("__promisify__")
    def promisify[T](ms: Double, value: T): js.Promise[T] = js.native
  }
  
}

