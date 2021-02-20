package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the user's login status.
  */
@js.native
trait ILoginStatus extends StObject {
  
  /**
    * A JSON object that contains the properties of the current session.
    */
  var session: ISession = js.native
  
  /**
    * The sign-in status of the user. Valid values are "connected",
    * "notConnected", or "unknown".
    */
  var status: String = js.native
}
object ILoginStatus {
  
  @scala.inline
  def apply(session: ISession, status: String): ILoginStatus = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginStatus]
  }
  
  @scala.inline
  implicit class ILoginStatusMutableBuilder[Self <: ILoginStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
