package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorParameterHintOptions extends js.Object {
  
  /**
    * Enable cycling of parameter hints.
    * Defaults to false.
    */
  var cycle: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable parameter hints.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object IEditorParameterHintOptions {
  
  @scala.inline
  def apply(): IEditorParameterHintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorParameterHintOptions]
  }
  
  @scala.inline
  implicit class IEditorParameterHintOptionsOps[Self <: IEditorParameterHintOptions] (val x: Self) extends AnyVal {
    
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
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
