package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessSessionControl extends js.Object {
  
  // Specifies whether the session control is enabled.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.native
}
object ConditionalAccessSessionControl {
  
  @scala.inline
  def apply(): ConditionalAccessSessionControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessSessionControl]
  }
  
  @scala.inline
  implicit class ConditionalAccessSessionControlOps[Self <: ConditionalAccessSessionControl] (val x: Self) extends AnyVal {
    
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
    def setIsEnabled(value: NullableOption[Boolean]): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setIsEnabledNull: Self = this.set("isEnabled", null)
  }
}
