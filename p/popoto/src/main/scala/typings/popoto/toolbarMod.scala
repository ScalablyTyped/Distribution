package typings.popoto

import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  object Toolbar {
    
    @JSImport("popoto/toolbar", "Toolbar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_CENTER")
    @js.native
    def TOOL_CENTER: String = js.native
    inline def TOOL_CENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_FIT_TEXT")
    @js.native
    def TOOL_FIT_TEXT: String = js.native
    inline def TOOL_FIT_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_FIT_TEXT")(x.asInstanceOf[js.Any])
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_FULL_SCREEN")
    @js.native
    def TOOL_FULL_SCREEN: String = js.native
    inline def TOOL_FULL_SCREEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_FULL_SCREEN")(x.asInstanceOf[js.Any])
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_RELATION")
    @js.native
    def TOOL_RELATION: String = js.native
    inline def TOOL_RELATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_RELATION")(x.asInstanceOf[js.Any])
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_RESET")
    @js.native
    def TOOL_RESET: String = js.native
    inline def TOOL_RESET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_RESET")(x.asInstanceOf[js.Any])
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_SAVE")
    @js.native
    def TOOL_SAVE: String = js.native
    inline def TOOL_SAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_SAVE")(x.asInstanceOf[js.Any])
    
    @JSImport("popoto/toolbar", "Toolbar.TOOL_TAXONOMY")
    @js.native
    def TOOL_TAXONOMY: String = js.native
    inline def TOOL_TAXONOMY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOOL_TAXONOMY")(x.asInstanceOf[js.Any])
    
    inline def render(container: SVGGElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
