package typings.nodeRedRegistry.anon

import typings.nodeRedRegistry.mod.NodeCredentials
import typings.nodeRedRegistry.mod.NodeSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials[TCreds, TSets] extends js.Object {
  
  var credentials: js.UndefOr[NodeCredentials[TCreds]] = js.native
  
  var settings: js.UndefOr[NodeSettings[TSets]] = js.native
}
object Credentials {
  
  @scala.inline
  def apply[TCreds, TSets](): Credentials[TCreds, TSets] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credentials[TCreds, TSets]]
  }
  
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials[_, _], TCreds, TSets] (val x: Self with (Credentials[TCreds, TSets])) extends AnyVal {
    
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
    def setCredentials(value: NodeCredentials[TCreds]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setSettings(value: NodeSettings[TSets]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
