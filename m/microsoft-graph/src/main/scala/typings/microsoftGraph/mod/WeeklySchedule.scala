package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.everyday
  - typings.microsoftGraph.microsoftGraphStrings.sunday
  - typings.microsoftGraph.microsoftGraphStrings.monday
  - typings.microsoftGraph.microsoftGraphStrings.tuesday
  - typings.microsoftGraph.microsoftGraphStrings.wednesday
  - typings.microsoftGraph.microsoftGraphStrings.thursday
  - typings.microsoftGraph.microsoftGraphStrings.friday
  - typings.microsoftGraph.microsoftGraphStrings.saturday
*/
trait WeeklySchedule extends js.Object

object WeeklySchedule {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def everyday: typings.microsoftGraph.microsoftGraphStrings.everyday = this.cast("everyday")
  @scala.inline
  def friday: typings.microsoftGraph.microsoftGraphStrings.friday = this.cast("friday")
  @scala.inline
  def monday: typings.microsoftGraph.microsoftGraphStrings.monday = this.cast("monday")
  @scala.inline
  def saturday: typings.microsoftGraph.microsoftGraphStrings.saturday = this.cast("saturday")
  @scala.inline
  def sunday: typings.microsoftGraph.microsoftGraphStrings.sunday = this.cast("sunday")
  @scala.inline
  def thursday: typings.microsoftGraph.microsoftGraphStrings.thursday = this.cast("thursday")
  @scala.inline
  def tuesday: typings.microsoftGraph.microsoftGraphStrings.tuesday = this.cast("tuesday")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
  @scala.inline
  def wednesday: typings.microsoftGraph.microsoftGraphStrings.wednesday = this.cast("wednesday")
}

