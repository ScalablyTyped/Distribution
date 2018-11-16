package typings
package microsoftteamsLib.microsoftTeamsNs.settingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveEvent extends js.Object {
  /**
               * Indicates that creation of the underlying resource failed and that the settings cannot be saved.
               * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
               */
  def notifyFailure(): scala.Unit = js.native
  /**
               * Indicates that creation of the underlying resource failed and that the settings cannot be saved.
               * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
               */
  def notifyFailure(reason: java.lang.String): scala.Unit = js.native
  /**
               * Indicates that the underlying resource has been created and the settings can be saved.
               */
  def notifySuccess(): scala.Unit = js.native
}

