package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearSpringOptions extends SpringOptions {
  var restLength: js.UndefOr[Double] = js.native
}

object LinearSpringOptions {
  @scala.inline
  def apply(): LinearSpringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearSpringOptions]
  }
  @scala.inline
  implicit class LinearSpringOptionsOps[Self <: LinearSpringOptions] (val x: Self) extends AnyVal {
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
    def setRestLength(value: Double): Self = this.set("restLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestLength: Self = this.set("restLength", js.undefined)
  }
  
}

