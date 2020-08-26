package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ListLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `list.toJSON()`. */
@js.native
trait ListData extends js.Object {
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Double] = js.native
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[js.Array[Boolean]] = js.native
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[js.Array[ListLevelType]] = js.native
  /**
    *
    * Gets paragraphs in the list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
}

object ListData {
  @scala.inline
  def apply(): ListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListData]
  }
  @scala.inline
  implicit class ListDataOps[Self <: ListData] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLevelExistencesVarargs(value: Boolean*): Self = this.set("levelExistences", js.Array(value :_*))
    @scala.inline
    def setLevelExistences(value: js.Array[Boolean]): Self = this.set("levelExistences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelExistences: Self = this.set("levelExistences", js.undefined)
    @scala.inline
    def setLevelTypesVarargs(value: ListLevelType*): Self = this.set("levelTypes", js.Array(value :_*))
    @scala.inline
    def setLevelTypes(value: js.Array[ListLevelType]): Self = this.set("levelTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevelTypes: Self = this.set("levelTypes", js.undefined)
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = this.set("paragraphs", js.Array(value :_*))
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
  }
  
}

