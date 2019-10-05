package typings.atOktaOktaDashVue.atOktaOktaDashVueMod

import typings.atOktaOktaDashVue.atOktaOktaDashVueMod.OktaVuePlugin.OktaVueOptions
import typings.vue.typesPluginMod.PluginFunction
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
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

