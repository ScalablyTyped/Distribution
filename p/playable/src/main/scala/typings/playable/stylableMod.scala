package typings.playable

import typings.playable.coreTypesMod.IStylable
import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import typings.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableMod {
  
  @JSImport("playable/dist/src/modules/ui/core/stylable", JSImport.Default)
  @js.native
  class default[TStyles] () extends Stylable[TStyles] {
    def this(theme: IThemeService) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/stylable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default.extendStyleNames")
    @js.native
    def extendStyleNames(styles: IStyles): Unit = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default._moduleTheme")
    @js.native
    def moduleTheme: js.Any = js.native
    
    @scala.inline
    def moduleTheme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_moduleTheme")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default.resetStyles")
    @js.native
    def resetStyles(): Unit = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default.setTheme")
    @js.native
    def setTheme(theme: ICSSRules): Unit = js.native
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default._styles")
    @js.native
    def styles: js.Any = js.native
    
    @scala.inline
    def styles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_styles")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Stylable[TStyles] extends IStylable[TStyles] {
    
    var _themeStyles: js.Any = js.native
    
    @JSName("styleNames")
    def styleNames_MStylable: TStyles = js.native
    
    def themeStyles: IStyles = js.native
  }
}
