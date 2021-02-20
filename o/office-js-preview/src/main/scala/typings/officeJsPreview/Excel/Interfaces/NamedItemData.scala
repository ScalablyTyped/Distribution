package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.NamedItemScope
import typings.officeJsPreview.Excel.NamedItemType
import typings.officeJsPreview.officeJsPreviewStrings.Array
import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.Error
import typings.officeJsPreview.officeJsPreviewStrings.Integer
import typings.officeJsPreview.officeJsPreviewStrings.Range
import typings.officeJsPreview.officeJsPreviewStrings.Workbook
import typings.officeJsPreview.officeJsPreviewStrings.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `namedItem.toJSON()`. */
@js.native
trait NamedItemData extends StObject {
  
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
    NamedItemType | typings.officeJsPreview.officeJsPreviewStrings.String | Integer | Double | Boolean | Range | Error | Array
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
  implicit class NamedItemDataMutableBuilder[Self <: NamedItemData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayValues(value: NamedItemArrayValuesData): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setFormula(value: js.Any): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScope(value: NamedItemScope | Worksheet | Workbook): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setType(
      value: NamedItemType | typings.officeJsPreview.officeJsPreviewStrings.String | Integer | Double | Boolean | Range | Error | Array
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisible(value: scala.Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
