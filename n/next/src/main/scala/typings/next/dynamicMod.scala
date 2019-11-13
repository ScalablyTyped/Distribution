package typings.next

import typings.next.distNextDashServerLibDynamicMod.DynamicOptions
import typings.next.distNextDashServerLibDynamicMod.LoadableFn
import typings.next.distNextDashServerLibDynamicMod.LoadableOptions
import typings.next.distNextDashServerLibDynamicMod.Loader
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, _]) | FunctionComponent[P] | js.Function0[Element] = js.native
}

