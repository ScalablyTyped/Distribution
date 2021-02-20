package typings.metascraper

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper", JSImport.Namespace)
  @js.native
  def apply(rules: js.Array[Rule]): js.Function1[/* options */ Options, js.Promise[Record[String, String]]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var html: String = js.native
    
    var rules: js.UndefOr[js.Array[Rule]] = js.native
    
    var url: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(html: String, url: String): Options = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Rule = Record[String, js.Any]
}
