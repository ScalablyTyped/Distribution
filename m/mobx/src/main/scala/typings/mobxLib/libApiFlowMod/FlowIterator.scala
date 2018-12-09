package typings
package mobxLib.libApiFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowIterator[T] extends js.Object {
  var `return`: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[js.Any], 
      stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]]
    ]
  ] = js.native
  var `throw`: js.UndefOr[
    js.Function1[
      /* e */ js.UndefOr[js.Any], 
      stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]]
    ]
  ] = js.native
  def next(): stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]] = js.native
  def next(value: js.Any): stdLib.IteratorResult[T] | js.Promise[stdLib.IteratorResult[T]] = js.native
}

