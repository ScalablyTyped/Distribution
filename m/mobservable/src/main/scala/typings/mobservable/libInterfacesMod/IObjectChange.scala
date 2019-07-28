package typings.mobservable.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectChange[T, R] extends js.Object {
  var name: String
  var `object`: R
  var oldValue: js.UndefOr[T] = js.undefined
  var `type`: String
}

object IObjectChange {
  @scala.inline
  def apply[T, R](name: String, `object`: R, `type`: String, oldValue: T = null): IObjectChange[T, R] = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectChange[T, R]]
  }
}

