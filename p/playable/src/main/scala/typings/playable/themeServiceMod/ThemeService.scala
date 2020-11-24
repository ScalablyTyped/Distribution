package typings.playable.themeServiceMod

import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import typings.playable.themeTypesMod.IThemeConfig
import typings.playable.themeTypesMod.IThemeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeService extends IThemeService {
  
  var _styleSheet: js.Any = js.native
  
  def get(module: js.Any): IStyles = js.native
}
object ThemeService {
  
  @scala.inline
  def apply(
    _styleSheet: js.Any,
    destroy: () => Unit,
    get: js.Any => IStyles,
    registerModuleTheme: (js.Object, ICSSRules) => Unit,
    updateTheme: IThemeConfig => Unit
  ): ThemeService = {
    val __obj = js.Dynamic.literal(_styleSheet = _styleSheet.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction1(get), registerModuleTheme = js.Any.fromFunction2(registerModuleTheme), updateTheme = js.Any.fromFunction1(updateTheme))
    __obj.asInstanceOf[ThemeService]
  }
  
  @scala.inline
  implicit class ThemeServiceOps[Self <: ThemeService] (val x: Self) extends AnyVal {
    
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
    def set_styleSheet(value: js.Any): Self = this.set("_styleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: js.Any => IStyles): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
