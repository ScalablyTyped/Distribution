package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.nextDashServer.dynamicMod.AsyncComponent
import typings.nextDashServer.dynamicMod.AsyncComponentLoader
import typings.nextDashServer.dynamicMod.DynamicComponent
import typings.nextDashServer.dynamicMod.NextDynamicLoaderOptions
import typings.nextDashServer.dynamicMod.NextDynamicOptionsBase
import typings.nextDashServer.dynamicMod.NextModuleMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def default[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponent[P]): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponentLoader[P]): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponentLoader[P], options: js.Any): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponent[P], options: js.Any): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: NextDynamicOptionsBase): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: NextDynamicOptionsBase, options: js.Any): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModule: AsyncComponentLoader[P], options: NextDynamicOptionsBase): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModule: AsyncComponent[P], options: NextDynamicOptionsBase): DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](options: NextDynamicLoaderOptions[P]): DynamicComponent[P] = js.native
  /**
    * Overloaded dynamic function.
    * https://github.com/zeit/next.js/blob/v8.0.4/packages/next-server/lib/dynamic.js#L24
    */
  // tslint:disable:no-unnecessary-generics
  def default[P /* <: js.Object */, E /* <: StringDictionary[js.Any] */](options: NextModuleMapOptions[P, E]): DynamicComponent[P] = js.native
}

