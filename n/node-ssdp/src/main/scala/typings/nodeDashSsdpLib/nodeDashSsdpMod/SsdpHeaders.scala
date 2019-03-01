package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SsdpHeaders
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Symbol]
    ] {
  /**
  	 * Available while handling an SSDP response. A URL where the service description can be found.
  	 */
  var LOCATION: js.UndefOr[java.lang.String] = js.undefined
  var ST: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Available while handling an SSDP response. The Unique Service Name (USN) of the responding device.
  	 */
  var USN: js.UndefOr[java.lang.String] = js.undefined
}

object SsdpHeaders {
  @scala.inline
  def apply(
    LOCATION: java.lang.String = null,
    ST: java.lang.String = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Symbol]
    ] = null,
    USN: java.lang.String = null
  ): SsdpHeaders = {
    val __obj = js.Dynamic.literal()
    if (LOCATION != null) __obj.updateDynamic("LOCATION")(LOCATION)
    if (ST != null) __obj.updateDynamic("ST")(ST)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (USN != null) __obj.updateDynamic("USN")(USN)
    __obj.asInstanceOf[SsdpHeaders]
  }
}

