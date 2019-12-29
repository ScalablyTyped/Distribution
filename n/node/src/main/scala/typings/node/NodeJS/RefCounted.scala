package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefCounted extends js.Object {
  def ref(): this.type
  def unref(): this.type
}

object RefCounted {
  @scala.inline
  def apply(ref: () => RefCounted, unref: () => RefCounted): RefCounted = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[RefCounted]
  }
}

