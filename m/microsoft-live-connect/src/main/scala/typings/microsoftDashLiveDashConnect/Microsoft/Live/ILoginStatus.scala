package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the user's login status.
  */
trait ILoginStatus extends js.Object {
  /**
    * A JSON object that contains the properties of the current session.
    */
  var session: ISession
  /**
    * The sign-in status of the user. Valid values are "connected",
    * "notConnected", or "unknown".
    */
  var status: String
}

object ILoginStatus {
  @scala.inline
  def apply(session: ISession, status: String): ILoginStatus = {
    val __obj = js.Dynamic.literal(session = session, status = status)
  
    __obj.asInstanceOf[ILoginStatus]
  }
}

