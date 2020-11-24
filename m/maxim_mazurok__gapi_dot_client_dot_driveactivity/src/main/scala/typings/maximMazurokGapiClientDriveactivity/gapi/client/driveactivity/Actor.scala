package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actor extends js.Object {
  
  /** An administrator. */
  var administrator: js.UndefOr[js.Any] = js.native
  
  /** An anonymous user. */
  var anonymous: js.UndefOr[js.Any] = js.native
  
  /** An account acting on behalf of another. */
  var impersonation: js.UndefOr[Impersonation] = js.native
  
  /** A non-user actor (i.e. system triggered). */
  var system: js.UndefOr[SystemEvent] = js.native
  
  /** An end user. */
  var user: js.UndefOr[User] = js.native
}
object Actor {
  
  @scala.inline
  def apply(): Actor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actor]
  }
  
  @scala.inline
  implicit class ActorOps[Self <: Actor] (val x: Self) extends AnyVal {
    
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
    def setAdministrator(value: js.Any): Self = this.set("administrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrator: Self = this.set("administrator", js.undefined)
    
    @scala.inline
    def setAnonymous(value: js.Any): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    
    @scala.inline
    def setImpersonation(value: Impersonation): Self = this.set("impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpersonation: Self = this.set("impersonation", js.undefined)
    
    @scala.inline
    def setSystem(value: SystemEvent): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
