package typings.playable.themeTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeAPI extends js.Object {
  
  var updateTheme: js.UndefOr[js.Function1[/* themeConfig */ IThemeConfig, Unit]] = js.native
}
object IThemeAPI {
  
  @scala.inline
  def apply(): IThemeAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThemeAPI]
  }
  
  @scala.inline
  implicit class IThemeAPIOps[Self <: IThemeAPI] (val x: Self) extends AnyVal {
    
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
    def setUpdateTheme(value: /* themeConfig */ IThemeConfig => Unit): Self = this.set("updateTheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateTheme: Self = this.set("updateTheme", js.undefined)
  }
}
