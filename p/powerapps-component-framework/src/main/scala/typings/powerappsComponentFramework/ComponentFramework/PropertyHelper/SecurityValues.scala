package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Entity metadata security values
  */
@js.native
trait SecurityValues extends js.Object {
  
  var editable: Boolean = js.native
  
  var readable: Boolean = js.native
  
  var secured: Boolean = js.native
}
object SecurityValues {
  
  @scala.inline
  def apply(editable: Boolean, readable: Boolean, secured: Boolean): SecurityValues = {
    val __obj = js.Dynamic.literal(editable = editable.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], secured = secured.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityValues]
  }
  
  @scala.inline
  implicit class SecurityValuesOps[Self <: SecurityValues] (val x: Self) extends AnyVal {
    
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
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecured(value: Boolean): Self = this.set("secured", value.asInstanceOf[js.Any])
  }
}
