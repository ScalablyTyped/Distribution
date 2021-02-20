package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impersonation extends StObject {
  
  /** The impersonated user. */
  var impersonatedUser: js.UndefOr[User] = js.native
}
object Impersonation {
  
  @scala.inline
  def apply(): Impersonation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Impersonation]
  }
  
  @scala.inline
  implicit class ImpersonationMutableBuilder[Self <: Impersonation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpersonatedUser(value: User): Self = StObject.set(x, "impersonatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonatedUserUndefined: Self = StObject.set(x, "impersonatedUser", js.undefined)
  }
}
