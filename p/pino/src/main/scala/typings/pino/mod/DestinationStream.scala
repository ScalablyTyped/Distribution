package typings.pino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestinationStream extends js.Object {
  def write(msg: String): Unit
}

object DestinationStream {
  @scala.inline
  def apply(write: String => Unit): DestinationStream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DestinationStream]
  }
}

