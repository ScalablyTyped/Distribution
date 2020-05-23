package typings.oktaOktaVue.mod.vueTypesVueAugmentingMod

import typings.oktaOktaVue.anon.AuthRedirectGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$auth")
  var $auth: AuthRedirectGuard
}

object Vue {
  @scala.inline
  def apply($auth: AuthRedirectGuard): Vue = {
    val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
}

