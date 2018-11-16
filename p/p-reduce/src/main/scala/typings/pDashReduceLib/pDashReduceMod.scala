package typings
package pDashReduceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-reduce", JSImport.Namespace)
@js.native
object pDashReduceMod extends js.Object {
  def apply[T, U](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    reducer: js.Function3[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* index */ scala.Double, 
      stdLib.Promise[U] | U
    ]
  ): stdLib.Promise[U] = js.native
  def apply[T, U](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    reducer: js.Function3[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* index */ scala.Double, 
      stdLib.Promise[U] | U
    ],
    initialValue: U
  ): stdLib.Promise[U] = js.native
}

