package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.Alignment
import typings.officeJs.Word.VerticalAlignment
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `table.toJSON()`. */
trait TableData extends StObject {
  
  /**
    * Specifies the alignment of the table against the page column. The value can be 'Left', 'Centered', or 'Right'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var alignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Gets the collection of field objects in the table.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  
  /**
    * Gets the font. Use this to get and set font name, size, color, and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Specifies the number of header rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var headerRowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the horizontal alignment of every cell in the table. The value can be 'Left', 'Centered', 'Right', or 'Justified'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var horizontalAlignment: js.UndefOr[Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified] = js.undefined
  
  /**
    * Indicates whether all of the table rows are uniform.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var isUniform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the nesting level of the table. Top-level tables have level 1.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var nestingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the number of rows in the table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets all of the table rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var rows: js.UndefOr[js.Array[TableRowData]] = js.undefined
  
  /**
    * Specifies the shading color. Color is specified in "#RRGGBB" format or by using the color name.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the style name for the table. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the table has banded columns.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBandedColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the table has banded rows.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBandedRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the built-in style name for the table. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJs.Word.BuiltInStyleName, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Specifies whether the table has a first column with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleFirstColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the table has a last column with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleLastColumn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the table has a total (last) row with a special style.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleTotalRow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the child tables nested one level deeper.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  
  /**
    * Specifies the text values in the table, as a 2D JavaScript array.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var values: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * Specifies the vertical alignment of every cell in the table. The value can be 'Top', 'Center', or 'Bottom'.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | Mixed | Top | Center | Bottom] = js.undefined
  
  /**
    * Specifies the width of the table in points.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object TableData {
  
  inline def apply(): TableData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableData] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setFields(value: js.Array[FieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldData*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeaderRowCount(value: Double): Self = StObject.set(x, "headerRowCount", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowCountUndefined: Self = StObject.set(x, "headerRowCount", js.undefined)
    
    inline def setHorizontalAlignment(value: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setIsUniform(value: Boolean): Self = StObject.set(x, "isUniform", value.asInstanceOf[js.Any])
    
    inline def setIsUniformUndefined: Self = StObject.set(x, "isUniform", js.undefined)
    
    inline def setNestingLevel(value: Double): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRows(value: js.Array[TableRowData]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: TableRowData*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBandedColumns(value: Boolean): Self = StObject.set(x, "styleBandedColumns", value.asInstanceOf[js.Any])
    
    inline def setStyleBandedColumnsUndefined: Self = StObject.set(x, "styleBandedColumns", js.undefined)
    
    inline def setStyleBandedRows(value: Boolean): Self = StObject.set(x, "styleBandedRows", value.asInstanceOf[js.Any])
    
    inline def setStyleBandedRowsUndefined: Self = StObject.set(x, "styleBandedRows", js.undefined)
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJs.Word.BuiltInStyleName, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleFirstColumn(value: Boolean): Self = StObject.set(x, "styleFirstColumn", value.asInstanceOf[js.Any])
    
    inline def setStyleFirstColumnUndefined: Self = StObject.set(x, "styleFirstColumn", js.undefined)
    
    inline def setStyleLastColumn(value: Boolean): Self = StObject.set(x, "styleLastColumn", value.asInstanceOf[js.Any])
    
    inline def setStyleLastColumnUndefined: Self = StObject.set(x, "styleLastColumn", js.undefined)
    
    inline def setStyleTotalRow(value: Boolean): Self = StObject.set(x, "styleTotalRow", value.asInstanceOf[js.Any])
    
    inline def setStyleTotalRowUndefined: Self = StObject.set(x, "styleTotalRow", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setValues(value: js.Array[js.Array[String]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: js.Array[String]*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setVerticalAlignment(value: VerticalAlignment | Mixed | Top | Center | Bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
