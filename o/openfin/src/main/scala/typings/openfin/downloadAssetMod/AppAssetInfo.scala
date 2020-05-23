package typings.openfin.downloadAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppAssetInfo extends js.Object {
  var alias: String
  var args: js.UndefOr[String] = js.undefined
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var src: String
  var target: js.UndefOr[String] = js.undefined
  var version: String
}

object AppAssetInfo {
  @scala.inline
  def apply(
    alias: String,
    src: String,
    version: String,
    args: String = null,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    target: String = null
  ): AppAssetInfo = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAssetInfo]
  }
}

