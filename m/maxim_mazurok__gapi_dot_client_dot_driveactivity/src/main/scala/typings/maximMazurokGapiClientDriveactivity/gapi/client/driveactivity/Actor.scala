package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actor extends StObject {
  
  /** An administrator. */
  var administrator: js.UndefOr[Any] = js.undefined
  
  /** An anonymous user. */
  var anonymous: js.UndefOr[Any] = js.undefined
  
  /** An account acting on behalf of another. */
  var impersonation: js.UndefOr[Impersonation] = js.undefined
  
  /** A non-user actor (i.e. system triggered). */
  var system: js.UndefOr[SystemEvent] = js.undefined
  
  /** An end user. */
  var user: js.UndefOr[User] = js.undefined
}
object Actor {
  
  inline def apply(): Actor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actor]
  }
  
  extension [Self <: Actor](x: Self) {
    
    inline def setAdministrator(value: Any): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
    
    inline def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
    
    inline def setAnonymous(value: Any): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setImpersonation(value: Impersonation): Self = StObject.set(x, "impersonation", value.asInstanceOf[js.Any])
    
    inline def setImpersonationUndefined: Self = StObject.set(x, "impersonation", js.undefined)
    
    inline def setSystem(value: SystemEvent): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
