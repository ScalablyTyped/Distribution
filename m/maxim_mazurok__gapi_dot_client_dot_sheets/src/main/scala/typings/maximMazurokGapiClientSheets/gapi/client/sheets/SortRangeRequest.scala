package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortRangeRequest extends StObject {
  
  /** The range to sort. */
  var range: js.UndefOr[GridRange] = js.native
  
  /** The sort order per column. Later specifications are used when values are equal in the earlier specifications. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
}
object SortRangeRequest {
  
  @scala.inline
  def apply(): SortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortRangeRequest]
  }
  
  @scala.inline
  implicit class SortRangeRequestMutableBuilder[Self <: SortRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
  }
}
