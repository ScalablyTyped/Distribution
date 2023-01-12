package typings.metascraper

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(rules: js.Array[Rule]): js.Function1[/* options */ Options, js.Promise[Record[String, String]]] = ^.asInstanceOf[js.Dynamic].apply(rules.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ Options, js.Promise[Record[String, String]]]]
  
  @JSImport("metascraper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var html: String
    
    var rules: js.UndefOr[js.Array[Rule]] = js.undefined
    
    var url: String
  }
  object Options {
    
    inline def apply(html: String, url: String): Options = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Rule = Record[String, Any]
}
