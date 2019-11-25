package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.meetingRequest
  - typings.microsoftDashGraph.microsoftDashGraphStrings.meetingCancelled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.meetingAccepted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.meetingTenativelyAccepted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.meetingDeclined
*/
trait MeetingMessageType extends js.Object

object MeetingMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def meetingAccepted: typings.microsoftDashGraph.microsoftDashGraphStrings.meetingAccepted = this.cast("meetingAccepted")
  @scala.inline
  def meetingCancelled: typings.microsoftDashGraph.microsoftDashGraphStrings.meetingCancelled = this.cast("meetingCancelled")
  @scala.inline
  def meetingDeclined: typings.microsoftDashGraph.microsoftDashGraphStrings.meetingDeclined = this.cast("meetingDeclined")
  @scala.inline
  def meetingRequest: typings.microsoftDashGraph.microsoftDashGraphStrings.meetingRequest = this.cast("meetingRequest")
  @scala.inline
  def meetingTenativelyAccepted: typings.microsoftDashGraph.microsoftDashGraphStrings.meetingTenativelyAccepted = this.cast("meetingTenativelyAccepted")
  @scala.inline
  def none: none_ = this.cast("none")
}

