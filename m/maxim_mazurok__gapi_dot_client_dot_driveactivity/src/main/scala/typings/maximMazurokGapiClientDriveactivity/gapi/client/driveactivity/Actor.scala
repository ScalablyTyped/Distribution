package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actor extends StObject {
  
  /** An administrator. */
  var administrator: js.UndefOr[js.Any] = js.undefined
  
  /** An anonymous user. */
  var anonymous: js.UndefOr[js.Any] = js.undefined
  
  /** An account acting on behalf of another. */
  var impersonation: js.UndefOr[Impersonation] = js.undefined
  
  /** A non-user actor (i.e. system triggered). */
  var system: js.UndefOr[SystemEvent] = js.undefined
  
  /** An end user. */
  var user: js.UndefOr[User] = js.undefined
}
object Actor {
  
  @scala.inline
  def apply(): Actor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actor]
  }
  
  @scala.inline
  implicit class ActorMutableBuilder[Self <: Actor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrator(value: js.Any): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    @scala.inline
    def setAnonymous(value: js.Any): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setImpersonation(value: Impersonation): Self = StObject.set(x, "impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonationUndefined: Self = StObject.set(x, "impersonation", js.undefined)
    
    @scala.inline
    def setSystem(value: SystemEvent): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
