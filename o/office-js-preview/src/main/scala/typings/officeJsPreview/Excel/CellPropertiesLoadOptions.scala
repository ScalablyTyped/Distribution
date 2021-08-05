package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents which cell properties to load, when used as part of a "range.getCellProperties" method.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesLoadOptions extends StObject {
  
  /**
    *
    * Specifies whether to load on the `address` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `addressLocal` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var addressLocal: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[CellPropertiesFormatLoadOptions] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `hidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `hyperlink` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to load on the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[Boolean] = js.undefined
}
object CellPropertiesLoadOptions {
  
  inline def apply(): CellPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellPropertiesLoadOptions]
  }
  
  extension [Self <: CellPropertiesLoadOptions](x: Self) {
    
    inline def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressLocal(value: Boolean): Self = StObject.set(x, "addressLocal", value.asInstanceOf[js.Any])
    
    inline def setAddressLocalUndefined: Self = StObject.set(x, "addressLocal", js.undefined)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setFormat(value: CellPropertiesFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHyperlink(value: Boolean): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
