package typings.nodeRedRuntime.anon

import typings.nodeRedRuntime.nodeRedRuntimeStrings.credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default extends js.Object {
  
  var default: js.UndefOr[Permissions] = js.native
  
  var `type`: credentials = js.native
  
  var users: js.Array[Password] = js.native
}
object Default {
  
  @scala.inline
  def apply(`type`: credentials, users: js.Array[Password]): Default = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    
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
    def setType(value: credentials): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Password*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[Password]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Permissions): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}
