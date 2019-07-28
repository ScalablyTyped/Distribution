package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMessageFilter extends BaseFilter {
  var city: js.UndefOr[String] = js.undefined
  var client_company: js.UndefOr[String] = js.undefined
  var client_family: js.UndefOr[String] = js.undefined
  var client_name: js.UndefOr[String] = js.undefined
  var os_company: js.UndefOr[String] = js.undefined
  var os_family: js.UndefOr[String] = js.undefined
  var os_name: js.UndefOr[String] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object OpenMessageFilter {
  @scala.inline
  def apply(
    city: String = null,
    client_company: String = null,
    client_family: String = null,
    client_name: String = null,
    count: Int | Double = null,
    fromdate: String = null,
    offset: Int | Double = null,
    os_company: String = null,
    os_family: String = null,
    os_name: String = null,
    platform: String = null,
    region: String = null,
    tag: String = null,
    todate: String = null
  ): OpenMessageFilter = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (client_company != null) __obj.updateDynamic("client_company")(client_company)
    if (client_family != null) __obj.updateDynamic("client_family")(client_family)
    if (client_name != null) __obj.updateDynamic("client_name")(client_name)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fromdate != null) __obj.updateDynamic("fromdate")(fromdate)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (os_company != null) __obj.updateDynamic("os_company")(os_company)
    if (os_family != null) __obj.updateDynamic("os_family")(os_family)
    if (os_name != null) __obj.updateDynamic("os_name")(os_name)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (region != null) __obj.updateDynamic("region")(region)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (todate != null) __obj.updateDynamic("todate")(todate)
    __obj.asInstanceOf[OpenMessageFilter]
  }
}

