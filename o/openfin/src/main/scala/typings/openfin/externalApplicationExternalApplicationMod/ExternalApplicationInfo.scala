package typings.openfin.externalApplicationExternalApplicationMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalApplicationInfo extends js.Object {
  
  var parent: Identity = js.native
}
object ExternalApplicationInfo {
  
  @scala.inline
  def apply(parent: Identity): ExternalApplicationInfo = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalApplicationInfo]
  }
  
  @scala.inline
  implicit class ExternalApplicationInfoOps[Self <: ExternalApplicationInfo] (val x: Self) extends AnyVal {
    
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
    def setParent(value: Identity): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
}
