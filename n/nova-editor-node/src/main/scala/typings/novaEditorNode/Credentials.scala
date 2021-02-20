package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends StObject {
  
  def getPassword(service: String, user: User): String | Null = js.native
  
  def removePassword(service: String, user: User): Null = js.native
  
  def setPassword(service: String, user: User, password: String): Null = js.native
}
object Credentials {
  
  @scala.inline
  def apply(
    getPassword: (String, User) => String | Null,
    removePassword: (String, User) => Null,
    setPassword: (String, User, String) => Null
  ): Credentials = {
    val __obj = js.Dynamic.literal(getPassword = js.Any.fromFunction2(getPassword), removePassword = js.Any.fromFunction2(removePassword), setPassword = js.Any.fromFunction3(setPassword))
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPassword(value: (String, User) => String | Null): Self = StObject.set(x, "getPassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemovePassword(value: (String, User) => Null): Self = StObject.set(x, "removePassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPassword(value: (String, User, String) => Null): Self = StObject.set(x, "setPassword", js.Any.fromFunction3(value))
  }
}
