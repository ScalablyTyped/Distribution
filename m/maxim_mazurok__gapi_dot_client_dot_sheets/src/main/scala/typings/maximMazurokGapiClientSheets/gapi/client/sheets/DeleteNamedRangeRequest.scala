package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteNamedRangeRequest extends StObject {
  
  /** The ID of the named range to delete. */
  var namedRangeId: js.UndefOr[String] = js.native
}
object DeleteNamedRangeRequest {
  
  @scala.inline
  def apply(): DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNamedRangeRequest]
  }
  
  @scala.inline
  implicit class DeleteNamedRangeRequestMutableBuilder[Self <: DeleteNamedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
