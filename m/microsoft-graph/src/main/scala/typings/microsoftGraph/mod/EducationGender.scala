package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.female
  - typings.microsoftGraph.microsoftGraphStrings.male
  - typings.microsoftGraph.microsoftGraphStrings.other
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationGender extends js.Object

object EducationGender {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def female: typings.microsoftGraph.microsoftGraphStrings.female = this.cast("female")
  @scala.inline
  def male: typings.microsoftGraph.microsoftGraphStrings.male = this.cast("male")
  @scala.inline
  def other: typings.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

