package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeCellsRequest extends StObject {
  
  /** How the cells should be merged. */
  var mergeType: js.UndefOr[String] = js.native
  
  /** The range of cells to merge. */
  var range: js.UndefOr[GridRange] = js.native
}
object MergeCellsRequest {
  
  @scala.inline
  def apply(): MergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeCellsRequest]
  }
  
  @scala.inline
  implicit class MergeCellsRequestMutableBuilder[Self <: MergeCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeType(value: String): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
