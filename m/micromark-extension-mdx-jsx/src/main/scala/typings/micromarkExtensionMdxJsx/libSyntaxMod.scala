package typings.micromarkExtensionMdxJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxMod {
  
  @JSImport("micromark-extension-mdx-jsx/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxJsx(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsx")().asInstanceOf[Extension]
  inline def mdxJsx(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsx")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Acorn = typings.micromarkFactoryMdxExpression.mod.Acorn
  
  type AcornOptions = typings.micromarkFactoryMdxExpression.mod.AcornOptions
  
  type Extension = typings.micromarkUtilTypes.mod.Extension
  
  trait Options extends StObject {
    
    var acorn: js.UndefOr[typings.micromarkUtilEventsToAcorn.mod.Acorn] = js.undefined
    
    var acornOptions: js.UndefOr[typings.acorn.mod.Options] = js.undefined
    
    var addResult: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcorn(value: typings.micromarkUtilEventsToAcorn.mod.Acorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setAcornOptions(value: typings.acorn.mod.Options): Self = StObject.set(x, "acornOptions", value.asInstanceOf[js.Any])
      
      inline def setAcornOptionsUndefined: Self = StObject.set(x, "acornOptions", js.undefined)
      
      inline def setAcornUndefined: Self = StObject.set(x, "acorn", js.undefined)
      
      inline def setAddResult(value: Boolean): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
      
      inline def setAddResultUndefined: Self = StObject.set(x, "addResult", js.undefined)
    }
  }
}
