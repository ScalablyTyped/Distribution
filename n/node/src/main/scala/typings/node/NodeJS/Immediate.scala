package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Immediate extends RefCounted {
  var _onImmediate: js.Function
  def hasRef(): Boolean
}

object Immediate {
  @scala.inline
  def apply(_onImmediate: js.Function, hasRef: () => Boolean, ref: () => Immediate, unref: () => Immediate): Immediate = {
    val __obj = js.Dynamic.literal(_onImmediate = _onImmediate.asInstanceOf[js.Any], hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Immediate]
  }
}

