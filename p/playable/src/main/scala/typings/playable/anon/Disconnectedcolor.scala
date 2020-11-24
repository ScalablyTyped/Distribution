package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disconnectedcolor extends js.Object {
  
  def `--disconnected-color`(data: IThemeConfig): String = js.native
}
object Disconnectedcolor {
  
  @scala.inline
  def apply(`--disconnected-color`: IThemeConfig => String): Disconnectedcolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("--disconnected-color")(js.Any.fromFunction1(`--disconnected-color`))
    __obj.asInstanceOf[Disconnectedcolor]
  }
  
  @scala.inline
  implicit class DisconnectedcolorOps[Self <: Disconnectedcolor] (val x: Self) extends AnyVal {
    
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
    def `set--disconnected-color`(value: IThemeConfig => String): Self = this.set("--disconnected-color", js.Any.fromFunction1(value))
  }
}
