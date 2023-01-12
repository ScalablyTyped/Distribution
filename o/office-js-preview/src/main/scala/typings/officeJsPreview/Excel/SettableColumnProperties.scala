package typings.officeJsPreview.Excel

import typings.officeJsPreview.anon.CellPropertiesFormatcolum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the input parameter of setColumnProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableColumnProperties
  extends StObject
     with SettableCellProperties {
  
  /**
    *
    * Represents the `columnHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var columnHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  @JSName("format")
  var format_SettableColumnProperties: js.UndefOr[CellPropertiesFormatcolum] = js.undefined
}
object SettableColumnProperties {
  
  inline def apply(): SettableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettableColumnProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettableColumnProperties] (val x: Self) extends AnyVal {
    
    inline def setColumnHidden(value: Boolean): Self = StObject.set(x, "columnHidden", value.asInstanceOf[js.Any])
    
    inline def setColumnHiddenUndefined: Self = StObject.set(x, "columnHidden", js.undefined)
    
    inline def setFormat(value: CellPropertiesFormatcolum): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
