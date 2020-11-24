package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateExternalRequestType extends js.Object {
  
  var killTree: Boolean = js.native
  
  var timeout: Double = js.native
  
  var uuid: String = js.native
}
object TerminateExternalRequestType {
  
  @scala.inline
  def apply(killTree: Boolean, timeout: Double, uuid: String): TerminateExternalRequestType = {
    val __obj = js.Dynamic.literal(killTree = killTree.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateExternalRequestType]
  }
  
  @scala.inline
  implicit class TerminateExternalRequestTypeOps[Self <: TerminateExternalRequestType] (val x: Self) extends AnyVal {
    
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
    def setKillTree(value: Boolean): Self = this.set("killTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
