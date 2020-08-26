package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InRange extends js.Object {
  var inRange: js.UndefOr[String] = js.native
  var max: js.UndefOr[String] = js.native
  var min: js.UndefOr[String] = js.native
}

object InRange {
  @scala.inline
  def apply(): InRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InRange]
  }
  @scala.inline
  implicit class InRangeOps[Self <: InRange] (val x: Self) extends AnyVal {
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
    def setInRange(value: String): Self = this.set("inRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInRange: Self = this.set("inRange", js.undefined)
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

