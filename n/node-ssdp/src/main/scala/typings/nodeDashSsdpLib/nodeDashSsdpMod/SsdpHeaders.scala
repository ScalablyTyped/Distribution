package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SsdpHeaders
  extends /* key */ ScalablyTyped.runtime.StringDictionary[
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

