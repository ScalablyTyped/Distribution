package typings.nginstackEngine

import typings.nginstackEngine.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityPasswordResetServiceMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/PasswordResetService", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PasswordResetService
  @JSImport("@nginstack/engine/lib/security/PasswordResetService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AdministratorPasswordResetRequest = typings.nginstackEngine.libSecurityAdministratorPasswordResetRequestMod.^
  
  type DBKey = typings.nginstackEngine.libDbkeyDbkeyMod.^
  
  @js.native
  trait PasswordResetService extends StObject {
    
    def requestAdministratorPasswordReset(expiresIn: Double): AdministratorPasswordResetRequest = js.native
    
    def resetAdministratorPassword(requestKey: Double, authCode: String, newPassword: String): Unit = js.native
    
    def resetPassword(userKey: Double, confirmationCode: String, newPassword: String): Unit = js.native
    def resetPassword(userKey: DBKey, confirmationCode: String, newPassword: String): Unit = js.native
    
    def sendPasswordResetEmail(userKey: Double, options: Content): Unit = js.native
    def sendPasswordResetEmail(userKey: DBKey, options: Content): Unit = js.native
    
    def validateConfirmationCode(userKey: Double, confirmationCode: String): Unit = js.native
    def validateConfirmationCode(userKey: DBKey, confirmationCode: String): Unit = js.native
  }
}
