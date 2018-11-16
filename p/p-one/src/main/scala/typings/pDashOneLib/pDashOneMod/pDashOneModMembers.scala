package typings
package pDashOneLib.pDashOneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-one", JSImport.Namespace)
@js.native
object pDashOneModMembers extends js.Object {
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
    options: pDashOneLib.pDashOneMod.pOneNs.Options
  ): stdLib.Promise[scala.Boolean] = js.native
}

