package typings.naturalSort

import typings.naturalSort.naturalSortStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function2[/* a */ String | Double, /* b */ String | Double, Double]]
  inline def apply(options: Options): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ String | Double, /* b */ String | Double, Double]]
  
  @JSImport("natural-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** Set to true to make the sort case-sensitive. */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /** Set to 'desc' to sort in reverse. */
    var direction: js.UndefOr[desc] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setDirection(value: desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
