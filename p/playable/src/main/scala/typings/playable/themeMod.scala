package typings.playable

import typings.playable.anon.ThemeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  
  def transperentizeColor(color: String): String = js.native
  def transperentizeColor(color: String, alpha: Double): String = js.native
  
  @js.native
  object DEFAULT_THEME_CONFIG extends js.Object {
    
    var color: String = js.native
    
    var liveColor: String = js.native
    
    var progressColor: String = js.native
  }
  
  @js.native
  class default protected ()
    extends typings.playable.themeServiceMod.default {
    def this(hasThemeConfig: ThemeConfig) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var dependencies: js.Array[String] = js.native
    
    var moduleName: String = js.native
  }
}
