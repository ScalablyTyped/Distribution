package typings.noCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("no-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def noCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def noCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("noCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var splitRegexp: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var stripRegexp: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[/* part */ String, /* index */ Double, /* parts */ js.Array[String], String]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setSplitRegexp(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "splitRegexp", value.asInstanceOf[js.Any])
      
      inline def setSplitRegexpUndefined: Self = StObject.set(x, "splitRegexp", js.undefined)
      
      inline def setSplitRegexpVarargs(value: js.RegExp*): Self = StObject.set(x, "splitRegexp", js.Array(value*))
      
      inline def setStripRegexp(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "stripRegexp", value.asInstanceOf[js.Any])
      
      inline def setStripRegexpUndefined: Self = StObject.set(x, "stripRegexp", js.undefined)
      
      inline def setStripRegexpVarargs(value: js.RegExp*): Self = StObject.set(x, "stripRegexp", js.Array(value*))
      
      inline def setTransform(value: (/* part */ String, /* index */ Double, /* parts */ js.Array[String]) => String): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
