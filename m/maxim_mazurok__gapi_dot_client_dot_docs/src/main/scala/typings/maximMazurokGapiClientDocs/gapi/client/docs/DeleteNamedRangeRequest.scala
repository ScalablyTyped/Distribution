package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamedRangeRequest extends StObject {
  
  /** The name of the range(s) to delete. All named ranges with the given name will be deleted. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The ID of the named range to delete. */
  var namedRangeId: js.UndefOr[String] = js.undefined
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
