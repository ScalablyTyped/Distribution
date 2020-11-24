package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionSetProperties extends js.Object {
  
  def Clone(): IActionSetProperties = js.native
  
  var Properties: IDefaultProperties = js.native
}
object IActionSetProperties {
  
  @scala.inline
  def apply(Clone: () => IActionSetProperties, Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetProperties]
  }
  
  @scala.inline
  implicit class IActionSetPropertiesOps[Self <: IActionSetProperties] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IActionSetProperties): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProperties(value: IDefaultProperties): Self = this.set("Properties", value.asInstanceOf[js.Any])
  }
}
