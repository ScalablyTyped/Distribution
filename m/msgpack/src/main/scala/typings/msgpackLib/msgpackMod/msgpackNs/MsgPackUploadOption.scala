package typings
package msgpackLib.msgpackMod.msgpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackUploadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ stdLib.XMLHttpRequest, 
      /* option */ MsgPackUploadOption, 
      /* result */ MsgPackCallbackResult, 
      scala.Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[
    js.Function2[/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackUploadOption, scala.Unit]
  ] = js.undefined
  /**
    * string or ByteArray
    */
  var data: js.Any
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

object MsgPackUploadOption {
  @scala.inline
  def apply(
    data: js.Any,
    after: (/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackUploadOption, /* result */ MsgPackCallbackResult) => scala.Unit = null,
    before: (/* xhr */ stdLib.XMLHttpRequest, /* option */ MsgPackUploadOption) => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    worker: js.UndefOr[scala.Boolean] = js.undefined
  ): MsgPackUploadOption = {
    val __obj = js.Dynamic.literal(data = data)
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[MsgPackUploadOption]
  }
}

