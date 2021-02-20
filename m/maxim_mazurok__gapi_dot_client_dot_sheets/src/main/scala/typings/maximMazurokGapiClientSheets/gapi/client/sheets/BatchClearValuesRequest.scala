package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchClearValuesRequest extends StObject {
  
  /** The ranges to clear, in A1 notation. */
  var ranges: js.UndefOr[js.Array[String]] = js.native
}
object BatchClearValuesRequest {
  
  @scala.inline
  def apply(): BatchClearValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesRequest]
  }
  
  @scala.inline
  implicit class BatchClearValuesRequestMutableBuilder[Self <: BatchClearValuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[String]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: String*): Self = StObject.set(x, "ranges", js.Array(value :_*))
  }
}
