package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of all the NamedItem objects that are part of the workbook or worksheet, depending on how it was reached.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait NamedItemCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns an object containing values and types of the named item.
    *
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The formula of the named item. Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The name of the object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies the type of the value returned by the name's formula. See Excel.NamedItemType for details.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the value computed by the name's formula. For a named range, will return the range address.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Specifies if the object is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the worksheet on which the named item is scoped to. Returns a null object if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  var worksheetOrNullObject: js.UndefOr[WorksheetLoadOptions] = js.native
}

object NamedItemCollectionLoadOptions {
  @scala.inline
  def apply(): NamedItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemCollectionLoadOptions]
  }
  @scala.inline
  implicit class NamedItemCollectionLoadOptionsOps[Self <: NamedItemCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def setArrayValues(value: NamedItemArrayValuesLoadOptions): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayValues: Self = this.set("arrayValues", js.undefined)
    @scala.inline
    def setComment(value: Boolean): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setFormula(value: Boolean): Self = this.set("formula", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setScope(value: Boolean): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
    @scala.inline
    def setWorksheetOrNullObject(value: WorksheetLoadOptions): Self = this.set("worksheetOrNullObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheetOrNullObject: Self = this.set("worksheetOrNullObject", js.undefined)
  }
  
}

