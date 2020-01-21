package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.business
  - typings.microsoftGraph.microsoftGraphStrings.education
*/
trait VppTokenAccountType extends js.Object

object VppTokenAccountType {
  @scala.inline
  def business: typings.microsoftGraph.microsoftGraphStrings.business = this.cast("business")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def education: typings.microsoftGraph.microsoftGraphStrings.education = this.cast("education")
}

