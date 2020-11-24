package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedProperty[T] extends js.Object {
  
  var CanBeChanged: Boolean = js.native
  
  var ManagedPropertyLogicalName: String = js.native
  
  var Value: T = js.native
}
object ManagedProperty {
  
  @scala.inline
  def apply[T](CanBeChanged: Boolean, ManagedPropertyLogicalName: String, Value: T): ManagedProperty[T] = {
    val __obj = js.Dynamic.literal(CanBeChanged = CanBeChanged.asInstanceOf[js.Any], ManagedPropertyLogicalName = ManagedPropertyLogicalName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedProperty[T]]
  }
  
  @scala.inline
  implicit class ManagedPropertyOps[Self <: ManagedProperty[_], T] (val x: Self with ManagedProperty[T]) extends AnyVal {
    
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
    def setCanBeChanged(value: Boolean): Self = this.set("CanBeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertyLogicalName(value: String): Self = this.set("ManagedPropertyLogicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
