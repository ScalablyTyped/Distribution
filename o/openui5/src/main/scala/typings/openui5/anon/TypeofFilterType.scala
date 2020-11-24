package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFilterType extends js.Object {
  
  /**
    * Filters which are changed by the application
    */
  var Application: js.Any = js.native
  
  /**
    * Filters which are set by the different controls
    */
  var Control: js.Any = js.native
}
object TypeofFilterType {
  
  @scala.inline
  def apply(Application: js.Any, Control: js.Any): TypeofFilterType = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFilterType]
  }
  
  @scala.inline
  implicit class TypeofFilterTypeOps[Self <: TypeofFilterType] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: js.Any): Self = this.set("Control", value.asInstanceOf[js.Any])
  }
}
