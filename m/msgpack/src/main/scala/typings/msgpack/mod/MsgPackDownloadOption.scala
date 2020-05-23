package typings.msgpack.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackDownloadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ XMLHttpRequest, 
      /* option */ MsgPackDownloadOption, 
      /* result */ MsgPackCallbackResult, 
      Unit
    ]
  ] = js.undefined
  var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ MsgPackDownloadOption, Unit]] = js.undefined
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[Boolean] = js.undefined
}

object MsgPackDownloadOption {
  @scala.inline
  def apply(
    after: (/* xhr */ XMLHttpRequest, /* option */ MsgPackDownloadOption, /* result */ MsgPackCallbackResult) => Unit = null,
    before: (/* xhr */ XMLHttpRequest, /* option */ MsgPackDownloadOption) => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined,
    worker: js.UndefOr[Boolean] = js.undefined
  ): MsgPackDownloadOption = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction3(after))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgPackDownloadOption]
  }
}

