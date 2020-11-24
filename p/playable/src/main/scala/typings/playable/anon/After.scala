package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait After extends js.Object {
  
  @JSName("&:after")
  var AmpersandColonafter: BackgroundColor = js.native
  
  def backgroundColor(data: IThemeConfig): String = js.native
}
object After {
  
  @scala.inline
  def apply(AmpersandColonafter: BackgroundColor, backgroundColor: IThemeConfig => String): After = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor))
    __obj.updateDynamic("&:after")(AmpersandColonafter.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit class AfterOps[Self <: After] (val x: Self) extends AnyVal {
    
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
    def setAmpersandColonafter(value: BackgroundColor): Self = this.set("&:after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: IThemeConfig => String): Self = this.set("backgroundColor", js.Any.fromFunction1(value))
  }
}
