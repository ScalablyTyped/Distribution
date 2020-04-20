package typings.node

import typings.node.NodeJS.Dict
import typings.node.NodeJS.Signals
import typings.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  encoding  :'buffer' | null} & node.child_process.ExecOptions */
trait encodingbuffernullExecOpt extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var encoding: buffer_ | Null
  var env: js.UndefOr[Dict[java.lang.String]] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}

object encodingbuffernullExecOpt {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    encoding: buffer_ = null,
    env: Dict[java.lang.String] = null,
    gid: Int | Double = null,
    killSignal: Signals | Double = null,
    maxBuffer: Int | Double = null,
    shell: java.lang.String = null,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined
  ): encodingbuffernullExecOpt = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingbuffernullExecOpt]
  }
}

