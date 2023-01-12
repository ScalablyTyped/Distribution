package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  def getPassword(service: String, user: User): String | Null
  
  def removePassword(service: String, user: User): Null
  
  def setPassword(service: String, user: User, password: String): Null
}
object Credentials {
  
  inline def apply(
    getPassword: (String, User) => String | Null,
    removePassword: (String, User) => Null,
    setPassword: (String, User, String) => Null
  ): Credentials = {
    val __obj = js.Dynamic.literal(getPassword = js.Any.fromFunction2(getPassword), removePassword = js.Any.fromFunction2(removePassword), setPassword = js.Any.fromFunction3(setPassword))
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    inline def setGetPassword(value: (String, User) => String | Null): Self = StObject.set(x, "getPassword", js.Any.fromFunction2(value))
    
    inline def setRemovePassword(value: (String, User) => Null): Self = StObject.set(x, "removePassword", js.Any.fromFunction2(value))
    
    inline def setSetPassword(value: (String, User, String) => Null): Self = StObject.set(x, "setPassword", js.Any.fromFunction3(value))
  }
}
