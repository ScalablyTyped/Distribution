package typings.playable.themeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeConfig extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var progressColor: js.UndefOr[String] = js.native
}
object IThemeConfig {
  
  @scala.inline
  def apply(): IThemeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeConfig]
  }
  
  @scala.inline
  implicit class IThemeConfigOps[Self <: IThemeConfig] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setProgressColor(value: String): Self = this.set("progressColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressColor: Self = this.set("progressColor", js.undefined)
  }
}
