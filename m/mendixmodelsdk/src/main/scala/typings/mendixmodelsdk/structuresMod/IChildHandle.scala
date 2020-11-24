package typings.mendixmodelsdk.structuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChildHandle extends js.Object {
  
  var containingProperty: AbstractStructureProperty = js.native
  
  def delete(): Unit = js.native
  
  def detach(): Unit = js.native
}
object IChildHandle {
  
  @scala.inline
  def apply(containingProperty: AbstractStructureProperty, delete: () => Unit, detach: () => Unit): IChildHandle = {
    val __obj = js.Dynamic.literal(containingProperty = containingProperty.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), detach = js.Any.fromFunction0(detach))
    __obj.asInstanceOf[IChildHandle]
  }
  
  @scala.inline
  implicit class IChildHandleOps[Self <: IChildHandle] (val x: Self) extends AnyVal {
    
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
    def setContainingProperty(value: AbstractStructureProperty): Self = this.set("containingProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
  }
}
