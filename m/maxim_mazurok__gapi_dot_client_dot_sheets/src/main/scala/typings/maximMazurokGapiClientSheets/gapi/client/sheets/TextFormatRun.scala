package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFormatRun extends StObject {
  
  /** The format of this run. Absent values inherit the cell's format. */
  var format: js.UndefOr[TextFormat] = js.undefined
  
  /** The character index where this run starts. */
  var startIndex: js.UndefOr[Double] = js.undefined
}
object TextFormatRun {
  
  inline def apply(): TextFormatRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFormatRun]
  }
  
  extension [Self <: TextFormatRun](x: Self) {
    
    inline def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
