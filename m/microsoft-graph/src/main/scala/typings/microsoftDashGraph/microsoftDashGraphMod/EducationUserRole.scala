package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.student
  - typings.microsoftDashGraph.microsoftDashGraphStrings.teacher
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait EducationUserRole extends js.Object

object EducationUserRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def student: typings.microsoftDashGraph.microsoftDashGraphStrings.student = this.cast("student")
  @scala.inline
  def teacher: typings.microsoftDashGraph.microsoftDashGraphStrings.teacher = this.cast("teacher")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

