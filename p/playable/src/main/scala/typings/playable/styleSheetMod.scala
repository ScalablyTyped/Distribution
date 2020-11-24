package typings.playable

import typings.playable.coreTypesMod.IStyles
import typings.playable.themeTypesMod.ICSSRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/theme/style-sheet", JSImport.Namespace)
@js.native
object styleSheetMod extends js.Object {
  
  @js.native
  class StyleSheet () extends js.Object {
    
    var _classNamesByModule: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _getModuleCSS: js.Any = js.native
    
    var _getRuleCSS: js.Any = js.native
    
    var _getRuleStyles: js.Any = js.native
    
    var _rulesByModule: js.Any = js.native
    
    var _styleNode: js.Any = js.native
    
    def attach(): Unit = js.native
    
    def getModuleClassNames(module: js.Any): IStyles = js.native
    
    def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit = js.native
    
    def update(data: js.Any): Unit = js.native
  }
}
