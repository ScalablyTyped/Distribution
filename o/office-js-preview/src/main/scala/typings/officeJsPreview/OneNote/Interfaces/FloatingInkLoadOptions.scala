package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a group of ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait FloatingInkLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the strokes of the FloatingInk object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[InkStrokeCollectionLoadOptions] = js.native
  /**
    *
    * Gets the PageContent parent of the FloatingInk object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.native
}

object FloatingInkLoadOptions {
  @scala.inline
  def apply(): FloatingInkLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingInkLoadOptions]
  }
  @scala.inline
  implicit class FloatingInkLoadOptionsOps[Self <: FloatingInkLoadOptions] (val x: Self) extends AnyVal {
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
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInkStrokes(value: InkStrokeCollectionLoadOptions): Self = this.set("inkStrokes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkStrokes: Self = this.set("inkStrokes", js.undefined)
    @scala.inline
    def setPageContent(value: PageContentLoadOptions): Self = this.set("pageContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageContent: Self = this.set("pageContent", js.undefined)
  }
  
}

