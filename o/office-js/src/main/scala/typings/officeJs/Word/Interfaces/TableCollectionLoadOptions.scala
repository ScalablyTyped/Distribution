package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of the document's Table objects.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait TableCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the number of header rows.
    *
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Indicates whether all of the table rows are uniform. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isUniform: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the nesting level of the table. Top-level tables have level 1. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var nestingLevel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the parent body of the table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the table. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the table. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains this table. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains this table. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains this table. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains this table. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the number of rows in the table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var rowCount: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has banded columns.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has banded rows.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has a first column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has a last column with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets whether the table has a total (last) row with a special style.
    *
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the text values in the table, as a 2D Javascript array.
    *
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets and sets the width of the table in points.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Boolean] = js.native
}
object TableCollectionLoadOptions {
  
  @scala.inline
  def apply(): TableCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class TableCollectionLoadOptionsMutableBuilder[Self <: TableCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAlignment(value: Boolean): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setFont(value: FontLoadOptions): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHeaderRowCount(value: Boolean): Self = StObject.set(x, "headerRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowCountUndefined: Self = StObject.set(x, "headerRowCount", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: Boolean): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setIsUniform(value: Boolean): Self = StObject.set(x, "isUniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUniformUndefined: Self = StObject.set(x, "isUniform", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: Boolean): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    
    @scala.inline
    def setParentBody(value: BodyLoadOptions): Self = StObject.set(x, "parentBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentBodyUndefined: Self = StObject.set(x, "parentBody", js.undefined)
    
    @scala.inline
    def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    @scala.inline
    def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = StObject.set(x, "parentTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCell(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableCellOrNullObjectUndefined: Self = StObject.set(x, "parentTableCellOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTableCellUndefined: Self = StObject.set(x, "parentTableCell", js.undefined)
    
    @scala.inline
    def setParentTableOrNullObject(value: TableLoadOptions): Self = StObject.set(x, "parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentTableOrNullObjectUndefined: Self = StObject.set(x, "parentTableOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTableUndefined: Self = StObject.set(x, "parentTable", js.undefined)
    
    @scala.inline
    def setRowCount(value: Boolean): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    @scala.inline
    def setShadingColor(value: Boolean): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBandedColumns(value: Boolean): Self = StObject.set(x, "styleBandedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBandedColumnsUndefined: Self = StObject.set(x, "styleBandedColumns", js.undefined)
    
    @scala.inline
    def setStyleBandedRows(value: Boolean): Self = StObject.set(x, "styleBandedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBandedRowsUndefined: Self = StObject.set(x, "styleBandedRows", js.undefined)
    
    @scala.inline
    def setStyleBuiltIn(value: Boolean): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    @scala.inline
    def setStyleFirstColumn(value: Boolean): Self = StObject.set(x, "styleFirstColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFirstColumnUndefined: Self = StObject.set(x, "styleFirstColumn", js.undefined)
    
    @scala.inline
    def setStyleLastColumn(value: Boolean): Self = StObject.set(x, "styleLastColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleLastColumnUndefined: Self = StObject.set(x, "styleLastColumn", js.undefined)
    
    @scala.inline
    def setStyleTotalRow(value: Boolean): Self = StObject.set(x, "styleTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleTotalRowUndefined: Self = StObject.set(x, "styleTotalRow", js.undefined)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: Boolean): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
