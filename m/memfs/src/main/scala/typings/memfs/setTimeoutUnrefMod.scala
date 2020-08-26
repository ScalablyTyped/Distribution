package typings.memfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/setTimeoutUnref", JSImport.Namespace)
@js.native
object setTimeoutUnrefMod extends js.Object {
  /**
    * `setTimeoutUnref` is just like `setTimeout`,
    * only in Node's environment it will "unref" its macro task.
    */
  def default(callback: js.Any): js.Object = js.native
  def default(callback: js.Any, time: js.UndefOr[scala.Nothing], args: js.Any): js.Object = js.native
  def default(callback: js.Any, time: js.Any): js.Object = js.native
  def default(callback: js.Any, time: js.Any, args: js.Any): js.Object = js.native
  type TSetTimeout = js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* time */ js.UndefOr[Double], 
    /* args */ js.UndefOr[js.Array[js.Any]], 
    js.Any
  ]
}

