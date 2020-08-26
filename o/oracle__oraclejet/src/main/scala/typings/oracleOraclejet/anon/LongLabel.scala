package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongLabel extends js.Object {
  var id: String = js.native
  var longLabel: js.UndefOr[String] = js.native
  var shortLabel: js.UndefOr[String] = js.native
}

object LongLabel {
  @scala.inline
  def apply(id: String): LongLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongLabel]
  }
  @scala.inline
  implicit class LongLabelOps[Self <: LongLabel] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongLabel(value: String): Self = this.set("longLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongLabel: Self = this.set("longLabel", js.undefined)
    @scala.inline
    def setShortLabel(value: String): Self = this.set("shortLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortLabel: Self = this.set("shortLabel", js.undefined)
  }
  
}

