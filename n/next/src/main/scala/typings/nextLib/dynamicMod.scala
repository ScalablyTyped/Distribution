package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dynamic", JSImport.Namespace)
@js.native
object dynamicMod extends js.Object {
  def default[P /* <: js.Object */](asyncModuleOrOptions: nextDashServerLib.dynamicMod.AsyncComponent[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: nextDashServerLib.dynamicMod.AsyncComponentLoader[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: nextDashServerLib.dynamicMod.AsyncComponentLoader[P], options: js.Any): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: nextDashServerLib.dynamicMod.AsyncComponent[P], options: js.Any): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: nextDashServerLib.dynamicMod.NextDynamicOptionsBase): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](asyncModuleOrOptions: nextDashServerLib.dynamicMod.NextDynamicOptionsBase, options: js.Any): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](
    asyncModule: nextDashServerLib.dynamicMod.AsyncComponentLoader[P],
    options: nextDashServerLib.dynamicMod.NextDynamicOptionsBase
  ): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](
    asyncModule: nextDashServerLib.dynamicMod.AsyncComponent[P],
    options: nextDashServerLib.dynamicMod.NextDynamicOptionsBase
  ): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  def default[P /* <: js.Object */](options: nextDashServerLib.dynamicMod.NextDynamicLoaderOptions[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  /**
    * Overloaded dynamic function.
    * https://github.com/zeit/next.js/blob/v8.0.4/packages/next-server/lib/dynamic.js#L24
    */
  // tslint:disable:no-unnecessary-generics
  def default[P /* <: js.Object */, E /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](options: nextDashServerLib.dynamicMod.NextModuleMapOptions[P, E]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
}

