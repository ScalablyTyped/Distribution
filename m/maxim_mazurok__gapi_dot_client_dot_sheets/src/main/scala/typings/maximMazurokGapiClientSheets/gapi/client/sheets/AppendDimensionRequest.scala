package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppendDimensionRequest extends StObject {
  
  /** Whether rows or columns should be appended. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /** The number of rows or columns to append. */
  var length: js.UndefOr[Double] = js.undefined
  
  /** The sheet to append rows or columns to. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object AppendDimensionRequest {
  
  inline def apply(): AppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendDimensionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppendDimensionRequest] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
