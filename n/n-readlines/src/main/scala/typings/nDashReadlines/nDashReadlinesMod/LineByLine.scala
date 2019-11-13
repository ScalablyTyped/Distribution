package typings.nDashReadlines.nDashReadlinesMod

import typings.nDashReadlines.nDashReadlinesNumbers.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineByLine extends js.Object {
  def close(): Unit
  def next(): Buffer | `false`
  def reset(): Unit
}

object LineByLine {
  @scala.inline
  def apply(close: () => Unit, next: () => Buffer | `false`, reset: () => Unit): LineByLine = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[LineByLine]
  }
}

