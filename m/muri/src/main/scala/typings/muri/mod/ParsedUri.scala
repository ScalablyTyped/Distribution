package typings.muri.mod

import typings.muri.anon.Pass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedUri extends js.Object {
  
  var auth: js.UndefOr[Pass] = js.native
  
  var db: String = js.native
  
  var hosts: js.Array[Host] = js.native
  
  var options: js.Any = js.native
}
object ParsedUri {
  
  @scala.inline
  def apply(db: String, hosts: js.Array[Host], options: js.Any): ParsedUri = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUri]
  }
  
  @scala.inline
  implicit class ParsedUriOps[Self <: ParsedUri] (val x: Self) extends AnyVal {
    
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
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsVarargs(value: Host*): Self = this.set("hosts", js.Array(value :_*))
    
    @scala.inline
    def setHosts(value: js.Array[Host]): Self = this.set("hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth(value: Pass): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
  }
}
