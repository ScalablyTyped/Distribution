package typings
package nodeDashFibersLib.futureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers/future", JSImport.Namespace)
@js.native
class namespaced () extends Future

@JSImport("fibers/future", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def wait(future_list: js.Array[nodeDashFibersLib.futureMod.Future]): js.Any = js.native
  def wait(future: nodeDashFibersLib.futureMod.Future): js.Any = js.native
  def wrap(fn: js.Function): nodeDashFibersLib.futureMod.Future = js.native
}

