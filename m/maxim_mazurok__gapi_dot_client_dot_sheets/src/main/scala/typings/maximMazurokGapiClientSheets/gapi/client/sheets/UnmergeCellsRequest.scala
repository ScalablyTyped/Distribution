package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmergeCellsRequest extends StObject {
  
  /** The range within which all cells should be unmerged. If the range spans multiple merges, all will be unmerged. The range must not partially span any merge. */
  var range: js.UndefOr[GridRange] = js.native
}
object UnmergeCellsRequest {
  
  @scala.inline
  def apply(): UnmergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmergeCellsRequest]
  }
  
  @scala.inline
  implicit class UnmergeCellsRequestMutableBuilder[Self <: UnmergeCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
