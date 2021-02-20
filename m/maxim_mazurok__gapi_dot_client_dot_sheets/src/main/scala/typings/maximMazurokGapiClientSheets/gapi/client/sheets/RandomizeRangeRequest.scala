package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomizeRangeRequest extends StObject {
  
  /** The range to randomize. */
  var range: js.UndefOr[GridRange] = js.native
}
object RandomizeRangeRequest {
  
  @scala.inline
  def apply(): RandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomizeRangeRequest]
  }
  
  @scala.inline
  implicit class RandomizeRangeRequestMutableBuilder[Self <: RandomizeRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
