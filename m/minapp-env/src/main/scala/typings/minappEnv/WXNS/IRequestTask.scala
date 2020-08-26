package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestTask extends js.Object {
  def abort(): Unit = js.native
}

object IRequestTask {
  @scala.inline
  def apply(abort: () => Unit): IRequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
    __obj.asInstanceOf[IRequestTask]
  }
  @scala.inline
  implicit class IRequestTaskOps[Self <: IRequestTask] (val x: Self) extends AnyVal {
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
  }
  
}

