package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForcePort extends js.Object {
  
  var forcePort: Boolean = js.native
}
object ForcePort {
  
  @scala.inline
  def apply(forcePort: Boolean): ForcePort = {
    val __obj = js.Dynamic.literal(forcePort = forcePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcePort]
  }
  
  @scala.inline
  implicit class ForcePortOps[Self <: ForcePort] (val x: Self) extends AnyVal {
    
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
    def setForcePort(value: Boolean): Self = this.set("forcePort", value.asInstanceOf[js.Any])
  }
}
