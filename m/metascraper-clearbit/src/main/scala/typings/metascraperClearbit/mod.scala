package typings.metascraperClearbit

import typings.metascraper.mod.Rule
import typings.node.httpMod.ClientRequestArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper-clearbit", JSImport.Namespace)
  @js.native
  def apply(): Rule = js.native
  @JSImport("metascraper-clearbit", JSImport.Namespace)
  @js.native
  def apply(options: Options): Rule = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Any option provided here will passed to `got#options`. */
    var gotOpts: js.UndefOr[ClientRequestArgs] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGotOpts(value: ClientRequestArgs): Self = StObject.set(x, "gotOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotOptsUndefined: Self = StObject.set(x, "gotOpts", js.undefined)
    }
  }
}
