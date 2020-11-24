package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAutomaticPermissions extends js.Object {
  
  var CanDeactivate: Boolean = js.native
  
  def Clone(): IAutomaticPermissions = js.native
  
  val IsBasedOnObjectACL: Boolean = js.native
  
  val IsDefault: Boolean = js.native
  
  val NamedACL: INamedACL = js.native
  
  def SetBasedOnObjectACL(): Unit = js.native
  
  def SetNamedACL(NamedACL: INamedACL): Unit = js.native
}
object IAutomaticPermissions {
  
  @scala.inline
  def apply(
    CanDeactivate: Boolean,
    Clone: () => IAutomaticPermissions,
    IsBasedOnObjectACL: Boolean,
    IsDefault: Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: () => Unit,
    SetNamedACL: INamedACL => Unit
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), IsBasedOnObjectACL = IsBasedOnObjectACL.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], SetBasedOnObjectACL = js.Any.fromFunction0(SetBasedOnObjectACL), SetNamedACL = js.Any.fromFunction1(SetNamedACL))
    __obj.asInstanceOf[IAutomaticPermissions]
  }
  
  @scala.inline
  implicit class IAutomaticPermissionsOps[Self <: IAutomaticPermissions] (val x: Self) extends AnyVal {
    
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
    def setCanDeactivate(value: Boolean): Self = this.set("CanDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAutomaticPermissions): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBasedOnObjectACL(value: Boolean): Self = this.set("IsBasedOnObjectACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACL(value: INamedACL): Self = this.set("NamedACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBasedOnObjectACL(value: () => Unit): Self = this.set("SetBasedOnObjectACL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNamedACL(value: INamedACL => Unit): Self = this.set("SetNamedACL", js.Any.fromFunction1(value))
  }
}
