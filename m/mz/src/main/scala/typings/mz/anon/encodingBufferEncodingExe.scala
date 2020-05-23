package typings.mz.anon

import typings.node.BufferEncoding
import typings.node.NodeJS.ProcessEnv
import typings.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  encoding ? :node.BufferEncoding} & node.child_process.ExecOptions */
trait encodingBufferEncodingExe extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  var maxBuffer: js.UndefOr[Double] = js.undefined
  var shell: js.UndefOr[String] = js.undefined
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

object encodingBufferEncodingExe {
  @scala.inline
  def apply(
    cwd: String = null,
    encoding: BufferEncoding = null,
    env: ProcessEnv = null,
    gid: js.UndefOr[Double] = js.undefined,
    killSignal: Signals | Double = null,
    maxBuffer: js.UndefOr[Double] = js.undefined,
    shell: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined,
    windowsHide: js.UndefOr[Boolean] = js.undefined
  ): encodingBufferEncodingExe = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBuffer)) __obj.updateDynamic("maxBuffer")(maxBuffer.get.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodingBufferEncodingExe]
  }
}

