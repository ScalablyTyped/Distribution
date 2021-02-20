package typings.naturalSort

import typings.naturalSort.naturalSortStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("natural-sort", JSImport.Namespace)
  @js.native
  def apply(): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = js.native
  @JSImport("natural-sort", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Function2[/* a */ String | Double, /* b */ String | Double, Double] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** Set to true to make the sort case-sensitive. */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /** Set to 'desc' to sort in reverse. */
    var direction: js.UndefOr[desc] = js.native
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
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDirection(value: desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
