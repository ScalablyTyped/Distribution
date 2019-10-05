package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// compatibility with older typings
trait Timer extends js.Object {
  def hasRef(): Boolean
  def ref(): this.type
  def refresh(): this.type
  def unref(): this.type
}

object Timer {
  @scala.inline
  def apply(hasRef: () => Boolean, ref: () => Timer, refresh: () => Timer, unref: () => Timer): Timer = {
    val __obj = js.Dynamic.literal(hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), refresh = js.Any.fromFunction0(refresh), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timer]
  }
}

