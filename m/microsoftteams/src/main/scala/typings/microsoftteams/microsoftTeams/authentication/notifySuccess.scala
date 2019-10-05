package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("microsoftTeams.authentication.notifySuccess")
@js.native
object notifySuccess extends js.Object {
  /**
    * Notifies the frame that initiated this authentication request that the request was successful.
    * This function is usable only on the authentication window.
    * This call causes the authentication window to be closed.
    * @param result Specifies a result for the authentication. If specified, the frame that initiated the authentication pop-up receives this value in its callback.
    */
  def apply(): Unit = js.native
  def apply(result: String): Unit = js.native
}

