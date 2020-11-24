package typings.parsePasswd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswdEntry extends js.Object {
  
  var gecos: String = js.native
  
  var gid: String = js.native
  
  var homedir: String = js.native
  
  var password: String = js.native
  
  var shell: String = js.native
  
  var uid: String = js.native
  
  var username: String = js.native
}
object PasswdEntry {
  
  @scala.inline
  def apply(
    gecos: String,
    gid: String,
    homedir: String,
    password: String,
    shell: String,
    uid: String,
    username: String
  ): PasswdEntry = {
    val __obj = js.Dynamic.literal(gecos = gecos.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswdEntry]
  }
  
  @scala.inline
  implicit class PasswdEntryOps[Self <: PasswdEntry] (val x: Self) extends AnyVal {
    
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
    def setGecos(value: String): Self = this.set("gecos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGid(value: String): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomedir(value: String): Self = this.set("homedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
