package typings.node.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pipe extends js.Object {
  def close(): Unit
  def hasRef(): Boolean
  def ref(): Unit
  def unref(): Unit
}

object Pipe {
  @scala.inline
  def apply(close: () => Unit, hasRef: () => Boolean, ref: () => Unit, unref: () => Unit): Pipe = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Pipe]
  }
}

