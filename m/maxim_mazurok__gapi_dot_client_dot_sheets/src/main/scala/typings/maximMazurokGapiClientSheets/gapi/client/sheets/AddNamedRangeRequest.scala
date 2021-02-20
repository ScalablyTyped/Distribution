package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddNamedRangeRequest extends StObject {
  
  /** The named range to add. The namedRangeId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a range that already exists.) */
  var namedRange: js.UndefOr[NamedRange] = js.native
}
object AddNamedRangeRequest {
  
  @scala.inline
  def apply(): AddNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNamedRangeRequest]
  }
  
  @scala.inline
  implicit class AddNamedRangeRequestMutableBuilder[Self <: AddNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRange(value: NamedRange): Self = StObject.set(x, "namedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeUndefined: Self = StObject.set(x, "namedRange", js.undefined)
  }
}
