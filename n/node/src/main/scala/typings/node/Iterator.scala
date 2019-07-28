package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterator[T] extends js.Object {
  def next(): IteratorResult[T] = js.native
  def next(value: js.Any): IteratorResult[T] = js.native
}

