package typings.mobx.observableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIsObservableObject extends js.Object {
  @JSName("$mobx")
  var $mobx: ObservableObjectAdministration
}

object IIsObservableObject {
  @scala.inline
  def apply($mobx: ObservableObjectAdministration): IIsObservableObject = {
    val __obj = js.Dynamic.literal($mobx = $mobx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIsObservableObject]
  }
}

