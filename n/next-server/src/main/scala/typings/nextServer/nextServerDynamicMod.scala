package typings.nextServer

import typings.nextServer.dynamicMod.DynamicOptions
import typings.nextServer.dynamicMod.LoadableFn
import typings.nextServer.dynamicMod.LoadableOptions
import typings.nextServer.dynamicMod.Loader
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Namespace)
@js.native
object nextServerDynamicMod extends js.Object {
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = js.native
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, _]) | FunctionComponent[P] | js.Function0[Element] = js.native
}

