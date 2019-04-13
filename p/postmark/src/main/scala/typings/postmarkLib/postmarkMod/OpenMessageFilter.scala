package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMessageFilter extends BaseFilter {
  var city: js.UndefOr[java.lang.String] = js.undefined
  var client_company: js.UndefOr[java.lang.String] = js.undefined
  var client_family: js.UndefOr[java.lang.String] = js.undefined
  var client_name: js.UndefOr[java.lang.String] = js.undefined
  var os_company: js.UndefOr[java.lang.String] = js.undefined
  var os_family: js.UndefOr[java.lang.String] = js.undefined
  var os_name: js.UndefOr[java.lang.String] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object OpenMessageFilter {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    client_company: java.lang.String = null,
    client_family: java.lang.String = null,
    client_name: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    fromdate: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    os_company: java.lang.String = null,
    os_family: java.lang.String = null,
    os_name: java.lang.String = null,
    platform: java.lang.String = null,
    region: java.lang.String = null,
    tag: java.lang.String = null,
    todate: java.lang.String = null
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

