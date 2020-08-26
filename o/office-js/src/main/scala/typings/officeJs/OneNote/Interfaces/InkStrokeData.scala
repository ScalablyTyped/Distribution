package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkStroke.toJSON()". */
@js.native
trait InkStrokeData extends js.Object {
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkData] = js.native
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
}

object InkStrokeData {
  @scala.inline
  def apply(): InkStrokeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeData]
  }
  @scala.inline
  implicit class InkStrokeDataOps[Self <: InkStrokeData] (val x: Self) extends AnyVal {
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
    def setFloatingInk(value: FloatingInkData): Self = this.set("floatingInk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingInk: Self = this.set("floatingInk", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

