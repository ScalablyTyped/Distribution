package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupClientData extends StObject {
  
  /** The client specified key of the client data. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The client specified value of the client data. */
  var value: js.UndefOr[String] = js.undefined
}
object GroupClientData {
  
  inline def apply(): GroupClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupClientData]
  }
  
  extension [Self <: GroupClientData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
