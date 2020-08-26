package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `timelineStyle.toJSON()`. */
@js.native
trait TimelineStyleData extends js.Object {
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Specifies if this TimelineStyle object is read-only.
    *
    * [Api set: ExcelApi 1.10]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}

object TimelineStyleData {
  @scala.inline
  def apply(): TimelineStyleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleData]
  }
  @scala.inline
  implicit class TimelineStyleDataOps[Self <: TimelineStyleData] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

