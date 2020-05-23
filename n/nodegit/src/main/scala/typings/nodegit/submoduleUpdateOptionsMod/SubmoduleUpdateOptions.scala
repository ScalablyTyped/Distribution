package typings.nodegit.submoduleUpdateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.fetchOptionsMod.FetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmoduleUpdateOptions
  extends /* key */ StringDictionary[js.Any] {
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.undefined
  var cloneCheckoutStrategy: js.UndefOr[Double] = js.undefined
  var fetchOpts: js.UndefOr[FetchOptions] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object SubmoduleUpdateOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    checkoutOpts: CheckoutOptions = null,
    cloneCheckoutStrategy: js.UndefOr[Double] = js.undefined,
    fetchOpts: FetchOptions = null,
    version: js.UndefOr[Double] = js.undefined
  ): SubmoduleUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkoutOpts != null) __obj.updateDynamic("checkoutOpts")(checkoutOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(cloneCheckoutStrategy)) __obj.updateDynamic("cloneCheckoutStrategy")(cloneCheckoutStrategy.get.asInstanceOf[js.Any])
    if (fetchOpts != null) __obj.updateDynamic("fetchOpts")(fetchOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmoduleUpdateOptions]
  }
}

