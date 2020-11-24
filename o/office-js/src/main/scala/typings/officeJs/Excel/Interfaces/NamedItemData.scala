package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.NamedItemScope
import typings.officeJs.Excel.NamedItemType
import typings.officeJs.officeJsStrings.Array
import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.Integer
import typings.officeJs.officeJsStrings.Range
import typings.officeJs.officeJsStrings.Workbook
import typings.officeJs.officeJsStrings.Worksheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedItem.toJSON()`. */
@js.native
trait NamedItemData extends js.Object {
  
  /**
    *
    * Returns an object containing values and types of the named item.
    *
    * [Api set: ExcelApi 1.7]
    */
  var arrayValues: js.UndefOr[NamedItemArrayValuesData] = js.native
  
  /**
    *
    * Specifies the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    *
    * The formula of the named item. Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[js.Any] = js.native
  
  /**
    *
    * The name of the object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * [Api set: ExcelApi 1.4]
    */
  var scope: js.UndefOr[NamedItemScope | Worksheet | Workbook] = js.native
  
  /**
    *
    * Specifies the type of the value returned by the name's formula. See Excel.NamedItemType for details.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  var `type`: js.UndefOr[
    NamedItemType | typings.officeJs.officeJsStrings.String | Integer | Double | Boolean | Range | Error | Array
  ] = js.native
  
  /**
    *
    * Represents the value computed by the name's formula. For a named range, will return the range address.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.native
  
  /**
    *
    * Specifies if the object is visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[scala.Boolean] = js.native
}
object NamedItemData {
  
  @scala.inline
  def apply(): NamedItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemData]
  }
  
  @scala.inline
  implicit class NamedItemDataOps[Self <: NamedItemData] (val x: Self) extends AnyVal {
    
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
    def setArrayValues(value: NamedItemArrayValuesData): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayValues: Self = this.set("arrayValues", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setFormula(value: js.Any): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScope(value: NamedItemScope | Worksheet | Workbook): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setType(
      value: NamedItemType | typings.officeJs.officeJsStrings.String | Integer | Double | Boolean | Range | Error | Array
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisible(value: scala.Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
