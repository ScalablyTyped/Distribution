package typings.metascraperDescription

import typings.metascraper.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Rule = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Rule]
  inline def apply(options: Options): Rule = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  @JSImport("metascraper-description", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** Truncate the value extracted to a maximum size (default: `300`). */
    var truncateLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTruncateLength(value: Double): Self = StObject.set(x, "truncateLength", value.asInstanceOf[js.Any])
      
      inline def setTruncateLengthUndefined: Self = StObject.set(x, "truncateLength", js.undefined)
    }
  }
}
