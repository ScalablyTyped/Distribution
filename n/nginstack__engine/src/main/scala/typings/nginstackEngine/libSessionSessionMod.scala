package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSessionSessionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/session/Session", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Session
  @JSImport("@nginstack/engine/lib/session/Session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Session extends StObject {
    
    var application: typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    def authorizeToken(authToken: typings.nginstackEngine.libSecurityAuthTokenMod.^): String = js.native
    
    var clientId: String = js.native
    
    var createKeyLicense: Double = js.native
    
    def executeStartupScripts(): Unit = js.native
    
    var id: String = js.native
    
    var lastPath: String = js.native
    
    def limitKeyCreation(limit: Double): Unit = js.native
    
    def login(userName: String, password: String): Boolean = js.native
    
    def loginByAuthToken(idToken: String): Unit = js.native
    
    def loginByToken(token: String): Boolean = js.native
    
    def logout(): Unit = js.native
    
    var realm: String = js.native
    
    def revokeAuthTokenByKey(key: Double): Unit = js.native
    
    var scope: String = js.native
    
    var scriptURI: String | Double = js.native
    
    def setPassword(newPassword: String): Unit = js.native
    
    def setTimeout(minutes: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Double, opt_months: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Double, opt_months: Double, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Double, opt_months: Unit, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Unit, opt_months: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Unit, opt_months: Double, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Double, opt_days: Unit, opt_months: Unit, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Double, opt_months: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Double, opt_months: Double, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Double, opt_months: Unit, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Unit, opt_months: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Unit, opt_months: Double, opt_years: Double): Unit = js.native
    def setTimeout(minutes: Double, opt_hours: Unit, opt_days: Unit, opt_months: Unit, opt_years: Double): Unit = js.native
    
    var startupScriptsExecuted: Boolean = js.native
    
    var trackingId: String = js.native
    
    def updateAuthToken(authToken: typings.nginstackEngine.libSecurityAuthTokenMod.^): Unit = js.native
    
    var userKey: Double = js.native
    
    var userName: String = js.native
  }
}
