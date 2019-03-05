package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncIterator[T] extends js.Object {
  var `return`: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Promise[IteratorResult[T]]]] = js.native
  var `throw`: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Promise[IteratorResult[T]]]] = js.native
  def next(): Promise[IteratorResult[T]] = js.native
  def next(value: js.Any): Promise[IteratorResult[T]] = js.native
}

