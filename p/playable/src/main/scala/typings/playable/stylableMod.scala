package typings.playable

import typings.playable.coreTypesMod.IStylable
import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import typings.playable.themeTypesMod.IThemeService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/stylable", JSImport.Namespace)
@js.native
object stylableMod extends js.Object {
  
  @js.native
  trait Stylable[TStyles] extends IStylable[TStyles] {
    
    var _themeStyles: js.Any = js.native
    
    @JSName("styleNames")
    def styleNames_MStylable: TStyles = js.native
    
    def themeStyles: IStyles = js.native
  }
  
  @js.native
  class default[TStyles] () extends Stylable[TStyles] {
    def this(theme: IThemeService) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var _moduleTheme: js.Any = js.native
    
    var _styles: js.Any = js.native
    
    def extendStyleNames(styles: IStyles): Unit = js.native
    
    def resetStyles(): Unit = js.native
    
    def setTheme(theme: ICSSRules): Unit = js.native
  }
}
