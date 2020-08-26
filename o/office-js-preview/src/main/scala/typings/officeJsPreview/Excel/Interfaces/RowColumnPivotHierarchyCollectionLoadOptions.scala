package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of RowColumnPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait RowColumnPivotHierarchyCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Id of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Name of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Position of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.native
}

object RowColumnPivotHierarchyCollectionLoadOptions {
  @scala.inline
  def apply(): RowColumnPivotHierarchyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionLoadOptions]
  }
  @scala.inline
  implicit class RowColumnPivotHierarchyCollectionLoadOptionsOps[Self <: RowColumnPivotHierarchyCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

