package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateContactsResponse extends StObject {
  
  /** The contacts that were created, unless the request `read_mask` is empty. */
  var createdPeople: js.UndefOr[js.Array[PersonResponse]] = js.undefined
}
object BatchCreateContactsResponse {
  
  inline def apply(): BatchCreateContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateContactsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateContactsResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedPeople(value: js.Array[PersonResponse]): Self = StObject.set(x, "createdPeople", value.asInstanceOf[js.Any])
    
    inline def setCreatedPeopleUndefined: Self = StObject.set(x, "createdPeople", js.undefined)
    
    inline def setCreatedPeopleVarargs(value: PersonResponse*): Self = StObject.set(x, "createdPeople", js.Array(value*))
  }
}
