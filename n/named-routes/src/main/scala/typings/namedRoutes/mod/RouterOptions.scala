package typings.namedRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var caseSensitive: Boolean
}

object RouterOptions {
  @scala.inline
  def apply(caseSensitive: Boolean): RouterOptions = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

