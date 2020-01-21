package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.meetingRequest
  - typings.microsoftGraph.microsoftGraphStrings.meetingCancelled
  - typings.microsoftGraph.microsoftGraphStrings.meetingAccepted
  - typings.microsoftGraph.microsoftGraphStrings.meetingTenativelyAccepted
  - typings.microsoftGraph.microsoftGraphStrings.meetingDeclined
*/
trait MeetingMessageType extends js.Object

object MeetingMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def meetingAccepted: typings.microsoftGraph.microsoftGraphStrings.meetingAccepted = this.cast("meetingAccepted")
  @scala.inline
  def meetingCancelled: typings.microsoftGraph.microsoftGraphStrings.meetingCancelled = this.cast("meetingCancelled")
  @scala.inline
  def meetingDeclined: typings.microsoftGraph.microsoftGraphStrings.meetingDeclined = this.cast("meetingDeclined")
  @scala.inline
  def meetingRequest: typings.microsoftGraph.microsoftGraphStrings.meetingRequest = this.cast("meetingRequest")
  @scala.inline
  def meetingTenativelyAccepted: typings.microsoftGraph.microsoftGraphStrings.meetingTenativelyAccepted = this.cast("meetingTenativelyAccepted")
  @scala.inline
  def none: none_ = this.cast("none")
}

