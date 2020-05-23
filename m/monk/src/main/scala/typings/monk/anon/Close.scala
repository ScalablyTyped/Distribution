package typings.monk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Close extends js.Object {
  def close(): Unit
  def pause(): Unit
  def resume(): Unit
}

object Close {
  @scala.inline
  def apply(close: () => Unit, pause: () => Unit, resume: () => Unit): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[Close]
  }
}

