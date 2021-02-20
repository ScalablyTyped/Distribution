package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetContactGroupsResponse extends StObject {
  
  /** The list of responses for each requested contact group resource. */
  var responses: js.UndefOr[js.Array[ContactGroupResponse]] = js.native
}
object BatchGetContactGroupsResponse {
  
  @scala.inline
  def apply(): BatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetContactGroupsResponse]
  }
  
  @scala.inline
  implicit class BatchGetContactGroupsResponseMutableBuilder[Self <: BatchGetContactGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[ContactGroupResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: ContactGroupResponse*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
