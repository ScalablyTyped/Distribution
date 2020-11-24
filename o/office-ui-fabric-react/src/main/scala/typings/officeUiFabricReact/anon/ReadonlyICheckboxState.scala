package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/Checkbox/Checkbox.base.ICheckboxState> */
@js.native
trait ReadonlyICheckboxState extends js.Object {
  
  val isChecked: js.UndefOr[Boolean] = js.native
  
  val isIndeterminate: js.UndefOr[Boolean] = js.native
}
object ReadonlyICheckboxState {
  
  @scala.inline
  def apply(): ReadonlyICheckboxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyICheckboxState]
  }
  
  @scala.inline
  implicit class ReadonlyICheckboxStateOps[Self <: ReadonlyICheckboxState] (val x: Self) extends AnyVal {
    
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
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    
    @scala.inline
    def setIsIndeterminate(value: Boolean): Self = this.set("isIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIndeterminate: Self = this.set("isIndeterminate", js.undefined)
  }
}
