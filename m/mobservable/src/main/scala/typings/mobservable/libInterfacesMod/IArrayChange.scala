package typings.mobservable.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArrayChange[T] extends js.Object {
  var index: Double
  var `object`: IObservableArray[T]
  var oldValue: T
  var `type`: String
}

object IArrayChange {
  @scala.inline
  def apply[T](index: Double, `object`: IObservableArray[T], oldValue: T, `type`: String): IArrayChange[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayChange[T]]
  }
}

