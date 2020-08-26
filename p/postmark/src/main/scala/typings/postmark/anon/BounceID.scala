package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceID extends js.Object {
  var BounceID: Double = js.native
  var Summary: String = js.native
}

object BounceID {
  @scala.inline
  def apply(BounceID: Double, Summary: String): BounceID = {
    val __obj = js.Dynamic.literal(BounceID = BounceID.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceID]
  }
  @scala.inline
  implicit class BounceIDOps[Self <: BounceID] (val x: Self) extends AnyVal {
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
    def setBounceID(value: Double): Self = this.set("BounceID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("Summary", value.asInstanceOf[js.Any])
  }
  
}

