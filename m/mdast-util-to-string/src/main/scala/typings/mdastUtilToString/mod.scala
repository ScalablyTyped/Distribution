package typings.mdastUtilToString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toString_(node: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(node: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var includeImageAlt: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIncludeImageAlt(value: Boolean): Self = StObject.set(x, "includeImageAlt", value.asInstanceOf[js.Any])
      
      inline def setIncludeImageAltUndefined: Self = StObject.set(x, "includeImageAlt", js.undefined)
    }
  }
}
