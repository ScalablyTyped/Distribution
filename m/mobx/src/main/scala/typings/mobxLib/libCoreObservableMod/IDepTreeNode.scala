package typings
package mobxLib.libCoreObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDepTreeNode extends js.Object {
  var name: java.lang.String
  var observing: js.UndefOr[js.Array[IObservable]] = js.undefined
}

object IDepTreeNode {
  @scala.inline
  def apply(name: java.lang.String, observing: js.Array[IObservable] = null): IDepTreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (observing != null) __obj.updateDynamic("observing")(observing)
    __obj.asInstanceOf[IDepTreeNode]
  }
}

