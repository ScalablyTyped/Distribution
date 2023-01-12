package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientObj extends StObject {
  
  var clientId: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var selection: String
}
object ClientObj {
  
  inline def apply(clientId: String, selection: String): ClientObj = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientObj] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
