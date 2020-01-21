package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  def close(): Unit
  def pause(): Unit
  def resume(): Unit
}

object AnonClose {
  @scala.inline
  def apply(close: () => Unit, pause: () => Unit, resume: () => Unit): AnonClose = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
  
    __obj.asInstanceOf[AnonClose]
  }
}

