package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactPhotoResponse extends StObject {
  
  /** The updated person, if person_fields is set in the DeleteContactPhotoRequest; otherwise this will be unset. */
  var person: js.UndefOr[Person] = js.undefined
}
object DeleteContactPhotoResponse {
  
  inline def apply(): DeleteContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteContactPhotoResponse]
  }
  
  extension [Self <: DeleteContactPhotoResponse](x: Self) {
    
    inline def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
