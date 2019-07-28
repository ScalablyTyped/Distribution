package typings.node

import typings.node.NodeJSNs.Global
import typings.node.NodeJSNs.Immediate
import typings.node.NodeJSNs.Process
import typings.node.NodeJSNs.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var __dirname: java.lang.String = js.native
  var __filename: java.lang.String = js.native
  var console: Console = js.native
  // Same as module.exports
  var exports: js.Any = js.native
  var global: Global = js.native
  var module: NodeModule = js.native
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  var process: Process = js.native
  var require: NodeRequire = js.native
  def clearImmediate(immediateId: Immediate): Unit = js.native
  def clearInterval(intervalId: Timeout): Unit = js.native
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  /**
    * @experimental
    */
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
}

