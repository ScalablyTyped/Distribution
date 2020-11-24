package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentElementElement extends js.Object {
  
  var componentElement: typings.std.Element = js.native
}
object ComponentElementElement {
  
  @scala.inline
  def apply(componentElement: typings.std.Element): ComponentElementElement = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElementElement]
  }
  
  @scala.inline
  implicit class ComponentElementElementOps[Self <: ComponentElementElement] (val x: Self) extends AnyVal {
    
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
    def setComponentElement(value: typings.std.Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
  }
}
