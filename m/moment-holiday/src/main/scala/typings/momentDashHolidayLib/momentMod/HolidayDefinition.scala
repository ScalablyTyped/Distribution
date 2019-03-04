package typings
package momentDashHolidayLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolidayDefinition extends js.Object {
  var date: java.lang.String
  var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keywords_n: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keywords_y: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var regions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var regions_n: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object HolidayDefinition {
  @scala.inline
  def apply(
    date: java.lang.String,
    keywords: js.Array[java.lang.String] = null,
    keywords_n: js.Array[java.lang.String] = null,
    keywords_y: js.Array[java.lang.String] = null,
    regions: js.Array[java.lang.String] = null,
    regions_n: js.Array[java.lang.String] = null
  ): HolidayDefinition = {
    val __obj = js.Dynamic.literal(date = date)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (keywords_n != null) __obj.updateDynamic("keywords_n")(keywords_n)
    if (keywords_y != null) __obj.updateDynamic("keywords_y")(keywords_y)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    if (regions_n != null) __obj.updateDynamic("regions_n")(regions_n)
    __obj.asInstanceOf[HolidayDefinition]
  }
}

