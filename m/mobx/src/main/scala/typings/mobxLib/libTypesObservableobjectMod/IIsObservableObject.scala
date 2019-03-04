package typings
package mobxLib.libTypesObservableobjectMod

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
    val __obj = js.Dynamic.literal($mobx = $mobx)
  
    __obj.asInstanceOf[IIsObservableObject]
  }
}

