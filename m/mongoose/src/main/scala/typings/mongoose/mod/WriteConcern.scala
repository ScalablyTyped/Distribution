package typings.mongoose.mod

import typings.mongoose.mongooseStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteConcern extends js.Object {
  var j: js.UndefOr[Boolean] = js.native
  var w: js.UndefOr[Double | majority | TagSet] = js.native
  var wtimeout: js.UndefOr[Double] = js.native
}

object WriteConcern {
  @scala.inline
  def apply(): WriteConcern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteConcern]
  }
  @scala.inline
  implicit class WriteConcernOps[Self <: WriteConcern] (val x: Self) extends AnyVal {
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
    def setJ(value: Boolean): Self = this.set("j", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    @scala.inline
    def setW(value: Double | majority | TagSet): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    @scala.inline
    def setWtimeout(value: Double): Self = this.set("wtimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWtimeout: Self = this.set("wtimeout", js.undefined)
  }
  
}

