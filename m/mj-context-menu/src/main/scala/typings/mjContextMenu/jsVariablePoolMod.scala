package typings.mjContextMenu

import typings.mjContextMenu.jsVariableMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsVariablePoolMod {
  
  @JSImport("mj-context-menu/js/variable_pool", "VariablePool")
  @js.native
  open class VariablePool[T] () extends StObject {
    
    def insert(variable: Variable[T]): Unit = js.native
    
    def lookup(name: String): Variable[T] = js.native
    
    /* private */ var pool: Any = js.native
    
    def remove(name: String): Unit = js.native
    
    def update(): Unit = js.native
  }
}
