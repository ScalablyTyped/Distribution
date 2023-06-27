package typings.mjContextMenu

import org.scalablytyped.runtime.StringDictionary
import typings.mjContextMenu.cjsSelectionBoxMod.SelectionGrid
import typings.mjContextMenu.cjsSelectionBoxMod.SelectionOrder
import typings.mjContextMenu.cjsSelectionBoxMod.selection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    def action(node: HTMLElement): Unit
    
    var content: String
    
    var id: String
  }
  object Action {
    
    inline def apply(action: HTMLElement => Unit, content: String, id: String): Action = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: HTMLElement => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var id: String
    
    var variable: String
  }
  object Content {
    
    inline def apply(content: String, id: String, variable: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentId extends StObject {
    
    var content: String
    
    var id: String
  }
  object ContentId {
    
    inline def apply(content: String, id: String): ContentId = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentId] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var `type`: String
  }
  object Dictk {
    
    inline def apply(`type`: String): Dictk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Getter extends StObject {
    
    def getter(): String | Boolean = js.native
    
    var name: String = js.native
    
    def setter(x: String): Unit = js.native
    def setter(x: Boolean): Unit = js.native
  }
  
  trait Grid extends StObject {
    
    var grid: js.UndefOr[SelectionGrid] = js.undefined
    
    var order: js.UndefOr[SelectionOrder] = js.undefined
    
    var selections: js.Array[selection]
    
    var signature: String
    
    var title: String
  }
  object Grid {
    
    inline def apply(selections: js.Array[selection], signature: String, title: String): Grid = {
      val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grid] (val x: Self) extends AnyVal {
      
      inline def setGrid(value: SelectionGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setOrder(value: SelectionOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSelections(value: js.Array[selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      inline def setSelectionsVarargs(value: selection*): Self = StObject.set(x, "selections", js.Array(value*))
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var items: js.Array[Any]
    
    var pool: js.Array[Any]
  }
  object Id {
    
    inline def apply(id: String, items: js.Array[Any], pool: js.Array[Any]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPool(value: js.Array[Any]): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      inline def setPoolVarargs(value: Any*): Self = StObject.set(x, "pool", js.Array(value*))
    }
  }
  
  trait Items extends StObject {
    
    var id: String
    
    var items: js.Array[Any]
  }
  object Items {
    
    inline def apply(id: String, items: js.Array[Any]): Items = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Menu extends StObject {
    
    var content: String
    
    var id: String
    
    var menu: Any
  }
  object Menu {
    
    inline def apply(content: String, id: String, menu: Any): Menu = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[Menu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: Any): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var getter: String
    
    var name: String
    
    var setter: String
    
    var `type`: String
  }
  object Name {
    
    inline def apply(getter: String, name: String, setter: String, `type`: String): Name = {
      val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setGetter(value: String): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSetter(value: String): Self = StObject.set(x, "setter", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Order extends StObject {
    
    var grid: js.UndefOr[typings.mjContextMenu.jsSelectionBoxMod.SelectionGrid] = js.undefined
    
    var order: js.UndefOr[typings.mjContextMenu.jsSelectionBoxMod.SelectionOrder] = js.undefined
    
    var selections: js.Array[typings.mjContextMenu.jsSelectionBoxMod.selection]
    
    var signature: String
    
    var title: String
  }
  object Order {
    
    inline def apply(
      selections: js.Array[typings.mjContextMenu.jsSelectionBoxMod.selection],
      signature: String,
      title: String
    ): Order = {
      val __obj = js.Dynamic.literal(selections = selections.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Order]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
      
      inline def setGrid(value: typings.mjContextMenu.jsSelectionBoxMod.SelectionGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setOrder(value: typings.mjContextMenu.jsSelectionBoxMod.SelectionOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSelections(value: js.Array[typings.mjContextMenu.jsSelectionBoxMod.selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      inline def setSelectionsVarargs(value: typings.mjContextMenu.jsSelectionBoxMod.selection*): Self = StObject.set(x, "selections", js.Array(value*))
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
  }
  object Type {
    
    inline def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
