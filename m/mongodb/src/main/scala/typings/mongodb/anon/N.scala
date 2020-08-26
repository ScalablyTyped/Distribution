package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N extends js.Object {
  //The total count of documents deleted.
  var n: js.UndefOr[Double] = js.native
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[Double] = js.native
}

object N {
  @scala.inline
  def apply(): N = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[N]
  }
  @scala.inline
  implicit class NOps[Self <: N] (val x: Self) extends AnyVal {
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
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setOk(value: Double): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
  }
  
}

