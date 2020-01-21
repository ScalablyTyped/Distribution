package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.guest
  - typings.microsoftGraph.microsoftGraphStrings.domain
*/
trait SharedPCAllowedAccountType extends js.Object

object SharedPCAllowedAccountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domain: typings.microsoftGraph.microsoftGraphStrings.domain = this.cast("domain")
  @scala.inline
  def guest: typings.microsoftGraph.microsoftGraphStrings.guest = this.cast("guest")
}

