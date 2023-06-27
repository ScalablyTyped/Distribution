package typings.mjContextMenu

import typings.mjContextMenu.cjsItemMod.Item
import typings.mjContextMenu.cjsKeyNavigatableMod.KeyNavigatable
import typings.mjContextMenu.cjsMouseNavigatableMod.MouseNavigatable
import typings.mjContextMenu.cjsPostableMod.Postable
import typings.mjContextMenu.cjsVariablePoolMod.VariablePool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMenuMod {
  
  @js.native
  trait Menu
    extends StObject
       with Postable
       with KeyNavigatable
       with MouseNavigatable {
    
    var baseMenu: Menu = js.native
    
    def find(id: String): Item = js.native
    
    var focused: Item = js.native
    
    def generateMenu(): Unit = js.native
    
    var items: js.Array[Item] = js.native
    
    var pool: VariablePool[String | Boolean] = js.native
    
    def unpostSubmenus(): Unit = js.native
  }
}
