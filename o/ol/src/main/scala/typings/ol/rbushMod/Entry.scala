package typings.ol.rbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object Entry {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): Entry = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
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
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

