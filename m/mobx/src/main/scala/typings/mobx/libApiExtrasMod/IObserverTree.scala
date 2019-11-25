package typings.mobx.libApiExtrasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverTree extends js.Object {
  var name: String
  var observers: js.UndefOr[js.Array[IObserverTree]] = js.undefined
}

object IObserverTree {
  @scala.inline
  def apply(name: String, observers: js.Array[IObserverTree] = null): IObserverTree = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (observers != null) __obj.updateDynamic("observers")(observers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObserverTree]
  }
}

