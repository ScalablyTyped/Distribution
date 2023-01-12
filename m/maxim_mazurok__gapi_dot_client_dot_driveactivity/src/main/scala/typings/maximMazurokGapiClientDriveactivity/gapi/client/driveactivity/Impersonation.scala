package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Impersonation extends StObject {
  
  /** The impersonated user. */
  var impersonatedUser: js.UndefOr[User] = js.undefined
}
object Impersonation {
  
  inline def apply(): Impersonation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Impersonation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Impersonation] (val x: Self) extends AnyVal {
    
    inline def setImpersonatedUser(value: User): Self = StObject.set(x, "impersonatedUser", value.asInstanceOf[js.Any])
    
    inline def setImpersonatedUserUndefined: Self = StObject.set(x, "impersonatedUser", js.undefined)
  }
}
