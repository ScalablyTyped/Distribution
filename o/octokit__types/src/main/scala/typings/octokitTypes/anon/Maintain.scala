package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maintain extends js.Object {
  
  var admin: Boolean = js.native
  
  var maintain: Boolean = js.native
  
  var pull: Boolean = js.native
  
  var push: Boolean = js.native
  
  var triage: Boolean = js.native
}
object Maintain {
  
  @scala.inline
  def apply(admin: Boolean, maintain: Boolean, pull: Boolean, push: Boolean, triage: Boolean): Maintain = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], maintain = maintain.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], triage = triage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maintain]
  }
  
  @scala.inline
  implicit class MaintainOps[Self <: Maintain] (val x: Self) extends AnyVal {
    
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
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintain(value: Boolean): Self = this.set("maintain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull(value: Boolean): Self = this.set("pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: Boolean): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriage(value: Boolean): Self = this.set("triage", value.asInstanceOf[js.Any])
  }
}
