package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPeopleResponse extends StObject {
  
  /** The response for each requested resource name. */
  var responses: js.UndefOr[js.Array[PersonResponse]] = js.undefined
}
object GetPeopleResponse {
  
  inline def apply(): GetPeopleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPeopleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPeopleResponse] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: js.Array[PersonResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setResponsesVarargs(value: PersonResponse*): Self = StObject.set(x, "responses", js.Array(value*))
  }
}
