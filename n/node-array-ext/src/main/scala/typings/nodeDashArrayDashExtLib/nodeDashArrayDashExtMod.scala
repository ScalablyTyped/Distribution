package typings
package nodeDashArrayDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-array-ext", JSImport.Namespace)
@js.native
object nodeDashArrayDashExtMod extends js.Object {
  def asyncEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ scala.Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def awaitEach[T](
    array: js.Array[T],
    each: js.Function3[
      /* i */ scala.Double, 
      /* element */ T, 
      /* done */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    finish: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

