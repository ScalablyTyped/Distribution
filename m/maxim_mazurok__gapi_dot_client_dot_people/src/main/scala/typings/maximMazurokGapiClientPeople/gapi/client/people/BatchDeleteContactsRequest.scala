package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteContactsRequest extends StObject {
  
  /** Required. The resource names of the contact to delete. It's repeatable. Allows up to 500 resource names in a single request. */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchDeleteContactsRequest {
  
  inline def apply(): BatchDeleteContactsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteContactsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteContactsRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value*))
  }
}
