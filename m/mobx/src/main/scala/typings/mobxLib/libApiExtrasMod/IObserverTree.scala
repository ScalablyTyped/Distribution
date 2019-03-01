package typings
package mobxLib.libApiExtrasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObserverTree extends js.Object {
  var name: java.lang.String
  var observers: js.UndefOr[js.Array[IObserverTree]] = js.undefined
}

object IObserverTree {
  @scala.inline
  def apply(name: java.lang.String, observers: js.Array[IObserverTree] = null): IObserverTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (observers != null) __obj.updateDynamic("observers")(observers)
    __obj.asInstanceOf[IObserverTree]
  }
}

