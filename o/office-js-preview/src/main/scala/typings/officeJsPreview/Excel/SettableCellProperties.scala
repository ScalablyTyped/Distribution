package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the input parameter of setCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableCellProperties extends StObject {
  
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[CellPropertiesFormat] = js.undefined
  
  /**
    *
    * Represents the `hyperlink` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  
  /**
    *
    * Represents the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[String] = js.undefined
}
object SettableCellProperties {
  
  inline def apply(): SettableCellProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableCellProperties]
  }
  
  extension [Self <: SettableCellProperties](x: Self) {
    
    inline def setFormat(value: CellPropertiesFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHyperlink(value: RangeHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
