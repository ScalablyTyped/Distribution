package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// filters
trait BaseFilter extends Filter {
  var fromdate: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var todate: js.UndefOr[java.lang.String] = js.undefined
}

object BaseFilter {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    fromdate: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    tag: java.lang.String = null,
    todate: java.lang.String = null
  ): BaseFilter = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fromdate != null) __obj.updateDynamic("fromdate")(fromdate)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (todate != null) __obj.updateDynamic("todate")(todate)
    __obj.asInstanceOf[BaseFilter]
  }
}

