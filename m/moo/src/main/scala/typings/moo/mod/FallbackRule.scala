package typings.moo.mod

import typings.moo.mooBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FallbackRule extends js.Object {
  var fallback: `true`
}

object FallbackRule {
  @scala.inline
  def apply(fallback: `true`): FallbackRule = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FallbackRule]
  }
}

