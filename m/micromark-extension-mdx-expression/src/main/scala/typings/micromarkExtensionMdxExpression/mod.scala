package typings.micromarkExtensionMdxExpression

import typings.estree.mod.Program
import typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Extension
import typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Options
import typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxFlowExpression
import typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxFlowExpressionChunk
import typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxFlowExpressionMarker
import typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxTextExpression
import typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxTextExpressionChunk
import typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxTextExpressionMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-mdx-expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxExpression(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")().asInstanceOf[Extension]
  inline def mdxExpression(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /* augmented module */
  object micromarkUtilTypesAugmentingMod {
    
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
      
      var mdxFlowExpression: typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxFlowExpression
      
      var mdxFlowExpressionChunk: typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxFlowExpressionChunk
      
      var mdxFlowExpressionMarker: typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxFlowExpressionMarker
      
      var mdxTextExpression: typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxTextExpression
      
      var mdxTextExpressionChunk: typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxTextExpressionChunk
      
      var mdxTextExpressionMarker: typings.micromarkExtensionMdxExpression.micromarkExtensionMdxExpressionStrings.mdxTextExpressionMarker
    }
    object TokenTypeMap {
      
      inline def apply(): TokenTypeMap = {
        val __obj = js.Dynamic.literal(mdxFlowExpression = "mdxFlowExpression", mdxFlowExpressionChunk = "mdxFlowExpressionChunk", mdxFlowExpressionMarker = "mdxFlowExpressionMarker", mdxTextExpression = "mdxTextExpression", mdxTextExpressionChunk = "mdxTextExpressionChunk", mdxTextExpressionMarker = "mdxTextExpressionMarker")
        __obj.asInstanceOf[TokenTypeMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TokenTypeMap] (val x: Self) extends AnyVal {
        
        inline def setMdxFlowExpression(value: mdxFlowExpression): Self = StObject.set(x, "mdxFlowExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxFlowExpressionChunk(value: mdxFlowExpressionChunk): Self = StObject.set(x, "mdxFlowExpressionChunk", value.asInstanceOf[js.Any])
        
        inline def setMdxFlowExpressionMarker(value: mdxFlowExpressionMarker): Self = StObject.set(x, "mdxFlowExpressionMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpression(value: mdxTextExpression): Self = StObject.set(x, "mdxTextExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpressionChunk(value: mdxTextExpressionChunk): Self = StObject.set(x, "mdxTextExpressionChunk", value.asInstanceOf[js.Any])
        
        inline def setMdxTextExpressionMarker(value: mdxTextExpressionMarker): Self = StObject.set(x, "mdxTextExpressionMarker", value.asInstanceOf[js.Any])
      }
    }
  }
}
