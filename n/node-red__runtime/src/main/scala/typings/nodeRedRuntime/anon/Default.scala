package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.nodeRedRuntimeStrings.credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: js.UndefOr[Permissions] = js.undefined
  
  var `type`: credentials
  
  var users: js.Array[Password]
}
object Default {
  
  inline def apply(users: js.Array[Password]): Default = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("credentials")
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Permissions): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setType(value: credentials): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: js.Array[Password]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: Password*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
