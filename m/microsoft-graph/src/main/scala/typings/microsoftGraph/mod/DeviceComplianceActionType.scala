package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.noAction
  - typings.microsoftGraph.microsoftGraphStrings.notification
  - typings.microsoftGraph.microsoftGraphStrings.block
  - typings.microsoftGraph.microsoftGraphStrings.retire
  - typings.microsoftGraph.microsoftGraphStrings.wipe
  - typings.microsoftGraph.microsoftGraphStrings.removeResourceAccessProfiles
  - typings.microsoftGraph.microsoftGraphStrings.pushNotification
*/
trait DeviceComplianceActionType extends js.Object

object DeviceComplianceActionType {
  @scala.inline
  def block: typings.microsoftGraph.microsoftGraphStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def noAction: typings.microsoftGraph.microsoftGraphStrings.noAction = this.cast("noAction")
  @scala.inline
  def notification: typings.microsoftGraph.microsoftGraphStrings.notification = this.cast("notification")
  @scala.inline
  def pushNotification: typings.microsoftGraph.microsoftGraphStrings.pushNotification = this.cast("pushNotification")
  @scala.inline
  def removeResourceAccessProfiles: typings.microsoftGraph.microsoftGraphStrings.removeResourceAccessProfiles = this.cast("removeResourceAccessProfiles")
  @scala.inline
  def retire: typings.microsoftGraph.microsoftGraphStrings.retire = this.cast("retire")
  @scala.inline
  def wipe: typings.microsoftGraph.microsoftGraphStrings.wipe = this.cast("wipe")
}

