package typings.mobx.libTypesObservableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableObject extends js.Object {
  var `observable-object`: IObservableObject
}

object IObservableObject {
  @scala.inline
  def apply(`observable-object`: IObservableObject): IObservableObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observable-object")(`observable-object`)
    __obj.asInstanceOf[IObservableObject]
  }
}

