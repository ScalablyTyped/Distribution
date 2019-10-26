package typings.node

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterator[T] extends js.Object {
  def next(): IteratorResult[T, _] = js.native
  def next(value: js.Any): IteratorResult[T, _] = js.native
}

