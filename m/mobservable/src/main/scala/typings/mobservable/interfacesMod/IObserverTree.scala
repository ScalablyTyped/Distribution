package typings.mobservable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverTree extends js.Object {
  var context: js.Any
  var id: Double
  var listeners: js.UndefOr[Double] = js.undefined
  var name: String
  var observers: js.UndefOr[js.Array[IObserverTree]] = js.undefined
}

object IObserverTree {
  @scala.inline
  def apply(
    context: js.Any,
    id: Double,
    name: String,
    listeners: Int | Double = null,
    observers: js.Array[IObserverTree] = null
  ): IObserverTree = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (observers != null) __obj.updateDynamic("observers")(observers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObserverTree]
  }
}

