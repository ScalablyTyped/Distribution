package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in 'and' | 'or' | 'xor' ]:? number} */
trait keyinandorxornumber extends js.Object {
  var and: js.UndefOr[Double] = js.undefined
  var or: js.UndefOr[Double] = js.undefined
  var xor: js.UndefOr[Double] = js.undefined
}

object keyinandorxornumber {
  @scala.inline
  def apply(and: Int | Double = null, or: Int | Double = null, xor: Int | Double = null): keyinandorxornumber = {
    val __obj = js.Dynamic.literal()
    if (and != null) __obj.updateDynamic("and")(and.asInstanceOf[js.Any])
    if (or != null) __obj.updateDynamic("or")(or.asInstanceOf[js.Any])
    if (xor != null) __obj.updateDynamic("xor")(xor.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinandorxornumber]
  }
}

