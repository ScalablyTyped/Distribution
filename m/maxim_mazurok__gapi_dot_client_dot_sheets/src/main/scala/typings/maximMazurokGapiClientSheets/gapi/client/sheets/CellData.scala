package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellData extends StObject {
  
  /**
    * Output only. Information about a data source formula on the cell. The field is set if user_entered_value is a formula referencing some DATA_SOURCE sheet, e.g
    * `=SUM(DataSheet!Column)`.
    */
  var dataSourceFormula: js.UndefOr[DataSourceFormula] = js.undefined
  
  /**
    * A data source table anchored at this cell. The size of data source table itself is computed dynamically based on its configuration. Only the first cell of the data source table
    * contains the data source table definition. The other cells will contain the display values of the data source table result in their effective_value fields.
    */
  var dataSourceTable: js.UndefOr[DataSourceTable] = js.undefined
  
  /** A data validation rule on the cell, if any. When writing, the new data validation rule will overwrite any prior rule. */
  var dataValidation: js.UndefOr[DataValidationRule] = js.undefined
  
  /**
    * The effective format being used by the cell. This includes the results of applying any conditional formatting and, if the cell contains a formula, the computed number format. If the
    * effective format is the default format, effective format will not be written. This field is read-only.
    */
  var effectiveFormat: js.UndefOr[CellFormat] = js.undefined
  
  /** The effective value of the cell. For cells with formulas, this is the calculated value. For cells with literals, this is the same as the user_entered_value. This field is read-only. */
  var effectiveValue: js.UndefOr[ExtendedValue] = js.undefined
  
  /** The formatted value of the cell. This is the value as it's shown to the user. This field is read-only. */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /**
    * A hyperlink this cell points to, if any. If the cell contains multiple hyperlinks, this field will be empty. This field is read-only. To set it, use a `=HYPERLINK` formula in the
    * userEnteredValue.formulaValue field.
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /** Any note on the cell. */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * A pivot table anchored at this cell. The size of pivot table itself is computed dynamically based on its data, grouping, filters, values, etc. Only the top-left cell of the pivot
    * table contains the pivot table definition. The other cells will contain the calculated values of the results of the pivot in their effective_value fields.
    */
  var pivotTable: js.UndefOr[PivotTable] = js.undefined
  
  /**
    * Runs of rich text applied to subsections of the cell. Runs are only valid on user entered strings, not formulas, bools, or numbers. Properties of a run start at a specific index in
    * the text and continue until the next run. Runs will inherit the properties of the cell unless explicitly changed. When writing, the new runs will overwrite any prior runs. When
    * writing a new user_entered_value, previous runs are erased.
    */
  var textFormatRuns: js.UndefOr[js.Array[TextFormatRun]] = js.undefined
  
  /** The format the user entered for the cell. When writing, the new format will be merged with the existing format. */
  var userEnteredFormat: js.UndefOr[CellFormat] = js.undefined
  
  /** The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()` Note: Dates, Times and DateTimes are represented as doubles in serial number format. */
  var userEnteredValue: js.UndefOr[ExtendedValue] = js.undefined
}
object CellData {
  
  inline def apply(): CellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellData]
  }
  
  extension [Self <: CellData](x: Self) {
    
    inline def setDataSourceFormula(value: DataSourceFormula): Self = StObject.set(x, "dataSourceFormula", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFormulaUndefined: Self = StObject.set(x, "dataSourceFormula", js.undefined)
    
    inline def setDataSourceTable(value: DataSourceTable): Self = StObject.set(x, "dataSourceTable", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTableUndefined: Self = StObject.set(x, "dataSourceTable", js.undefined)
    
    inline def setDataValidation(value: DataValidationRule): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    inline def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    inline def setEffectiveFormat(value: CellFormat): Self = StObject.set(x, "effectiveFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFormatUndefined: Self = StObject.set(x, "effectiveFormat", js.undefined)
    
    inline def setEffectiveValue(value: ExtendedValue): Self = StObject.set(x, "effectiveValue", value.asInstanceOf[js.Any])
    
    inline def setEffectiveValueUndefined: Self = StObject.set(x, "effectiveValue", js.undefined)
    
    inline def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPivotTable(value: PivotTable): Self = StObject.set(x, "pivotTable", value.asInstanceOf[js.Any])
    
    inline def setPivotTableUndefined: Self = StObject.set(x, "pivotTable", js.undefined)
    
    inline def setTextFormatRuns(value: js.Array[TextFormatRun]): Self = StObject.set(x, "textFormatRuns", value.asInstanceOf[js.Any])
    
    inline def setTextFormatRunsUndefined: Self = StObject.set(x, "textFormatRuns", js.undefined)
    
    inline def setTextFormatRunsVarargs(value: TextFormatRun*): Self = StObject.set(x, "textFormatRuns", js.Array(value :_*))
    
    inline def setUserEnteredFormat(value: CellFormat): Self = StObject.set(x, "userEnteredFormat", value.asInstanceOf[js.Any])
    
    inline def setUserEnteredFormatUndefined: Self = StObject.set(x, "userEnteredFormat", js.undefined)
    
    inline def setUserEnteredValue(value: ExtendedValue): Self = StObject.set(x, "userEnteredValue", value.asInstanceOf[js.Any])
    
    inline def setUserEnteredValueUndefined: Self = StObject.set(x, "userEnteredValue", js.undefined)
  }
}
