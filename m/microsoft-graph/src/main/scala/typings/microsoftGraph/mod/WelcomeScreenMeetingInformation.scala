package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.showOrganizerAndTimeOnly
  - typings.microsoftGraph.microsoftGraphStrings.showOrganizerAndTimeAndSubject
*/
trait WelcomeScreenMeetingInformation extends js.Object

object WelcomeScreenMeetingInformation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def showOrganizerAndTimeAndSubject: typings.microsoftGraph.microsoftGraphStrings.showOrganizerAndTimeAndSubject = this.cast("showOrganizerAndTimeAndSubject")
  @scala.inline
  def showOrganizerAndTimeOnly: typings.microsoftGraph.microsoftGraphStrings.showOrganizerAndTimeOnly = this.cast("showOrganizerAndTimeOnly")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

