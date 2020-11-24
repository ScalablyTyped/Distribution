package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a table in a Word document.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  
  /**
    *
    * Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Indicates whether all of the table rows are uniform. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isUniform: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the nesting level of the table. Top-level tables have level 1. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var nestingLevel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the parent body of the table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  
  /**
    *
    * Gets the content control that contains the table. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  
  /**
    *
    * Gets the content control that contains the table. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  
  /**
    *
    * Gets the table that contains this table. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  
  /**
    *
    * Gets the table cell that contains this table. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  
  /**
    *
    * Gets the table cell that contains this table. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  
  /**
    *
    * Gets the table that contains this table. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  
  /**
    *
    * Gets the number of rows in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowCount: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Boolean] = js.native
}
object TableLoadOptions {
  
  @scala.inline
  def apply(): TableLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableLoadOptions]
  }
  
  @scala.inline
  implicit class TableLoadOptionsOps[Self <: TableLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Boolean): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setFont(value: FontLoadOptions): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setHeaderRowCount(value: Boolean): Self = this.set("headerRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRowCount: Self = this.set("headerRowCount", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIsUniform(value: Boolean): Self = this.set("isUniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUniform: Self = this.set("isUniform", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Boolean): Self = this.set("nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestingLevel: Self = this.set("nestingLevel", js.undefined)
    
    @scala.inline
    def setParentBody(value: BodyLoadOptions): Self = this.set("parentBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentBody: Self = this.set("parentBody", js.undefined)
    
    @scala.inline
    def setParentContentControl(value: ContentControlLoadOptions): Self = this.set("parentContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentContentControl: Self = this.set("parentContentControl", js.undefined)
    
    @scala.inline
    def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = this.set("parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentContentControlOrNullObject: Self = this.set("parentContentControlOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = this.set("parentTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTable: Self = this.set("parentTable", js.undefined)
    
    @scala.inline
    def setParentTableCell(value: TableCellLoadOptions): Self = this.set("parentTableCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTableCell: Self = this.set("parentTableCell", js.undefined)
    
    @scala.inline
    def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = this.set("parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTableCellOrNullObject: Self = this.set("parentTableCellOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTableOrNullObject(value: TableLoadOptions): Self = this.set("parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTableOrNullObject: Self = this.set("parentTableOrNullObject", js.undefined)
    
    @scala.inline
    def setRowCount(value: Boolean): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setShadingColor(value: Boolean): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleBandedColumns(value: Boolean): Self = this.set("styleBandedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleBandedColumns: Self = this.set("styleBandedColumns", js.undefined)
    
    @scala.inline
    def setStyleBandedRows(value: Boolean): Self = this.set("styleBandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleBandedRows: Self = this.set("styleBandedRows", js.undefined)
    
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    
    @scala.inline
    def setStyleFirstColumn(value: Boolean): Self = this.set("styleFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleFirstColumn: Self = this.set("styleFirstColumn", js.undefined)
    
    @scala.inline
    def setStyleLastColumn(value: Boolean): Self = this.set("styleLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleLastColumn: Self = this.set("styleLastColumn", js.undefined)
    
    @scala.inline
    def setStyleTotalRow(value: Boolean): Self = this.set("styleTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleTotalRow: Self = this.set("styleTotalRow", js.undefined)
    
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
