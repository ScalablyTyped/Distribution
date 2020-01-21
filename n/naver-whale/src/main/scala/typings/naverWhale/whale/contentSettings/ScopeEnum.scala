package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naverWhale.naverWhaleStrings.regular
  - typings.naverWhale.naverWhaleStrings.incognito_session_only
*/
trait ScopeEnum extends js.Object

object ScopeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incognito_session_only: typings.naverWhale.naverWhaleStrings.incognito_session_only = this.cast("incognito_session_only")
  @scala.inline
  def regular: typings.naverWhale.naverWhaleStrings.regular = this.cast("regular")
}

