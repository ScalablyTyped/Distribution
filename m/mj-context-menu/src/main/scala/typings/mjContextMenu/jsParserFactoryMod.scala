package typings.mjContextMenu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsParserFactoryMod {
  
  @JSImport("mj-context-menu/js/parser_factory", "ParserFactory")
  @js.native
  open class ParserFactory protected () extends StObject {
    def this(init: js.Array[js.Tuple2[String, ParseMethod]]) = this()
    
    /* private */ var _parser: Any = js.native
    
    def add(name: String, method: ParseMethod): Unit = js.native
    
    def get(name: String): ParseMethod = js.native
  }
  
  @js.native
  trait ParseMethod extends StObject {
    
    def apply(factory: ParserFactory, json: Any, aux: Any*): Any = js.native
  }
}
