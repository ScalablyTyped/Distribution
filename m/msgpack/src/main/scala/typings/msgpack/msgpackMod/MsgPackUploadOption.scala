package typings.msgpack.msgpackMod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackUploadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ XMLHttpRequest, 
      /* option */ MsgPackUploadOption, 
      /* result */ MsgPackCallbackResult, 
      Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ MsgPackUploadOption, Unit]] = js.undefined
  /**
    * string or ByteArray
    */
  var data: js.Any
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}

object MsgPackUploadOption {
  @scala.inline
  def apply(
    data: js.Any,
    after: (/* xhr */ XMLHttpRequest, /* option */ MsgPackUploadOption, /* result */ MsgPackCallbackResult) => Unit = null,
    before: (/* xhr */ XMLHttpRequest, /* option */ MsgPackUploadOption) => Unit = null,
    timeout: Int | Double = null,
    worker: js.UndefOr[Boolean] = js.undefined
  ): MsgPackUploadOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgPackUploadOption]
  }
}

