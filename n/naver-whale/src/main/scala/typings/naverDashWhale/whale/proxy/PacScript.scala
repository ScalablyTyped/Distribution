package typings.naverDashWhale.whale.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PacScript extends js.Object {
  /** Optional. A PAC script. */
  var data: js.UndefOr[String] = js.undefined
  /** Optional. If true, an invalid PAC script will prevent the network stack from falling back to direct connections. Defaults to false. */
  var mandatory: js.UndefOr[Boolean] = js.undefined
  /** Optional. URL of the PAC file to be used. */
  var url: js.UndefOr[String] = js.undefined
}

object PacScript {
  @scala.inline
  def apply(data: String = null, mandatory: js.UndefOr[Boolean] = js.undefined, url: String = null): PacScript = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PacScript]
  }
}

