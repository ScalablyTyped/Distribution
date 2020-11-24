package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentPath extends js.Object {
  
  var componentPath: js.UndefOr[String] = js.native
}
object ComponentPath {
  
  @scala.inline
  def apply(): ComponentPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentPath]
  }
  
  @scala.inline
  implicit class ComponentPathOps[Self <: ComponentPath] (val x: Self) extends AnyVal {
    
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
    def setComponentPath(value: String): Self = this.set("componentPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentPath: Self = this.set("componentPath", js.undefined)
  }
}
