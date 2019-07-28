package typings.pause.pauseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Handle extends js.Object {
  def end(): Unit
  def resume(): Unit
}

object Handle {
  @scala.inline
  def apply(end: () => Unit, resume: () => Unit): Handle = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), resume = js.Any.fromFunction0(resume))
  
    __obj.asInstanceOf[Handle]
  }
}

