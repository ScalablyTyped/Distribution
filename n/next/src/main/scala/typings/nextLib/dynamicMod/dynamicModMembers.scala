package typings
package nextLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dynamic", JSImport.Namespace)
@js.native
object dynamicModMembers extends js.Object {
  def default[P](
    asyncModule: nextDashServerLib.dynamicMod.AsyncComponent[P],
    options: nextDashServerLib.dynamicMod.NextDynamicOptions[P]
  ): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  /**
   * Overloaded dynamic function.
   * https://github.com/zeit/next.js/blob/7.0.0/lib/dynamic.js#L55
   */
  def default[P](options: nextDashServerLib.dynamicMod.AsyncComponent[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
  /**
   * Overloaded dynamic function.
   * https://github.com/zeit/next.js/blob/7.0.0/lib/dynamic.js#L55
   */
  def default[P](options: nextDashServerLib.dynamicMod.NextDynamicOptions[P]): nextDashServerLib.dynamicMod.DynamicComponent[P] = js.native
}

