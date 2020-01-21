package typings.nodeSsdp.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SsdpHeaders
  extends /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | js.Symbol]] {
  /**
  	 * Available while handling an SSDP response. A URL where the service description can be found.
  	 */
  var LOCATION: js.UndefOr[String] = js.undefined
  var ST: js.UndefOr[String] = js.undefined
  /**
  	 * Available while handling an SSDP response. The Unique Service Name (USN) of the responding device.
  	 */
  var USN: js.UndefOr[String] = js.undefined
}

object SsdpHeaders {
  @scala.inline
  def apply(
    LOCATION: String = null,
    ST: String = null,
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Double | Boolean | Null | js.Symbol]] = null,
    USN: String = null
  ): SsdpHeaders = {
    val __obj = js.Dynamic.literal()
    if (LOCATION != null) __obj.updateDynamic("LOCATION")(LOCATION.asInstanceOf[js.Any])
    if (ST != null) __obj.updateDynamic("ST")(ST.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (USN != null) __obj.updateDynamic("USN")(USN.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsdpHeaders]
  }
}

