package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeCellsRequest extends StObject {
  
  /** How the cells should be merged. */
  var mergeType: js.UndefOr[String] = js.undefined
  
  /** The range of cells to merge. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object MergeCellsRequest {
  
  inline def apply(): MergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeCellsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeCellsRequest] (val x: Self) extends AnyVal {
    
    inline def setMergeType(value: String): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
