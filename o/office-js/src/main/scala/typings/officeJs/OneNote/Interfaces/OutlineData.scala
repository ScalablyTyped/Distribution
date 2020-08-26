package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "outline.toJSON()". */
@js.native
trait OutlineData extends js.Object {
  /**
    *
    * Gets the ID of the Outline object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the collection of Paragraph objects in the Outline. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
}

object OutlineData {
  @scala.inline
  def apply(): OutlineData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineData]
  }
  @scala.inline
  implicit class OutlineDataOps[Self <: OutlineData] (val x: Self) extends AnyVal {
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
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = this.set("paragraphs", js.Array(value :_*))
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
  }
  
}

