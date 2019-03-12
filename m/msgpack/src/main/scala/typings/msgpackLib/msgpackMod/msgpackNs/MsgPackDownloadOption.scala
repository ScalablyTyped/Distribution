package typings
package msgpackLib.msgpackMod.msgpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackDownloadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* option */ MsgPackDownloadOption, 
      /* result */ MsgPackCallbackResult, 
      scala.Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackDownloadOption, scala.Unit]
  ] = js.undefined
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

object MsgPackDownloadOption {
  @scala.inline
  def apply(
    after: (/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackDownloadOption, /* result */ MsgPackCallbackResult) => scala.Unit = null,
    before: (/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackDownloadOption) => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    worker: js.UndefOr[scala.Boolean] = js.undefined
  ): MsgPackDownloadOption = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[MsgPackDownloadOption]
  }
}

