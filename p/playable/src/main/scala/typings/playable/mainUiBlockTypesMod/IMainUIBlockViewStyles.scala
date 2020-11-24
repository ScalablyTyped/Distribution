package typings.playable.mainUiBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMainUIBlockViewStyles extends js.Object {
  
  var hidden: String = js.native
  
  var mainUiBlock: String = js.native
  
  var tooltipContainerWrapper: String = js.native
}
object IMainUIBlockViewStyles {
  
  @scala.inline
  def apply(hidden: String, mainUiBlock: String, tooltipContainerWrapper: String): IMainUIBlockViewStyles = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], mainUiBlock = mainUiBlock.asInstanceOf[js.Any], tooltipContainerWrapper = tooltipContainerWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMainUIBlockViewStyles]
  }
  
  @scala.inline
  implicit class IMainUIBlockViewStylesOps[Self <: IMainUIBlockViewStyles] (val x: Self) extends AnyVal {
    
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
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUiBlock(value: String): Self = this.set("mainUiBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipContainerWrapper(value: String): Self = this.set("tooltipContainerWrapper", value.asInstanceOf[js.Any])
  }
}
