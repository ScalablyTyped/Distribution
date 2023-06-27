package typings.mjContextMenu

import typings.mjContextMenu.anon.Getter
import typings.mjContextMenu.anon.Name
import typings.mjContextMenu.cjsItemMod.Item
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import typings.mjContextMenu.cjsVariableItemMod.VariableItem
import typings.mjContextMenu.cjsVariablePoolMod.VariablePool
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsVariableMod {
  
  @JSImport("mj-context-menu/cjs/variable", "Variable")
  @js.native
  open class Variable[T] protected () extends StObject {
    def this(
      _name: String,
      getter: js.Function1[/* node */ js.UndefOr[HTMLElement], T],
      setter: js.Function2[/* x */ T, /* node */ js.UndefOr[HTMLElement], Unit]
    ) = this()
    
    /* private */ var _name: Any = js.native
    
    def getValue(): T = js.native
    def getValue(node: HTMLElement): T = js.native
    
    /* private */ var getter: Any = js.native
    
    /* private */ var items: Any = js.native
    
    def name: String = js.native
    
    def register(item: VariableItem): Unit = js.native
    
    def registerCallback(func: js.Function1[/* value */ Item, Unit]): Unit = js.native
    
    def setValue(value: T): Unit = js.native
    def setValue(value: T, node: HTMLElement): Unit = js.native
    
    /* private */ var setter: Any = js.native
    
    def toJson(): Name = js.native
    
    def unregister(item: VariableItem): Unit = js.native
    
    def unregisterCallback(func: js.Function1[/* value */ Item, Unit]): Unit = js.native
    
    def update(): Unit = js.native
  }
  /* static members */
  object Variable {
    
    @JSImport("mj-context-menu/cjs/variable", "Variable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, param1: Getter, pool: VariablePool[String | Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], pool.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
