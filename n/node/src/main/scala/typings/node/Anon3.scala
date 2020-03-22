package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
}

object Anon3 {
  @scala.inline
  def apply(encoding: java.lang.String = null): Anon3 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

