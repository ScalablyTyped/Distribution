package typings.node

import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5 extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var withFileTypes: `true`
}

object Anon5 {
  @scala.inline
  def apply(withFileTypes: `true`, encoding: java.lang.String = null): Anon5 = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon5]
  }
}

