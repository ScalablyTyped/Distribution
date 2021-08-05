package typings.playable

import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleSheetMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/style-sheet", "StyleSheet")
  @js.native
  class StyleSheet () extends StObject {
    
    /* private */ var _classNamesByModule: js.Any = js.native
    
    /* private */ var _data: js.Any = js.native
    
    /* private */ var _getModuleCSS: js.Any = js.native
    
    /* private */ var _getRuleCSS: js.Any = js.native
    
    /* private */ var _getRuleStyles: js.Any = js.native
    
    /* private */ var _rulesByModule: js.Any = js.native
    
    /* private */ var _styleNode: js.Any = js.native
    
    def attach(): Unit = js.native
    
    def getModuleClassNames(module: js.Any): IStyles = js.native
    
    def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit = js.native
    
    def update(data: js.Any): Unit = js.native
  }
}
