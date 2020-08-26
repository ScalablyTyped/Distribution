package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the user's login status.
  */
@js.native
trait ILoginStatus extends js.Object {
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
  implicit class ILoginStatusOps[Self <: ILoginStatus] (val x: Self) extends AnyVal {
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
    def setSession(value: ISession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

