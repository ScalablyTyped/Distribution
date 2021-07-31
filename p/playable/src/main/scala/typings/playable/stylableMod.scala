package typings.playable

import typings.playable.coreTypesMod.IStylable
import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import typings.playable.themeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableMod {
  
  @JSImport("playable/dist/src/modules/ui/core/stylable", JSImport.Default)
  @js.native
  class default[TStyles] ()
    extends StObject
       with Stylable[TStyles] {
    def this(theme: IThemeService) = this()
    
    /* CompleteClass */
    var styleNames: TStyles = js.native
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/core/stylable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def extendStyleNames(styles: IStyles): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendStyleNames")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default._moduleTheme")
    @js.native
    def moduleTheme: js.Any = js.native
    
    @scala.inline
    def moduleTheme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_moduleTheme")(x.asInstanceOf[js.Any])
    
    /* static member */
    @scala.inline
    def resetStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStyles")().asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def setTheme(theme: ICSSRules): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/core/stylable", "default._styles")
    @js.native
    def styles: js.Any = js.native
    
    @scala.inline
    def styles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_styles")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Stylable[TStyles]
    extends StObject
       with IStylable[TStyles] {
    
    var _themeStyles: js.Any = js.native
    
    @JSName("styleNames")
    def styleNames_MStylable: TStyles = js.native
    
    def themeStyles: IStyles = js.native
  }
}
