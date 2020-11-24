package typings.playable.screenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenViewStyles extends js.Object {
  
  var blurMode: String = js.native
  
  var fillMode: String = js.native
  
  var hidden: String = js.native
  
  var hiddenCursor: String = js.native
  
  var horizontalStripes: String = js.native
  
  var regularMode: String = js.native
  
  var screen: String = js.native
  
  var screenBottomBackground: String = js.native
  
  var screenTopBackground: String = js.native
  
  var verticalStripes: String = js.native
  
  var visible: String = js.native
}
object IScreenViewStyles {
  
  @scala.inline
  def apply(
    blurMode: String,
    fillMode: String,
    hidden: String,
    hiddenCursor: String,
    horizontalStripes: String,
    regularMode: String,
    screen: String,
    screenBottomBackground: String,
    screenTopBackground: String,
    verticalStripes: String,
    visible: String
  ): IScreenViewStyles = {
    val __obj = js.Dynamic.literal(blurMode = blurMode.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hiddenCursor = hiddenCursor.asInstanceOf[js.Any], horizontalStripes = horizontalStripes.asInstanceOf[js.Any], regularMode = regularMode.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], screenBottomBackground = screenBottomBackground.asInstanceOf[js.Any], screenTopBackground = screenTopBackground.asInstanceOf[js.Any], verticalStripes = verticalStripes.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScreenViewStyles]
  }
  
  @scala.inline
  implicit class IScreenViewStylesOps[Self <: IScreenViewStyles] (val x: Self) extends AnyVal {
    
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
    def setBlurMode(value: String): Self = this.set("blurMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillMode(value: String): Self = this.set("fillMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCursor(value: String): Self = this.set("hiddenCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalStripes(value: String): Self = this.set("horizontalStripes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularMode(value: String): Self = this.set("regularMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: String): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenBottomBackground(value: String): Self = this.set("screenBottomBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenTopBackground(value: String): Self = this.set("screenTopBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalStripes(value: String): Self = this.set("verticalStripes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
