package typings.atOktaOktaDashVue

import typings.atOktaOktaDashVue.atOktaOktaDashVueStrings.cookie
import typings.atOktaOktaDashVue.atOktaOktaDashVueStrings.localStorage
import typings.atOktaOktaDashVue.atOktaOktaDashVueStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoRenew extends js.Object {
  var autoRenew: js.UndefOr[Boolean] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var storage: js.UndefOr[localStorage | sessionStorage | cookie] = js.undefined
}

object Anon_AutoRenew {
  @scala.inline
  def apply(
    autoRenew: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    storage: localStorage | sessionStorage | cookie = null
  ): Anon_AutoRenew = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRenew)) __obj.updateDynamic("autoRenew")(autoRenew.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoRenew]
  }
}

