package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timers", JSImport.Namespace)
@js.native
object timersMod extends js.Object {
  def clearImmediate(immediateId: nodeLib.NodeJSNs.Immediate): scala.Unit = js.native
  def clearInterval(intervalId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def clearTimeout(timeoutId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): nodeLib.NodeJSNs.Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
  @JSName("setImmediate")
  @js.native
  object setImmediateNs extends js.Object {
    def __promisify__(): js.Promise[scala.Unit] = js.native
    def __promisify__[T](value: T): js.Promise[T] = js.native
  }
  
  @JSName("setTimeout")
  @js.native
  object setTimeoutNs extends js.Object {
    def __promisify__(ms: scala.Double): js.Promise[scala.Unit] = js.native
    def __promisify__[T](ms: scala.Double, value: T): js.Promise[T] = js.native
  }
  
}

