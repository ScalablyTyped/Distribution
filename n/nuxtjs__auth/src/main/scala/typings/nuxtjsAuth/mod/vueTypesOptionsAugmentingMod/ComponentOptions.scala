package typings.nuxtjsAuth.mod.vueTypesOptionsAugmentingMod

import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var auth: js.UndefOr[Boolean | String] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](auth: Boolean | String = null): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

