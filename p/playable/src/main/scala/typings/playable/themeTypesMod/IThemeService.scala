package typings.playable.themeTypesMod

import typings.playable.coreTypesMod.IStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeService extends js.Object {
  
  def destroy(): Unit = js.native
  
  def get(module: js.Object): IStyles = js.native
  
  def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit = js.native
  
  def updateTheme(config: IThemeConfig): Unit = js.native
}
object IThemeService {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    get: js.Object => IStyles,
    registerModuleTheme: (js.Object, ICSSRules) => Unit,
    updateTheme: IThemeConfig => Unit
  ): IThemeService = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction1(get), registerModuleTheme = js.Any.fromFunction2(registerModuleTheme), updateTheme = js.Any.fromFunction1(updateTheme))
    __obj.asInstanceOf[IThemeService]
  }
  
  @scala.inline
  implicit class IThemeServiceOps[Self <: IThemeService] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: js.Object => IStyles): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterModuleTheme(value: (js.Object, ICSSRules) => Unit): Self = this.set("registerModuleTheme", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateTheme(value: IThemeConfig => Unit): Self = this.set("updateTheme", js.Any.fromFunction1(value))
  }
}
