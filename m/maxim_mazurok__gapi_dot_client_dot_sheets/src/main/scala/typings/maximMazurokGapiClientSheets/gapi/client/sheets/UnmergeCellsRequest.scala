package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmergeCellsRequest extends StObject {
  
  /** The range within which all cells should be unmerged. If the range spans multiple merges, all will be unmerged. The range must not partially span any merge. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object UnmergeCellsRequest {
  
  inline def apply(): UnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmergeCellsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnmergeCellsRequest] (val x: Self) extends AnyVal {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
