package typings.momentHoliday.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HolidayDefinition extends js.Object {
  var date: String
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var keywords_n: js.UndefOr[js.Array[String]] = js.undefined
  var keywords_y: js.UndefOr[js.Array[String]] = js.undefined
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  var regions_n: js.UndefOr[js.Array[String]] = js.undefined
}

object HolidayDefinition {
  @scala.inline
  def apply(
    date: String,
    keywords: js.Array[String] = null,
    keywords_n: js.Array[String] = null,
    keywords_y: js.Array[String] = null,
    regions: js.Array[String] = null,
    regions_n: js.Array[String] = null
  ): HolidayDefinition = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (keywords_n != null) __obj.updateDynamic("keywords_n")(keywords_n.asInstanceOf[js.Any])
    if (keywords_y != null) __obj.updateDynamic("keywords_y")(keywords_y.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (regions_n != null) __obj.updateDynamic("regions_n")(regions_n.asInstanceOf[js.Any])
    __obj.asInstanceOf[HolidayDefinition]
  }
}

