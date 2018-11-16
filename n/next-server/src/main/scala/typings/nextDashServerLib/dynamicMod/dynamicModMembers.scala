package typings
package nextDashServerLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dynamic", JSImport.Namespace)
@js.native
object dynamicModMembers extends js.Object {
  def default[P](asyncModule: AsyncComponent[P], options: NextDynamicOptions[P]): DynamicComponent[P] = js.native
  /**
   * Overloaded dynamic function.
   * https://github.com/zeit/next.js/blob/7.0.0/lib/dynamic.js#L55
   */
  def default[P](options: AsyncComponent[P]): DynamicComponent[P] = js.native
  /**
   * Overloaded dynamic function.
   * https://github.com/zeit/next.js/blob/7.0.0/lib/dynamic.js#L55
   */
  def default[P](options: NextDynamicOptions[P]): DynamicComponent[P] = js.native
}

