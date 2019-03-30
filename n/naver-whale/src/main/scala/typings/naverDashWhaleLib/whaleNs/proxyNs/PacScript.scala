package typings
package naverDashWhaleLib.whaleNs.proxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PacScript extends js.Object {
  /** Optional. A PAC script. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. If true, an invalid PAC script will prevent the network stack from falling back to direct connections. Defaults to false. */
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. URL of the PAC file to be used. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object PacScript {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    mandatory: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): PacScript = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PacScript]
  }
}

