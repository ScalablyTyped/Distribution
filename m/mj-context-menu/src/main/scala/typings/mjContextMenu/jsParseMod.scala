package typings.mjContextMenu

import typings.mjContextMenu.anon.Dictk
import typings.mjContextMenu.jsItemMod.Item
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsParserFactoryMod.ParseMethod
import typings.mjContextMenu.jsParserFactoryMod.ParserFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsParseMod {
  
  @JSImport("mj-context-menu/js/parse", "Parser")
  @js.native
  open class Parser () extends StObject {
    def this(init: js.Array[js.Tuple2[String, ParseMethod]]) = this()
    
    /* private */ val _factory: Any = js.native
    
    /* private */ var _initList: Any = js.native
    
    def factory: ParserFactory = js.native
    
    def items(_factory: ParserFactory, its: js.Array[Any], ctxt: Menu): js.Array[Item] = js.native
    
    def parse(param0: Dictk, rest: Any*): Any = js.native
  }
}
