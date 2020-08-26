package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opens extends js.Object {
  var Date: String = js.native
  var Opens: Double = js.native
  var Unique: Double = js.native
}

object Opens {
  @scala.inline
  def apply(Date: String, Opens: Double, Unique: Double): Opens = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opens]
  }
  @scala.inline
  implicit class OpensOps[Self <: Opens] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpens(value: Double): Self = this.set("Opens", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique(value: Double): Self = this.set("Unique", value.asInstanceOf[js.Any])
  }
  
}

