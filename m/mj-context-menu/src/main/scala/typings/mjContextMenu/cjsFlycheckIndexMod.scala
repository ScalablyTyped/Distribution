package typings.mjContextMenu

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.mjContextMenu.anon.Getter
import typings.mjContextMenu.anon.Grid
import typings.mjContextMenu.anon.Id
import typings.mjContextMenu.cjsParserFactoryMod.ParseMethod
import typings.mjContextMenu.cjsSelectionBoxMod.SelectionGrid
import typings.mjContextMenu.cjsSelectionBoxMod.SelectionMenu
import typings.mjContextMenu.cjsSelectionBoxMod.SelectionOrder
import typings.mjContextMenu.cjsVariablePoolMod.VariablePool
import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsFlycheckIndexMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "ContextMenu")
  @js.native
  open class ContextMenu protected ()
    extends typings.mjContextMenu.cjsContextMenuMod.ContextMenu {
    def this(factory: typings.mjContextMenu.cjsParserFactoryMod.ParserFactory) = this()
  }
  object ContextMenu {
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "ContextMenu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(factory: typings.mjContextMenu.cjsParserFactoryMod.ParserFactory, param1: Id): typings.mjContextMenu.cjsContextMenuMod.ContextMenu = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.mjContextMenu.cjsContextMenuMod.ContextMenu]
  }
  
  object CssStyles {
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "CssStyles")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addInfoStyles(opt_document: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addInfoStyles")(opt_document.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def addMenuStyles(opt_document: HTMLDocument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMenuStyles")(opt_document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "Info")
  @js.native
  open class Info protected ()
    extends typings.mjContextMenu.cjsInfoMod.Info {
    def this(title: String, content: js.Function0[String], signature: String) = this()
  }
  @JSImport("mj-context-menu/cjs/flycheck_index", "Info")
  @js.native
  val Info: Instantiable3[
    /* title */ String, 
    /* content */ js.Function0[String], 
    /* signature */ String, 
    typings.mjContextMenu.cjsInfoMod.Info
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "Parser")
  @js.native
  open class Parser ()
    extends typings.mjContextMenu.cjsParseMod.Parser {
    def this(init: js.Array[js.Tuple2[String, ParseMethod]]) = this()
  }
  @JSImport("mj-context-menu/cjs/flycheck_index", "Parser")
  @js.native
  val Parser: Instantiable1[
    /* init */ js.UndefOr[js.Array[js.Tuple2[String, ParseMethod]]], 
    typings.mjContextMenu.cjsParseMod.Parser
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "ParserFactory")
  @js.native
  open class ParserFactory protected ()
    extends typings.mjContextMenu.cjsParserFactoryMod.ParserFactory {
    def this(init: js.Array[js.Tuple2[String, ParseMethod]]) = this()
  }
  @JSImport("mj-context-menu/cjs/flycheck_index", "ParserFactory")
  @js.native
  val ParserFactory: Instantiable1[
    /* init */ js.Array[js.Tuple2[String, ParseMethod]], 
    typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
  ] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "Popup")
  @js.native
  open class Popup protected ()
    extends typings.mjContextMenu.cjsPopupMod.Popup {
    def this(title: String, content: js.Function1[/* node */ HTMLElement, String]) = this()
  }
  object Popup {
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "Popup.popupSettings")
    @js.native
    def popupSettings: Any = js.native
    inline def popupSettings_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popupSettings")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "SelectionBox")
  @js.native
  open class SelectionBox protected ()
    extends typings.mjContextMenu.cjsSelectionBoxMod.SelectionBox {
    def this(title: String, signature: String) = this()
    def this(title: String, signature: String, style: SelectionOrder) = this()
    def this(title: String, signature: String, style: Unit, grid: SelectionGrid) = this()
    def this(title: String, signature: String, style: SelectionOrder, grid: SelectionGrid) = this()
  }
  object SelectionBox {
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "SelectionBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "SelectionBox.chunkSize")
    @js.native
    def chunkSize: Double = js.native
    inline def chunkSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(x.asInstanceOf[js.Any])
    
    inline def fromJson(
      factory: typings.mjContextMenu.cjsParserFactoryMod.ParserFactory,
      param1: Grid,
      ctxt: typings.mjContextMenu.cjsContextMenuMod.ContextMenu
    ): typings.mjContextMenu.cjsSelectionBoxMod.SelectionBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], ctxt.asInstanceOf[js.Any])).asInstanceOf[typings.mjContextMenu.cjsSelectionBoxMod.SelectionBox]
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "SelectionBox.orderMethod")
    @js.native
    def orderMethod: Map[SelectionOrder, js.Function2[/* x */ SelectionMenu, /* y */ SelectionMenu, Double]] = js.native
    inline def orderMethod_=(x: Map[SelectionOrder, js.Function2[/* x */ SelectionMenu, /* y */ SelectionMenu, Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orderMethod")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mj-context-menu/cjs/flycheck_index", "Variable")
  @js.native
  open class Variable[T] protected ()
    extends typings.mjContextMenu.cjsVariableMod.Variable[T] {
    def this(
      _name: String,
      getter: js.Function1[
            /* node */ js.UndefOr[HTMLElement], 
            /* import warning: RewrittenClass.unapply cls was tparam T */ Any
          ],
      setter: js.Function2[
            /* import warning: RewrittenClass.unapply cls was tparam T */ /* x */ Any, 
            /* node */ js.UndefOr[HTMLElement], 
            Unit
          ]
    ) = this()
  }
  object Variable {
    
    @JSImport("mj-context-menu/cjs/flycheck_index", "Variable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(
      _factory: typings.mjContextMenu.cjsParserFactoryMod.ParserFactory,
      param1: Getter,
      pool: VariablePool[String | Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], pool.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("mj-context-menu/cjs/flycheck_index", "version")
  @js.native
  val version: /* "0.8.0" */ String = js.native
}
