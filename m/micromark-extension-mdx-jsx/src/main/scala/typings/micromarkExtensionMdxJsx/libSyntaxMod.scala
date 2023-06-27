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
    
    /**
      * Acorn parser to use (optional).
      */
    var acorn: js.UndefOr[Acorn | Null] = js.undefined
    
    /**
      * Configuration for acorn (default: `{ecmaVersion: 2020, locations: true,
      * sourceType: 'module'}`).
      *
      * All fields except `locations` can be set.
      */
    var acornOptions: js.UndefOr[AcornOptions | Null] = js.undefined
    
    /**
      * Whether to add `estree` fields to tokens with results from acorn.
      */
    var addResult: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAcorn(value: Acorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setAcornNull: Self = StObject.set(x, "acorn", null)
      
      inline def setAcornOptions(value: AcornOptions): Self = StObject.set(x, "acornOptions", value.asInstanceOf[js.Any])
      
      inline def setAcornOptionsNull: Self = StObject.set(x, "acornOptions", null)
      
      inline def setAcornOptionsUndefined: Self = StObject.set(x, "acornOptions", js.undefined)
      
      inline def setAcornUndefined: Self = StObject.set(x, "acorn", js.undefined)
      
      inline def setAddResult(value: Boolean): Self = StObject.set(x, "addResult", value.asInstanceOf[js.Any])
      
      inline def setAddResultNull: Self = StObject.set(x, "addResult", null)
      
      inline def setAddResultUndefined: Self = StObject.set(x, "addResult", js.undefined)
    }
  }
}
