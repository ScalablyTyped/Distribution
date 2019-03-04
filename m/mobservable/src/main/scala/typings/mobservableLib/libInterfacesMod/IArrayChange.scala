package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayChange[T] extends js.Object {
  var index: scala.Double
  var `object`: IObservableArray[T]
  var oldValue: T
  var `type`: java.lang.String
}

object IArrayChange {
  @scala.inline
  def apply[T](index: scala.Double, `object`: IObservableArray[T], oldValue: T, `type`: java.lang.String): IArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index, oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IArrayChange[T]]
  }
}

