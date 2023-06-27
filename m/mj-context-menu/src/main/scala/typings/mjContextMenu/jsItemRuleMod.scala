package typings.mjContextMenu

import typings.mjContextMenu.anon.Type
import typings.mjContextMenu.cjsHtmlClassesMod.HtmlClass
import typings.mjContextMenu.jsAbstractEntryMod.AbstractEntry
import typings.mjContextMenu.jsMenuMod.Menu
import typings.mjContextMenu.jsParserFactoryMod.ParserFactory
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsItemRuleMod {
  
  @JSImport("mj-context-menu/js/item_rule", "Rule")
  @js.native
  open class Rule protected () extends AbstractEntry {
    def this(menu: Menu) = this()
    
    /* protected */ @JSName("className")
    var className_Rule: HtmlClass = js.native
    
    def toJson(): Type = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("mj-context-menu/js/item_rule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJson(_factory: ParserFactory, _json: Record[String, scala.Nothing], menu: Menu): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(_factory.asInstanceOf[js.Any], _json.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Rule]
  }
}
