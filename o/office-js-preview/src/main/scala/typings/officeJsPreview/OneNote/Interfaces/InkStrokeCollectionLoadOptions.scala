package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of InkStroke objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkStrokeCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkStroke object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
}

object InkStrokeCollectionLoadOptions {
  @scala.inline
  def apply(): InkStrokeCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeCollectionLoadOptions]
  }
  @scala.inline
  implicit class InkStrokeCollectionLoadOptionsOps[Self <: InkStrokeCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setFloatingInk(value: FloatingInkLoadOptions): Self = this.set("floatingInk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingInk: Self = this.set("floatingInk", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

