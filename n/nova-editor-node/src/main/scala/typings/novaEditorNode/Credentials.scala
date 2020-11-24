package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
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
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPassword(value: (String, User) => String | Null): Self = this.set("getPassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemovePassword(value: (String, User) => Null): Self = this.set("removePassword", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetPassword(value: (String, User, String) => Null): Self = this.set("setPassword", js.Any.fromFunction3(value))
  }
}
