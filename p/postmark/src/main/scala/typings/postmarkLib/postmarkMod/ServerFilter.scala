package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerFilter extends Filter {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ServerFilter {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    offset: scala.Int | scala.Double = null
  ): ServerFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerFilter]
  }
}

