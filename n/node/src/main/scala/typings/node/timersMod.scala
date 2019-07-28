package typings.node

import typings.node.NodeJSNs.Immediate
import typings.node.NodeJSNs.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timers", JSImport.Namespace)
@js.native
object timersMod extends js.Object {
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  @JSName("setImmediate")
  @js.native
  object setImmediateNs extends js.Object {
    def __promisify__(): js.Promise[Unit] = js.native
    def __promisify__[T](value: T): js.Promise[T] = js.native
  }
  
  @JSName("setTimeout")
  @js.native
  object setTimeoutNs extends js.Object {
    def __promisify__(ms: Double): js.Promise[Unit] = js.native
    def __promisify__[T](ms: Double, value: T): js.Promise[T] = js.native
  }
  
}

