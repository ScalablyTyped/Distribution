package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimWhitespaceResponse extends StObject {
  
  /** The number of cells that were trimmed of whitespace. */
  var cellsChangedCount: js.UndefOr[Double] = js.undefined
}
object TrimWhitespaceResponse {
  
  inline def apply(): TrimWhitespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimWhitespaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrimWhitespaceResponse] (val x: Self) extends AnyVal {
    
    inline def setCellsChangedCount(value: Double): Self = StObject.set(x, "cellsChangedCount", value.asInstanceOf[js.Any])
    
    inline def setCellsChangedCountUndefined: Self = StObject.set(x, "cellsChangedCount", js.undefined)
  }
}
