package typings.naverWhale.whale.browsingData

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
    if (!js.isUndefined(extension)) __obj.updateDynamic("extension")(extension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(protectedWeb)) __obj.updateDynamic("protectedWeb")(protectedWeb.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unprotectedWeb)) __obj.updateDynamic("unprotectedWeb")(unprotectedWeb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginTypes]
  }
}

