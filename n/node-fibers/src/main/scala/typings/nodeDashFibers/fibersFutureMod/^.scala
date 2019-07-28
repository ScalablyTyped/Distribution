package typings.nodeDashFibers.fibersFutureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers/future", JSImport.Namespace)
@js.native
class ^ () extends Future

@JSImport("fibers/future", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def wait(future_list: js.Array[Future]): js.Any = js.native
  def wait(future: Future): js.Any = js.native
  def wrap(fn: js.Function): Future = js.native
}

