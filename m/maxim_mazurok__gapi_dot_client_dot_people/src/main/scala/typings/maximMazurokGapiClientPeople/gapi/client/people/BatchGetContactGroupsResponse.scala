package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetContactGroupsResponse extends StObject {
  
  /** The list of responses for each requested contact group resource. */
  var responses: js.UndefOr[js.Array[ContactGroupResponse]] = js.undefined
}
object BatchGetContactGroupsResponse {
  
  inline def apply(): BatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetContactGroupsResponse]
  }
  
  extension [Self <: BatchGetContactGroupsResponse](x: Self) {
    
    inline def setResponses(value: js.Array[ContactGroupResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: ContactGroupResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
