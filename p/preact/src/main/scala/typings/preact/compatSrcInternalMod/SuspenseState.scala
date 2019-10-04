package typings.preact.compatSrcInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseState extends js.Object {
  var _parkedChildren: js.Array[VNode[_]]
}

object SuspenseState {
  @scala.inline
  def apply(_parkedChildren: js.Array[VNode[_]]): SuspenseState = {
    val __obj = js.Dynamic.literal(_parkedChildren = _parkedChildren)
  
    __obj.asInstanceOf[SuspenseState]
  }
}

