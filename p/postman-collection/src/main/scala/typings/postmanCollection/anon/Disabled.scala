package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled[TDefinition /* <: js.Object */] extends js.Object {
  
  var disabled: Boolean = js.native
  
  var info: TDefinition = js.native
}
object Disabled {
  
  @scala.inline
  def apply[TDefinition /* <: js.Object */](disabled: Boolean, info: TDefinition): Disabled[TDefinition] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[TDefinition]]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled[_], TDefinition /* <: js.Object */] (val x: Self with Disabled[TDefinition]) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: TDefinition): Self = this.set("info", value.asInstanceOf[js.Any])
  }
}
