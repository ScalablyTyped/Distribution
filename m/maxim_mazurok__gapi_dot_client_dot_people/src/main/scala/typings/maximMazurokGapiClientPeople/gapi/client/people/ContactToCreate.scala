package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactToCreate extends StObject {
  
  /** Required. The person data to populate a newly created source. */
  var contactPerson: js.UndefOr[Person] = js.undefined
}
object ContactToCreate {
  
  inline def apply(): ContactToCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactToCreate]
  }
  
  extension [Self <: ContactToCreate](x: Self) {
    
    inline def setContactPerson(value: Person): Self = StObject.set(x, "contactPerson", value.asInstanceOf[js.Any])
    
    inline def setContactPersonUndefined: Self = StObject.set(x, "contactPerson", js.undefined)
  }
}
