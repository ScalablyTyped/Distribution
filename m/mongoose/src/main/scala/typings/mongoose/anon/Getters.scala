package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Getters extends js.Object {
  var getters: js.UndefOr[Boolean] = js.native
  var virtuals: js.UndefOr[Boolean] = js.native
}

object Getters {
  @scala.inline
  def apply(): Getters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Getters]
  }
  @scala.inline
  implicit class GettersOps[Self <: Getters] (val x: Self) extends AnyVal {
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
    def setGetters(value: Boolean): Self = this.set("getters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    @scala.inline
    def setVirtuals(value: Boolean): Self = this.set("virtuals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtuals: Self = this.set("virtuals", js.undefined)
  }
  
}

