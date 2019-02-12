package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var __dirname: java.lang.String = js.native
  var __filename: java.lang.String = js.native
  var console: nodeLib.Console = js.native
  // Same as module.exports
  var exports: js.Any = js.native
  var global: nodeLib.NodeJSNs.Global = js.native
  var module: nodeLib.NodeModule = js.native
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  var process: nodeLib.NodeJSNs.Process = js.native
  var require: nodeLib.NodeRequire = js.native
  def clearImmediate(immediateId: nodeLib.NodeJSNs.Immediate): scala.Unit = js.native
  def clearInterval(intervalId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  def clearTimeout(timeoutId: nodeLib.NodeJSNs.Timeout): scala.Unit = js.native
  /**
    * @experimental
    */
  def queueMicrotask(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setImmediate(callback: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): nodeLib.NodeJSNs.Immediate = js.native
  def setInterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
  def setTimeout(callback: js.Function1[/* repeated */ js.Any, scala.Unit], ms: scala.Double, args: js.Any*): nodeLib.NodeJSNs.Timeout = js.native
}

