package typings.noCase

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("no-case", "noCase")
  @js.native
  def noCase(input: String): String = js.native
  @JSImport("no-case", "noCase")
  @js.native
  def noCase(input: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var delimiter: js.UndefOr[String] = js.native
    
    var splitRegexp: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    var stripRegexp: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    var transform: js.UndefOr[
        js.Function3[/* part */ String, /* index */ Double, /* parts */ js.Array[String], String]
      ] = js.native
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
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setSplitRegexp(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "splitRegexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitRegexpUndefined: Self = StObject.set(x, "splitRegexp", js.undefined)
      
      @scala.inline
      def setSplitRegexpVarargs(value: RegExp*): Self = StObject.set(x, "splitRegexp", js.Array(value :_*))
      
      @scala.inline
      def setStripRegexp(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "stripRegexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripRegexpUndefined: Self = StObject.set(x, "stripRegexp", js.undefined)
      
      @scala.inline
      def setStripRegexpVarargs(value: RegExp*): Self = StObject.set(x, "stripRegexp", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: (/* part */ String, /* index */ Double, /* parts */ js.Array[String]) => String): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
