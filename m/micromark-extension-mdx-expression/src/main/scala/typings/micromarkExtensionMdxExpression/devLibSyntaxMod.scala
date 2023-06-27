package typings.micromarkExtensionMdxExpression

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibSyntaxMod {
  
  @JSImport("micromark-extension-mdx-expression/dev/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxExpression(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")().asInstanceOf[Extension]
  inline def mdxExpression(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Acorn = typings.micromarkUtilEventsToAcorn.mod.Acorn
  
  type AcornOptions = typings.micromarkUtilEventsToAcorn.mod.AcornOptions
  
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
    
    /**
      * Undocumented option to disallow empty attributes (used by
      * `micromark-extension-mdx-jsx` to prohobit empty attribute values).
      */
    var allowEmpty: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Undocumented option to parse only a spread (used by
      * `micromark-extension-mdx-jsx` to parse spread attributes).
      */
    var spread: js.UndefOr[Boolean | Null] = js.undefined
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
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyNull: Self = StObject.set(x, "allowEmpty", null)
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadNull: Self = StObject.set(x, "spread", null)
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    }
  }
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
