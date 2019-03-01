package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectChange[T, R] extends js.Object {
  var name: java.lang.String
  var `object`: R
  var oldValue: js.UndefOr[T] = js.undefined
  var `type`: java.lang.String
}

object IObjectChange {
  @scala.inline
  def apply[T, R](name: java.lang.String, `object`: R, `type`: java.lang.String, oldValue: T = null): IObjectChange[T, R] = {
    val __obj = js.Dynamic.literal(`object` = `object`.asInstanceOf[js.Any], `type` = `type`)
    __obj.updateDynamic("name")(name)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectChange[T, R]]
  }
}

