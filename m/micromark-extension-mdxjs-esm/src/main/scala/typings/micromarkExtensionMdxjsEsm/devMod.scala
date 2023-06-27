package typings.micromarkExtensionMdxjsEsm

import typings.estree.mod.Program
import typings.micromarkExtensionMdxjsEsm.devLibSyntaxMod.Extension
import typings.micromarkExtensionMdxjsEsm.devLibSyntaxMod.Options
import typings.micromarkExtensionMdxjsEsm.micromarkExtensionMdxjsEsmStrings.mdxjsEsm
import typings.micromarkExtensionMdxjsEsm.micromarkExtensionMdxjsEsmStrings.mdxjsEsmData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devMod {
  
  @JSImport("micromark-extension-mdxjs-esm/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxjsEsm(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxjsEsm")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /* augmented module */
  object micromarkUtilTypesAugmentingMod {
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait ParseContext extends StObject {
      
      var definedModuleSpecifiers: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ParseContext {
      
      inline def apply(): ParseContext = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParseContext]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ParseContext] (val x: Self) extends AnyVal {
        
        inline def setDefinedModuleSpecifiers(value: js.Array[String]): Self = StObject.set(x, "definedModuleSpecifiers", value.asInstanceOf[js.Any])
        
        inline def setDefinedModuleSpecifiersUndefined: Self = StObject.set(x, "definedModuleSpecifiers", js.undefined)
        
        inline def setDefinedModuleSpecifiersVarargs(value: String*): Self = StObject.set(x, "definedModuleSpecifiers", js.Array(value*))
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait Token extends StObject {
      
      var estree: js.UndefOr[Program] = js.undefined
    }
    object Token {
      
      inline def apply(): Token = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Token]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
        
        inline def setEstree(value: Program): Self = StObject.set(x, "estree", value.asInstanceOf[js.Any])
        
        inline def setEstreeUndefined: Self = StObject.set(x, "estree", js.undefined)
      }
    }
    
    // eslint-disable-next-line @typescript-eslint/consistent-type-definitions
    trait TokenTypeMap extends StObject {
      
      var mdxjsEsm: typings.micromarkExtensionMdxjsEsm.micromarkExtensionMdxjsEsmStrings.mdxjsEsm
      
      var mdxjsEsmData: typings.micromarkExtensionMdxjsEsm.micromarkExtensionMdxjsEsmStrings.mdxjsEsmData
    }
    object TokenTypeMap {
      
      inline def apply(): TokenTypeMap = {
        val __obj = js.Dynamic.literal(mdxjsEsm = "mdxjsEsm", mdxjsEsmData = "mdxjsEsmData")
        __obj.asInstanceOf[TokenTypeMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TokenTypeMap] (val x: Self) extends AnyVal {
        
        inline def setMdxjsEsm(value: mdxjsEsm): Self = StObject.set(x, "mdxjsEsm", value.asInstanceOf[js.Any])
        
        inline def setMdxjsEsmData(value: mdxjsEsmData): Self = StObject.set(x, "mdxjsEsmData", value.asInstanceOf[js.Any])
      }
    }
  }
}
