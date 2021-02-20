package typings.metascraperDescription

import typings.metascraper.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper-description", JSImport.Namespace)
  @js.native
  def apply(): Rule = js.native
  @JSImport("metascraper-description", JSImport.Namespace)
  @js.native
  def apply(options: Options): Rule = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Truncate the value extracted to a maximum size (default: `300`). */
    var truncateLength: js.UndefOr[Double] = js.native
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
      def setTruncateLength(value: Double): Self = StObject.set(x, "truncateLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateLengthUndefined: Self = StObject.set(x, "truncateLength", js.undefined)
    }
  }
}
