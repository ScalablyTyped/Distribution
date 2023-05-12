package typings.mdastUtilToString

import typings.mdast.mod.Content
import typings.mdast.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-to-string/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toString_(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(value: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    /**
      * Whether to use `value` of HTML.
      */
    var includeHtml: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Whether to use `alt` for `image`s.
      */
    var includeImageAlt: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIncludeHtml(value: Boolean): Self = StObject.set(x, "includeHtml", value.asInstanceOf[js.Any])
      
      inline def setIncludeHtmlNull: Self = StObject.set(x, "includeHtml", null)
      
      inline def setIncludeHtmlUndefined: Self = StObject.set(x, "includeHtml", js.undefined)
      
      inline def setIncludeImageAlt(value: Boolean): Self = StObject.set(x, "includeImageAlt", value.asInstanceOf[js.Any])
      
      inline def setIncludeImageAltNull: Self = StObject.set(x, "includeImageAlt", null)
      
      inline def setIncludeImageAltUndefined: Self = StObject.set(x, "includeImageAlt", js.undefined)
    }
  }
}
