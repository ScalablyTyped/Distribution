package typings.ngwysiwyg.ngWYSIWYGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var sanitize: Boolean
  var toolbar: js.UndefOr[js.Array[Toolbar]] = js.undefined
}

object Config {
  @scala.inline
  def apply(sanitize: Boolean, toolbar: js.Array[Toolbar] = null): Config = {
    val __obj = js.Dynamic.literal(sanitize = sanitize)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[Config]
  }
}

