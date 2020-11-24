package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.GoldenLayout.ItemConfigType because Already inherited */ @js.native
trait ComponentConfig extends ItemConfig {
  
  /**
    * The name of the component as specified in layout.registerComponent. Mandatory if type is 'component'.
    */
  var componentName: String = js.native
  
  /**
    * A serialisable object. Will be passed to the component constructor function and will be the value returned by
    * container.getState().
    */
  var componentState: js.UndefOr[js.Any] = js.native
}
object ComponentConfig {
  
  @scala.inline
  def apply(componentName: String, `type`: String): ComponentConfig = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
  
  @scala.inline
  implicit class ComponentConfigOps[Self <: ComponentConfig] (val x: Self) extends AnyVal {
    
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
    def setComponentState(value: js.Any): Self = this.set("componentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentState: Self = this.set("componentState", js.undefined)
  }
}
