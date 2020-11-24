package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remote extends js.Object {
  
  var remote: String = js.native
  
  var supplied: String = js.native
}
object Remote {
  
  @scala.inline
  def apply(remote: String, supplied: String): Remote = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any], supplied = supplied.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
  
  @scala.inline
  implicit class RemoteOps[Self <: Remote] (val x: Self) extends AnyVal {
    
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
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupplied(value: String): Self = this.set("supplied", value.asInstanceOf[js.Any])
  }
}
