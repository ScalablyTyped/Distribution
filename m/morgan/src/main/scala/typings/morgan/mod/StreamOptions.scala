package typings.morgan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOptions extends js.Object {
  /**
    * Output stream for writing log lines.
    */
  def write(str: String): Unit
}

object StreamOptions {
  @scala.inline
  def apply(write: String => Unit): StreamOptions = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[StreamOptions]
  }
}

