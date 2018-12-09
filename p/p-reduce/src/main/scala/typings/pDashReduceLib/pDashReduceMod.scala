package typings
package pDashReduceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-reduce", JSImport.Namespace)
@js.native
object pDashReduceMod extends js.Object {
  def apply[T, U](
    input: stdLib.Iterable[js.Thenable[T] | T],
    reducer: js.Function3[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* index */ scala.Double, 
      js.Promise[U] | U
    ]
  ): js.Promise[U] = js.native
  def apply[T, U](
    input: stdLib.Iterable[js.Thenable[T] | T],
    reducer: js.Function3[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* index */ scala.Double, 
      js.Promise[U] | U
    ],
    initialValue: U
  ): js.Promise[U] = js.native
}

