package typings.popmotion.libAnimationsSpringTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringInterface extends js.Object {
  def stop(): Unit
}

object SpringInterface {
  @scala.inline
  def apply(stop: () => Unit): SpringInterface = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[SpringInterface]
  }
}

