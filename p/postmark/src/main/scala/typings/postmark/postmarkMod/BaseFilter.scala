package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// filters
trait BaseFilter extends Filter {
  var fromdate: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var todate: js.UndefOr[String] = js.undefined
}

object BaseFilter {
  @scala.inline
  def apply(
    count: Int | Double = null,
    fromdate: String = null,
    offset: Int | Double = null,
    tag: String = null,
    todate: String = null
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

