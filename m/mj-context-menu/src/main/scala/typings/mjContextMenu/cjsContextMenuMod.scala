package typings.mjContextMenu

import typings.mjContextMenu.anon.Id
import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsAbstractMenuMod.AbstractMenu
import typings.mjContextMenu.cjsMenuStoreMod.MenuStore
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import typings.mjContextMenu.cjsPostableMod.Postable
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsContextMenuMod {
  
  @JSImport("mj-context-menu/cjs/context_menu", "ContextMenu")
  @js.native
  open class ContextMenu protected () extends AbstractMenu {
    def this(factory: ParserFactory) = this()
    
    /* private */ var _frame: Any = js.native
    
    /* private */ var _store: Any = js.native
    
    /* private */ var anchor: Any = js.native
    
    var factory: ParserFactory = js.native
    
    def frame: HTMLElement = js.native
    
    var id: String = js.native
    
    /* private */ var move_ : Any = js.native
    
    /* private */ var moving: Any = js.native
    
    def post(element: HTMLElement): Unit = js.native
    def post(event: Event): Unit = js.native
    
    def registerWidget(widget: Postable): Unit = js.native
    
    def store: MenuStore = js.native
    
    def toJson(): Type = js.native
    
    def unpostWidgets(): Unit = js.native
    
    def unregisterWidget(widget: Postable): Unit = js.native
    
    /* private */ var widgets: Any = js.native
  }
  /* static members */
  object ContextMenu {
    
    @JSImport("mj-context-menu/cjs/context_menu", "ContextMenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(factory: ParserFactory, param1: Id): ContextMenu = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[ContextMenu]
  }
}
