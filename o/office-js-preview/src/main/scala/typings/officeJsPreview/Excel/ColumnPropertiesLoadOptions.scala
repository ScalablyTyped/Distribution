package typings.officeJsPreview.Excel

import typings.officeJsPreview.anon.CellPropertiesFormatLoadOAutoIndent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents which column properties to load, when used as part of a "range.getColumnProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ColumnPropertiesLoadOptions
  extends StObject
     with CellPropertiesLoadOptions {
  
  /**
    *
    * Specifies whether to load on the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `columnIndex` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_ColumnPropertiesLoadOptions: js.UndefOr[CellPropertiesFormatLoadOAutoIndent] = js.undefined
}
object ColumnPropertiesLoadOptions {
  
  inline def apply(): ColumnPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPropertiesLoadOptions]
  }
  
  extension [Self <: ColumnPropertiesLoadOptions](x: Self) {
    
    inline def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    inline def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    inline def setColumnIndex(value: Boolean): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setFormat(value: CellPropertiesFormatLoadOAutoIndent): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
