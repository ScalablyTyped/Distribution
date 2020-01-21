package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.sis
  - typings.microsoftGraph.microsoftGraphStrings.manual
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait EducationExternalSource extends js.Object

object EducationExternalSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typings.microsoftGraph.microsoftGraphStrings.manual = this.cast("manual")
  @scala.inline
  def sis: typings.microsoftGraph.microsoftGraphStrings.sis = this.cast("sis")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

