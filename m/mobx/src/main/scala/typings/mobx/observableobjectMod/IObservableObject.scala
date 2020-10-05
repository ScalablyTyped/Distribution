package typings.mobx.observableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableObject extends js.Object {
  var `observable-object`: IObservableObject = js.native
}

object IObservableObject {
  @scala.inline
  def apply(`observable-object`: IObservableObject): IObservableObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observable-object")(`observable-object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableObject]
  }
  @scala.inline
  implicit class IObservableObjectOps[Self <: IObservableObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setObservable-object`(value: IObservableObject): Self = this.set("observable-object", value.asInstanceOf[js.Any])
  }
  
}

