package typings.nodegit.revertMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mergeOptionsMod.MergeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertOptions
  extends /* key */ StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
  var mainline: js.UndefOr[Double] = js.undefined
  var mergeOpts: js.UndefOr[MergeOptions] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object RevertOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    checkoutOpts: CheckoutOptions = null,
    mainline: Int | Double = null,
    mergeOpts: MergeOptions = null,
    version: Int | Double = null
  ): RevertOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts.asInstanceOf[js.Any])
    if (mainline != null) __obj.updateDynamic("mainline")(mainline.asInstanceOf[js.Any])
    if (mergeOpts != null) __obj.updateDynamic("mergeOpts")(mergeOpts.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevertOptions]
  }
}

