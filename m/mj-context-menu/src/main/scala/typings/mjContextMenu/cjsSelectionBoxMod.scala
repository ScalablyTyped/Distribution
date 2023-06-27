package typings.mjContextMenu

import typings.mjContextMenu.anon.Grid
import typings.mjContextMenu.cjsAbstractMenuMod.AbstractMenu
import typings.mjContextMenu.cjsContextMenuMod.ContextMenu
import typings.mjContextMenu.cjsInfoMod.Info
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import typings.mjContextMenu.mjContextMenuStrings.alphabetical
import typings.mjContextMenu.mjContextMenuStrings.decreasing
import typings.mjContextMenu.mjContextMenuStrings.horizontal
import typings.mjContextMenu.mjContextMenuStrings.increasing
import typings.mjContextMenu.mjContextMenuStrings.none
import typings.mjContextMenu.mjContextMenuStrings.square
import typings.mjContextMenu.mjContextMenuStrings.vertical
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsSelectionBoxMod {
  
  @JSImport("mj-context-menu/cjs/selection_box", "SelectionBox")
  @js.native
  open class SelectionBox protected () extends Info {
    def this(title: String, signature: String) = this()
    def this(title: String, signature: String, style: SelectionOrder) = this()
    def this(title: String, signature: String, style: Unit, grid: SelectionGrid) = this()
    def this(title: String, signature: String, style: SelectionOrder, grid: SelectionGrid) = this()
    
    /* private */ var _balanced: Any = js.native
    
    /* private */ var _selections: Any = js.native
    
    def addSelection(selection: SelectionMenu): Unit = js.native
    
    /* private */ var balanceColumn: Any = js.native
    
    /* private */ var combineColumn: Any = js.native
    
    /* private */ var findSelection: Any = js.native
    
    /* private */ var getChunkSize: Any = js.native
    
    var grid: SelectionGrid = js.native
    
    /* private */ var move: Any = js.native
    
    /* private */ var order: Any = js.native
    
    /* private */ var prefix: Any = js.native
    
    /* private */ var rowDiv: Any = js.native
    
    def selections: js.Array[SelectionMenu] = js.native
    def selections_=(selections: js.Array[SelectionMenu]): Unit = js.native
    
    var style: SelectionOrder = js.native
  }
  /* static members */
  object SelectionBox {
    
    @JSImport("mj-context-menu/cjs/selection_box", "SelectionBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mj-context-menu/cjs/selection_box", "SelectionBox.chunkSize")
    @js.native
    def chunkSize: Double = js.native
    inline def chunkSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(x.asInstanceOf[js.Any])
    
    inline def fromJson(factory: ParserFactory, param1: Grid, ctxt: ContextMenu): SelectionBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], ctxt.asInstanceOf[js.Any])).asInstanceOf[SelectionBox]
    
    @JSImport("mj-context-menu/cjs/selection_box", "SelectionBox.orderMethod")
    @js.native
    def orderMethod: Map[SelectionOrder, js.Function2[/* x */ SelectionMenu, /* y */ SelectionMenu, Double]] = js.native
    inline def orderMethod_=(x: Map[SelectionOrder, js.Function2[/* x */ SelectionMenu, /* y */ SelectionMenu, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orderMethod")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mj-context-menu/cjs/selection_box", "SelectionMenu")
  @js.native
  open class SelectionMenu protected () extends AbstractMenu {
    def this(anchor: SelectionBox) = this()
    
    var anchor: SelectionBox = js.native
  }
  /* static members */
  object SelectionMenu {
    
    @JSImport("mj-context-menu/cjs/selection_box", "SelectionMenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(factory: ParserFactory, param1: selection, sb: SelectionBox): SelectionMenu = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], sb.asInstanceOf[js.Any])).asInstanceOf[SelectionMenu]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mjContextMenu.mjContextMenuStrings.square
    - typings.mjContextMenu.mjContextMenuStrings.vertical
    - typings.mjContextMenu.mjContextMenuStrings.horizontal
  */
  trait SelectionGrid extends StObject
  object SelectionGrid {
    
    inline def HORIZONTAL: horizontal = "horizontal".asInstanceOf[horizontal]
    
    inline def SQUARE: square = "square".asInstanceOf[square]
    
    inline def VERTICAL: vertical = "vertical".asInstanceOf[vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mjContextMenu.mjContextMenuStrings.none
    - typings.mjContextMenu.mjContextMenuStrings.alphabetical
    - typings.mjContextMenu.mjContextMenuStrings.increasing
    - typings.mjContextMenu.mjContextMenuStrings.decreasing
  */
  trait SelectionOrder extends StObject
  object SelectionOrder {
    
    inline def ALPHABETICAL: alphabetical = "alphabetical".asInstanceOf[alphabetical]
    
    inline def DECREASING: decreasing = "decreasing".asInstanceOf[decreasing]
    
    inline def INCREASING: increasing = "increasing".asInstanceOf[increasing]
    
    inline def NONE: none = "none".asInstanceOf[none]
  }
  
  trait selection extends StObject {
    
    var title: String
    
    var values: js.Array[String]
    
    var variable: String
  }
  object selection {
    
    inline def apply(title: String, values: js.Array[String], variable: String): selection = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[selection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: selection] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
}
