package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stop extends js.Object {
  def stop(): Unit
}

object Anon_Stop {
  @scala.inline
  def apply(stop: () => Unit): Anon_Stop = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Anon_Stop]
  }
}

