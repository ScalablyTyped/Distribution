package typings.oktaOktaVue.mod

import typings.oktaOktaVue.mod.OktaVuePlugin.OktaVueOptions
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@okta/okta-vue", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): PluginFunction[VueConstructor[Vue]] = js.native
  def handleCallback(): VueConstructor[Vue] = js.native
  def install(vm: VueConstructor[Vue], options: OktaVueOptions): PluginFunction[VueConstructor[Vue]] = js.native
}

