package typings.nuxtjsAuth.mod.vueTypesVueAugmentingMod

import typings.nuxtjsAuth.mod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$auth")
  var $auth: Auth[_]
}

object Vue {
  @scala.inline
  def apply($auth: Auth[_]): Vue = {
    val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Vue]
  }
}

