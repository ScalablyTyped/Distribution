package typings.nextDashServer.distLibDynamicMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/dynamic", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = js.native
  def apply[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = js.native
  def apply[P](dynamicOptions: Loader[P]): ComponentType[P] = js.native
  def apply[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = js.native
}

