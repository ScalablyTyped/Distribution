package typings.nodegit.cherryPickOptionsMod

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mergeOptionsMod.MergeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CherrypickOptions extends js.Object {
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
  var mainline: js.UndefOr[Double] = js.undefined
  var mergeOpts: js.UndefOr[MergeOptions] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object CherrypickOptions {
  @scala.inline
  def apply(
    checkoutOpts: CheckoutOptions = null,
    mainline: js.UndefOr[Double] = js.undefined,
    mergeOpts: MergeOptions = null,
    version: js.UndefOr[Double] = js.undefined
  ): CherrypickOptions = {
    val __obj = js.Dynamic.literal()
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(mainline)) __obj.updateDynamic("mainline")(mainline.get.asInstanceOf[js.Any])
    if (mergeOpts != null) __obj.updateDynamic("mergeOpts")(mergeOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CherrypickOptions]
  }
}

