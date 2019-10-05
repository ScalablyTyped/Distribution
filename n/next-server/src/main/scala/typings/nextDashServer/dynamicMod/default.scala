package typings.nextDashServer.dynamicMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponent[P]): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponentLoader[P]): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponentLoader[P], options: js.Any): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModuleOrOptions: AsyncComponent[P], options: js.Any): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModuleOrOptions: NextDynamicOptionsBase): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModuleOrOptions: NextDynamicOptionsBase, options: js.Any): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModule: AsyncComponentLoader[P], options: NextDynamicOptionsBase): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](asyncModule: AsyncComponent[P], options: NextDynamicOptionsBase): DynamicComponent[P] = js.native
  def apply[P /* <: js.Object */](options: NextDynamicLoaderOptions[P]): DynamicComponent[P] = js.native
  /**
    * Overloaded dynamic function.
    * https://github.com/zeit/next.js/blob/v8.0.4/packages/next-server/lib/dynamic.js#L24
    */
  // tslint:disable:no-unnecessary-generics
  def apply[P /* <: js.Object */, E /* <: StringDictionary[js.Any] */](options: NextModuleMapOptions[P, E]): DynamicComponent[P] = js.native
}

