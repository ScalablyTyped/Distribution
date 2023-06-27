package typings.mjContextMenu

import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsAbstractEntryMod.AbstractEntry
import typings.mjContextMenu.cjsMenuMod.Menu
import typings.mjContextMenu.cjsParserFactoryMod.ParserFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsItemRuleMod {
  
  @JSImport("mj-context-menu/cjs/item_rule", "Rule")
  @js.native
  open class Rule protected () extends AbstractEntry {
    def this(menu: Menu) = this()
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("mj-context-menu/cjs/item_rule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, _json: Record[String, scala.Nothing], menu: Menu): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], _json.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Rule]
  }
}
