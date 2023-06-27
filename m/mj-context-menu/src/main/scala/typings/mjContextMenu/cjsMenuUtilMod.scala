package typings.mjContextMenu

import typings.mjContextMenu.cjsItemMod.Item
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMenuUtilMod {
  
  object MenuUtil {
    
    @JSImport("mj-context-menu/cjs/menu_util", "MenuUtil")
    @js.native
    val ^ : js.Any = js.native
    
    inline def close(item: Item): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def counter(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("counter")().asInstanceOf[Double]
    
    inline def error(_error: js.Error, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(_error.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getActiveElement(item: Item): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(item.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  }
}
