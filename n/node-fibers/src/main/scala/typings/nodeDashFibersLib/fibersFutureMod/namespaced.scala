package typings
package nodeDashFibersLib.fibersFutureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers/future", JSImport.Namespace)
@js.native
class namespaced () extends Future

@JSImport("fibers/future", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def wait(future_list: js.Array[nodeDashFibersLib.fibersFutureMod.Future]): js.Any = js.native
  def wait(future: nodeDashFibersLib.fibersFutureMod.Future): js.Any = js.native
  def wrap(fn: js.Function): nodeDashFibersLib.fibersFutureMod.Future = js.native
}

