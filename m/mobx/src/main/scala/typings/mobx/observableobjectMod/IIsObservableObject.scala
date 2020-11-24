package typings.mobx.observableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIsObservableObject extends js.Object {
  
  @JSName("$mobx")
  var $mobx: ObservableObjectAdministration = js.native
}
object IIsObservableObject {
  
  @scala.inline
  def apply($mobx: ObservableObjectAdministration): IIsObservableObject = {
    val __obj = js.Dynamic.literal($mobx = $mobx.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsObservableObject]
  }
  
  @scala.inline
  implicit class IIsObservableObjectOps[Self <: IIsObservableObject] (val x: Self) extends AnyVal {
    
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
    def set$mobx(value: ObservableObjectAdministration): Self = this.set("$mobx", value.asInstanceOf[js.Any])
  }
}
