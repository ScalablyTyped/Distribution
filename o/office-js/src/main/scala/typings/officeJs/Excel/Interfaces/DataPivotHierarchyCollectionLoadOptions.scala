package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of DataPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait DataPivotHierarchyCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the data should be shown as a specific summary calculation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if all items of the DataPivotHierarchy are shown.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[Boolean] = js.native
}

object DataPivotHierarchyCollectionLoadOptions {
  @scala.inline
  def apply(): DataPivotHierarchyCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyCollectionLoadOptions]
  }
  @scala.inline
  implicit class DataPivotHierarchyCollectionLoadOptionsOps[Self <: DataPivotHierarchyCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setField(value: PivotFieldLoadOptions): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumberFormat(value: Boolean): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setPosition(value: Boolean): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowAs(value: Boolean): Self = this.set("showAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAs: Self = this.set("showAs", js.undefined)
    @scala.inline
    def setSummarizeBy(value: Boolean): Self = this.set("summarizeBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummarizeBy: Self = this.set("summarizeBy", js.undefined)
  }
  
}

