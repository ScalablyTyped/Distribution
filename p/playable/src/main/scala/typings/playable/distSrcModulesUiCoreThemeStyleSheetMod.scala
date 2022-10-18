package typings.playable

import typings.playable.distSrcModulesUiCoreThemeTypesMod.ICSSRules
import typings.playable.distSrcModulesUiCoreTypesMod.IStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreThemeStyleSheetMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/style-sheet", "StyleSheet")
  @js.native
  open class StyleSheet () extends StObject {
    
    /* private */ var _classNamesByModule: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _getModuleCSS: Any = js.native
    
    /* private */ var _getRuleCSS: Any = js.native
    
    /* private */ var _getRuleStyles: Any = js.native
    
    /* private */ var _rulesByModule: Any = js.native
    
    /* private */ var _styleNode: Any = js.native
    
    def attach(): Unit = js.native
    
    def getModuleClassNames(module: Any): IStyles = js.native
    
    def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit = js.native
    
    def update(data: Any): Unit = js.native
  }
}
