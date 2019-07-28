package typings.naverDashWhale.whaleNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginTypes extends js.Object {
  /** Optional. Extensions and packaged applications a user has installed (be _really_ careful!).  */
  var extension: js.UndefOr[Boolean] = js.undefined
  /** Optional. Websites that have been installed as hosted applications (be careful!).  */
  var protectedWeb: js.UndefOr[Boolean] = js.undefined
  /** Optional. Normal websites.  */
  var unprotectedWeb: js.UndefOr[Boolean] = js.undefined
}

object OriginTypes {
  @scala.inline
  def apply(
    extension: js.UndefOr[Boolean] = js.undefined,
    protectedWeb: js.UndefOr[Boolean] = js.undefined,
    unprotectedWeb: js.UndefOr[Boolean] = js.undefined
  ): OriginTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension)
    if (!js.isUndefined(protectedWeb)) __obj.updateDynamic("protectedWeb")(protectedWeb)
    if (!js.isUndefined(unprotectedWeb)) __obj.updateDynamic("unprotectedWeb")(unprotectedWeb)
    __obj.asInstanceOf[OriginTypes]
  }
}

