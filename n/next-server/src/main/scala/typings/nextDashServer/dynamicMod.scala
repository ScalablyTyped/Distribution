package typings.nextDashServer

import typings.nextDashServer.distLibDynamicMod.DynamicOptions
import typings.nextDashServer.distLibDynamicMod.LoadableFn
import typings.nextDashServer.distLibDynamicMod.LoadableOptions
import typings.nextDashServer.distLibDynamicMod.Loader
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, _]) | FunctionComponent[P] | js.Function0[Element] = js.native
}

