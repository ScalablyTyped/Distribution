package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.normal
  - typings.microsoftGraph.microsoftGraphStrings.personal
  - typings.microsoftGraph.microsoftGraphStrings.`private`
  - typings.microsoftGraph.microsoftGraphStrings.confidential
*/
trait Sensitivity extends js.Object

object Sensitivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typings.microsoftGraph.microsoftGraphStrings.confidential = this.cast("confidential")
  @scala.inline
  def normal: typings.microsoftGraph.microsoftGraphStrings.normal = this.cast("normal")
  @scala.inline
  def personal: typings.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def `private`: typings.microsoftGraph.microsoftGraphStrings.`private` = this.cast("private")
}

