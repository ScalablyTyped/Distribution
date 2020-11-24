package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fill extends js.Object {
  
  def fill(data: IThemeConfig): String = js.native
}
object Fill {
  
  @scala.inline
  def apply(fill: IThemeConfig => String): Fill = {
    val __obj = js.Dynamic.literal(fill = js.Any.fromFunction1(fill))
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  implicit class FillOps[Self <: Fill] (val x: Self) extends AnyVal {
    
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
    def setFill(value: IThemeConfig => String): Self = this.set("fill", js.Any.fromFunction1(value))
  }
}
