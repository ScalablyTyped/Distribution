package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeLimit extends js.Object {
  var sizeLimit: js.UndefOr[Double | String] = js.native
}

object SizeLimit {
  @scala.inline
  def apply(): SizeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeLimit]
  }
  @scala.inline
  implicit class SizeLimitOps[Self <: SizeLimit] (val x: Self) extends AnyVal {
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
    def setSizeLimit(value: Double | String): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLimit: Self = this.set("sizeLimit", js.undefined)
  }
  
}

