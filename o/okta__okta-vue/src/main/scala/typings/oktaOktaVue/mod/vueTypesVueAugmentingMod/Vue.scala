package typings.oktaOktaVue.mod.vueTypesVueAugmentingMod

import typings.oktaOktaVue.AnonAuthRedirectGuard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$auth")
  var $auth: AnonAuthRedirectGuard
}

object Vue {
  @scala.inline
  def apply($auth: AnonAuthRedirectGuard): Vue = {
    val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vue]
  }
}

