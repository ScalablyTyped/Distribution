package typings.microsoftteams.microsoftTeams.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveEvent extends js.Object {
  
  /**
    * Indicates that removal of the underlying resource failed and that the content cannot be removed.
    * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
    */
  def notifyFailure(): Unit = js.native
  def notifyFailure(reason: String): Unit = js.native
  
  /**
    * Indicates that the underlying resource has been removed and the content can be removed.
    */
  def notifySuccess(): Unit = js.native
}
