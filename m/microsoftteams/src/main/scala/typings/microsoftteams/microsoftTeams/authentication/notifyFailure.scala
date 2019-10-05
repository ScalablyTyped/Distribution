package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.authentication.notifyFailure")
@js.native
object notifyFailure extends js.Object {
  /**
    * Notifies the frame that initiated this authentication request that the request failed.
    * This function is usable only on the authentication window.
    * This call causes the authentication window to be closed.
    * @param reason Specifies a reason for the authentication failure. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
    */
  def apply(): Unit = js.native
  def apply(reason: String): Unit = js.native
}

