package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.VerticalAlignProperty
import typings.mjmlReact.mjmlReactStrings.`fixed-height`
import typings.mjmlReact.mjmlReactStrings.`fluid-height`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlHeroProps extends js.Object {
  
  var backgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var backgroundHeight: js.UndefOr[String] = js.native
  
  var backgroundPosition: js.UndefOr[BackgroundPositionProperty[String | Double]] = js.native
  
  var backgroundUrl: js.UndefOr[String] = js.native
  
  var backgroundWidth: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var mode: js.UndefOr[`fluid-height` | `fixed-height`] = js.native
  
  var verticalAlign: js.UndefOr[VerticalAlignProperty[String | Double]] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object MjmlHeroProps {
  
  @scala.inline
  def apply(): MjmlHeroProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlHeroProps]
  }
  
  @scala.inline
  implicit class MjmlHeroPropsOps[Self <: MjmlHeroProps] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: BackgroundColorProperty): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundHeight(value: String): Self = this.set("backgroundHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundHeight: Self = this.set("backgroundHeight", js.undefined)
    
    @scala.inline
    def setBackgroundPosition(value: BackgroundPositionProperty[String | Double]): Self = this.set("backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundPosition: Self = this.set("backgroundPosition", js.undefined)
    
    @scala.inline
    def setBackgroundUrl(value: String): Self = this.set("backgroundUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundUrl: Self = this.set("backgroundUrl", js.undefined)
    
    @scala.inline
    def setBackgroundWidth(value: String): Self = this.set("backgroundWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundWidth: Self = this.set("backgroundWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMode(value: `fluid-height` | `fixed-height`): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignProperty[String | Double]): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
