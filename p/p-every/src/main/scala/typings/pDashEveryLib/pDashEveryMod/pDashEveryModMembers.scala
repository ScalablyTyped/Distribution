package typings
package pDashEveryLib.pDashEveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-every", JSImport.Namespace)
@js.native
object pDashEveryModMembers extends js.Object {
  def apply[T](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    testFn: js.Function2[
      /* element */ T, 
      /* index */ scala.Double, 
      scala.Boolean | stdLib.Promise[scala.Boolean]
    ]
  ): stdLib.Promise[scala.Boolean] = js.native
  def apply[T](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    testFn: js.Function2[
      /* element */ T, 
      /* index */ scala.Double, 
      scala.Boolean | stdLib.Promise[scala.Boolean]
    ],
    options: pDashEveryLib.pDashEveryMod.pEveryNs.Options
  ): stdLib.Promise[scala.Boolean] = js.native
}

