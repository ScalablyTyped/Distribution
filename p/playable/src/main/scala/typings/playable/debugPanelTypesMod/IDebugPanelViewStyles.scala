package typings.playable.debugPanelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined playable.playable/dist/src/modules/ui/debug-panel/types.IDebugPanelHighlightStyles & {  debugPanel :string,   infoContainer :string,   closeButton :string,   hidden :string} */
@js.native
trait IDebugPanelViewStyles extends js.Object {
  
  var boolean: String = js.native
  
  var closeButton: String = js.native
  
  var debugPanel: String = js.native
  
  var hidden: String = js.native
  
  var infoContainer: String = js.native
  
  var key: String = js.native
  
  var `null`: String = js.native
  
  var number: String = js.native
  
  var string: String = js.native
}
object IDebugPanelViewStyles {
  
  @scala.inline
  def apply(
    boolean: String,
    closeButton: String,
    debugPanel: String,
    hidden: String,
    infoContainer: String,
    key: String,
    `null`: String,
    number: String,
    string: String
  ): IDebugPanelViewStyles = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], closeButton = closeButton.asInstanceOf[js.Any], debugPanel = debugPanel.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], infoContainer = infoContainer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugPanelViewStyles]
  }
  
  @scala.inline
  implicit class IDebugPanelViewStylesOps[Self <: IDebugPanelViewStyles] (val x: Self) extends AnyVal {
    
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
    def setBoolean(value: String): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButton(value: String): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugPanel(value: String): Self = this.set("debugPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoContainer(value: String): Self = this.set("infoContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNull(value: String): Self = this.set("null", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
