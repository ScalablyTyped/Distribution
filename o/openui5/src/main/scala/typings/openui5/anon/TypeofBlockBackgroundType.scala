package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBlockBackgroundType extends js.Object {
  
  /**
    * Background is transparent
    */
  var Default: js.Any = js.native
  
  /**
    * Background is with predefined light colors
    */
  var Light: js.Any = js.native
}
object TypeofBlockBackgroundType {
  
  @scala.inline
  def apply(Default: js.Any, Light: js.Any): TypeofBlockBackgroundType = {
    val __obj = js.Dynamic.literal(Default = Default.asInstanceOf[js.Any], Light = Light.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBlockBackgroundType]
  }
  
  @scala.inline
  implicit class TypeofBlockBackgroundTypeOps[Self <: TypeofBlockBackgroundType] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: js.Any): Self = this.set("Light", value.asInstanceOf[js.Any])
  }
}
