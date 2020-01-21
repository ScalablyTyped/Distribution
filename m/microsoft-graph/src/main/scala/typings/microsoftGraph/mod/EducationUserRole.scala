package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.student
  - typings.microsoftGraph.microsoftGraphStrings.teacher
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationUserRole extends js.Object

object EducationUserRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def student: typings.microsoftGraph.microsoftGraphStrings.student = this.cast("student")
  @scala.inline
  def teacher: typings.microsoftGraph.microsoftGraphStrings.teacher = this.cast("teacher")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

