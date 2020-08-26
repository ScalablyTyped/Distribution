package typings.nuxtjsAuth.mod.vueTypesVueAugmentingMod

import typings.nuxtjsAuth.mod.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$auth")
  var $auth: Auth[_] = js.native
}

object Vue {
  @scala.inline
  def apply($auth: Auth[_]): Vue = {
    val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
  @scala.inline
  implicit class VueOps[Self <: Vue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$auth(value: Auth[_]): Self = this.set("$auth", value.asInstanceOf[js.Any])
  }
  
}

