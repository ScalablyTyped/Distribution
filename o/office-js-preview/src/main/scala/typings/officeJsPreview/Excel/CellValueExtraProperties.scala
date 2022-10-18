package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These extra properties may appear on a `CellValue` and provide information about that `CellValue`, but the extra properties are not part of the value in the cell.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CellValueExtraProperties extends StObject {
  
  /**
    * Represents whether this `CellValue` will be used to overwrite a cell.
    * When false, APIs which would use this `CellValue` to overwrite a cell will instead ignore this value without throwing an error.
    * The default value is true.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var writable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents an explanation about why `CellValue.writable` is specified as false.
    * Note: This string is only available if `writable` is specified as false.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var writableNote: js.UndefOr[String] = js.undefined
}
object CellValueExtraProperties {
  
  inline def apply(): CellValueExtraProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValueExtraProperties]
  }
  
  extension [Self <: CellValueExtraProperties](x: Self) {
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableNote(value: String): Self = StObject.set(x, "writableNote", value.asInstanceOf[js.Any])
    
    inline def setWritableNoteUndefined: Self = StObject.set(x, "writableNote", js.undefined)
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
