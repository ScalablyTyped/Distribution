package typings.playable.topBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITopBlockViewStyles extends js.Object {
  
  var activated: String = js.native
  
  var elementsContainer: String = js.native
  
  var hidden: String = js.native
  
  var liveIndicatorContainer: String = js.native
  
  var titleContainer: String = js.native
  
  var topBlock: String = js.native
}
object ITopBlockViewStyles {
  
  @scala.inline
  def apply(
    activated: String,
    elementsContainer: String,
    hidden: String,
    liveIndicatorContainer: String,
    titleContainer: String,
    topBlock: String
  ): ITopBlockViewStyles = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], elementsContainer = elementsContainer.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicatorContainer = liveIndicatorContainer.asInstanceOf[js.Any], titleContainer = titleContainer.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopBlockViewStyles]
  }
  
  @scala.inline
  implicit class ITopBlockViewStylesOps[Self <: ITopBlockViewStyles] (val x: Self) extends AnyVal {
    
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
    def setActivated(value: String): Self = this.set("activated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsContainer(value: String): Self = this.set("elementsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveIndicatorContainer(value: String): Self = this.set("liveIndicatorContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleContainer(value: String): Self = this.set("titleContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBlock(value: String): Self = this.set("topBlock", value.asInstanceOf[js.Any])
  }
}
