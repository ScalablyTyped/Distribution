package typings.openfin.shapesLayoutMod

import typings.openfin.anon.Title
import typings.openfin.openfinStrings.component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutComponent extends js.Object {
  
  var componentName: String = js.native
  
  var componentState: Title = js.native
  
  var `type`: component = js.native
}
object LayoutComponent {
  
  @scala.inline
  def apply(componentName: String, componentState: Title, `type`: component): LayoutComponent = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], componentState = componentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutComponent]
  }
  
  @scala.inline
  implicit class LayoutComponentOps[Self <: LayoutComponent] (val x: Self) extends AnyVal {
    
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
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentState(value: Title): Self = this.set("componentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: component): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
