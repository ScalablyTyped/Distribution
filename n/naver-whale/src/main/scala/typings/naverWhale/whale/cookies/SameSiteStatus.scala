package typings.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naverWhale.naverWhaleStrings.unspecified
  - typings.naverWhale.naverWhaleStrings.no_restriction
  - typings.naverWhale.naverWhaleStrings.lax
  - typings.naverWhale.naverWhaleStrings.strict
*/
trait SameSiteStatus extends js.Object

object SameSiteStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lax: typings.naverWhale.naverWhaleStrings.lax = this.cast("lax")
  @scala.inline
  def no_restriction: typings.naverWhale.naverWhaleStrings.no_restriction = this.cast("no_restriction")
  @scala.inline
  def strict: typings.naverWhale.naverWhaleStrings.strict = this.cast("strict")
  @scala.inline
  def unspecified: typings.naverWhale.naverWhaleStrings.unspecified = this.cast("unspecified")
}

