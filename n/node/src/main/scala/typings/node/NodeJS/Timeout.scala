package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeout extends Timer

object Timeout {
  @scala.inline
  def apply(hasRef: () => Boolean, ref: () => Timeout, refresh: () => Timeout, unref: () => Timeout): Timeout = {
    val __obj = js.Dynamic.literal(hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), refresh = js.Any.fromFunction0(refresh), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timeout]
  }
}

