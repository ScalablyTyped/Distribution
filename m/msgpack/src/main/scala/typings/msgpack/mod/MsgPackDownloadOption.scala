package typings.msgpack.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsgPackDownloadOption extends js.Object {
  var after: js.UndefOr[
    js.Function3[
      /* xhr */ XMLHttpRequest, 
      /* option */ this.type, 
      /* result */ MsgPackCallbackResult, 
      Unit
    ]
  ] = js.native
  var before: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* option */ this.type, Unit]] = js.native
  /**
    * timeout sec.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * use WebWorker if true.
    */
  var worker: js.UndefOr[Boolean] = js.native
}

object MsgPackDownloadOption {
  @scala.inline
  def apply(): MsgPackDownloadOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsgPackDownloadOption]
  }
  @scala.inline
  implicit class MsgPackDownloadOptionOps[Self <: MsgPackDownloadOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfter(
      value: (/* xhr */ XMLHttpRequest, MsgPackDownloadOption, /* result */ MsgPackCallbackResult) => Unit
    ): Self = this.set("after", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setBefore(value: (/* xhr */ XMLHttpRequest, MsgPackDownloadOption) => Unit): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWorker(value: Boolean): Self = this.set("worker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorker: Self = this.set("worker", js.undefined)
  }
  
}

