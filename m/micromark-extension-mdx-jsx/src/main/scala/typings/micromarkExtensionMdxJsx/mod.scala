package typings.micromarkExtensionMdxJsx

import typings.estree.mod.Program
import typings.micromarkExtensionMdxJsx.libSyntaxMod.Extension
import typings.micromarkExtensionMdxJsx.libSyntaxMod.Options
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.esWhitespace
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTag
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttribute
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeInitializerMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeName
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeNameLocal
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeNamePrefixMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeNamePrimary
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueExpression
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueExpressionMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueExpressionValue
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueLiteral
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueLiteralMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueLiteralValue
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagClosingMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagExpressionAttribute
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagExpressionAttributeMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagExpressionAttributeValue
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagName
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNameLocal
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNameMember
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNameMemberMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNamePrefixMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNamePrimary
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagSelfClosingMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTag
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttribute
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeInitializerMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeName
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeNameLocal
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeNamePrefixMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeNamePrimary
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueExpression
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueExpressionMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueExpressionValue
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueLiteral
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueLiteralMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueLiteralValue
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagClosingMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagExpressionAttribute
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagExpressionAttributeMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagExpressionAttributeValue
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagName
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNameLocal
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNameMember
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNameMemberMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNamePrefixMarker
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNamePrimary
import typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagSelfClosingMarker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-mdx-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxJsx(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsx")().asInstanceOf[Extension]
  inline def mdxJsx(options: Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxJsx")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
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
      
      var esWhitespace: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.esWhitespace
      
      var mdxJsxFlowTag: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTag
      
      var mdxJsxFlowTagAttribute: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttribute
      
      var mdxJsxFlowTagAttributeInitializerMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeInitializerMarker
      
      var mdxJsxFlowTagAttributeName: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeName
      
      var mdxJsxFlowTagAttributeNameLocal: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeNameLocal
      
      var mdxJsxFlowTagAttributeNamePrefixMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeNamePrefixMarker
      
      var mdxJsxFlowTagAttributeNamePrimary: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeNamePrimary
      
      var mdxJsxFlowTagAttributeValueExpression: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueExpression
      
      var mdxJsxFlowTagAttributeValueExpressionMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueExpressionMarker
      
      var mdxJsxFlowTagAttributeValueExpressionValue: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueExpressionValue
      
      var mdxJsxFlowTagAttributeValueLiteral: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueLiteral
      
      var mdxJsxFlowTagAttributeValueLiteralMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueLiteralMarker
      
      var mdxJsxFlowTagAttributeValueLiteralValue: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagAttributeValueLiteralValue
      
      var mdxJsxFlowTagClosingMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagClosingMarker
      
      var mdxJsxFlowTagExpressionAttribute: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagExpressionAttribute
      
      var mdxJsxFlowTagExpressionAttributeMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagExpressionAttributeMarker
      
      var mdxJsxFlowTagExpressionAttributeValue: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagExpressionAttributeValue
      
      var mdxJsxFlowTagMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagMarker
      
      var mdxJsxFlowTagName: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagName
      
      var mdxJsxFlowTagNameLocal: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNameLocal
      
      var mdxJsxFlowTagNameMember: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNameMember
      
      var mdxJsxFlowTagNameMemberMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNameMemberMarker
      
      var mdxJsxFlowTagNamePrefixMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNamePrefixMarker
      
      var mdxJsxFlowTagNamePrimary: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagNamePrimary
      
      var mdxJsxFlowTagSelfClosingMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxFlowTagSelfClosingMarker
      
      var mdxJsxTextTag: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTag
      
      var mdxJsxTextTagAttribute: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttribute
      
      var mdxJsxTextTagAttributeInitializerMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeInitializerMarker
      
      var mdxJsxTextTagAttributeName: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeName
      
      var mdxJsxTextTagAttributeNameLocal: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeNameLocal
      
      var mdxJsxTextTagAttributeNamePrefixMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeNamePrefixMarker
      
      var mdxJsxTextTagAttributeNamePrimary: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeNamePrimary
      
      var mdxJsxTextTagAttributeValueExpression: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueExpression
      
      var mdxJsxTextTagAttributeValueExpressionMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueExpressionMarker
      
      var mdxJsxTextTagAttributeValueExpressionValue: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueExpressionValue
      
      var mdxJsxTextTagAttributeValueLiteral: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueLiteral
      
      var mdxJsxTextTagAttributeValueLiteralMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueLiteralMarker
      
      var mdxJsxTextTagAttributeValueLiteralValue: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagAttributeValueLiteralValue
      
      var mdxJsxTextTagClosingMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagClosingMarker
      
      var mdxJsxTextTagExpressionAttribute: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagExpressionAttribute
      
      var mdxJsxTextTagExpressionAttributeMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagExpressionAttributeMarker
      
      var mdxJsxTextTagExpressionAttributeValue: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagExpressionAttributeValue
      
      var mdxJsxTextTagMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagMarker
      
      var mdxJsxTextTagName: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagName
      
      var mdxJsxTextTagNameLocal: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNameLocal
      
      var mdxJsxTextTagNameMember: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNameMember
      
      var mdxJsxTextTagNameMemberMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNameMemberMarker
      
      var mdxJsxTextTagNamePrefixMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNamePrefixMarker
      
      var mdxJsxTextTagNamePrimary: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagNamePrimary
      
      var mdxJsxTextTagSelfClosingMarker: typings.micromarkExtensionMdxJsx.micromarkExtensionMdxJsxStrings.mdxJsxTextTagSelfClosingMarker
    }
    object TokenTypeMap {
      
      inline def apply(): TokenTypeMap = {
        val __obj = js.Dynamic.literal(esWhitespace = "esWhitespace", mdxJsxFlowTag = "mdxJsxFlowTag", mdxJsxFlowTagAttribute = "mdxJsxFlowTagAttribute", mdxJsxFlowTagAttributeInitializerMarker = "mdxJsxFlowTagAttributeInitializerMarker", mdxJsxFlowTagAttributeName = "mdxJsxFlowTagAttributeName", mdxJsxFlowTagAttributeNameLocal = "mdxJsxFlowTagAttributeNameLocal", mdxJsxFlowTagAttributeNamePrefixMarker = "mdxJsxFlowTagAttributeNamePrefixMarker", mdxJsxFlowTagAttributeNamePrimary = "mdxJsxFlowTagAttributeNamePrimary", mdxJsxFlowTagAttributeValueExpression = "mdxJsxFlowTagAttributeValueExpression", mdxJsxFlowTagAttributeValueExpressionMarker = "mdxJsxFlowTagAttributeValueExpressionMarker", mdxJsxFlowTagAttributeValueExpressionValue = "mdxJsxFlowTagAttributeValueExpressionValue", mdxJsxFlowTagAttributeValueLiteral = "mdxJsxFlowTagAttributeValueLiteral", mdxJsxFlowTagAttributeValueLiteralMarker = "mdxJsxFlowTagAttributeValueLiteralMarker", mdxJsxFlowTagAttributeValueLiteralValue = "mdxJsxFlowTagAttributeValueLiteralValue", mdxJsxFlowTagClosingMarker = "mdxJsxFlowTagClosingMarker", mdxJsxFlowTagExpressionAttribute = "mdxJsxFlowTagExpressionAttribute", mdxJsxFlowTagExpressionAttributeMarker = "mdxJsxFlowTagExpressionAttributeMarker", mdxJsxFlowTagExpressionAttributeValue = "mdxJsxFlowTagExpressionAttributeValue", mdxJsxFlowTagMarker = "mdxJsxFlowTagMarker", mdxJsxFlowTagName = "mdxJsxFlowTagName", mdxJsxFlowTagNameLocal = "mdxJsxFlowTagNameLocal", mdxJsxFlowTagNameMember = "mdxJsxFlowTagNameMember", mdxJsxFlowTagNameMemberMarker = "mdxJsxFlowTagNameMemberMarker", mdxJsxFlowTagNamePrefixMarker = "mdxJsxFlowTagNamePrefixMarker", mdxJsxFlowTagNamePrimary = "mdxJsxFlowTagNamePrimary", mdxJsxFlowTagSelfClosingMarker = "mdxJsxFlowTagSelfClosingMarker", mdxJsxTextTag = "mdxJsxTextTag", mdxJsxTextTagAttribute = "mdxJsxTextTagAttribute", mdxJsxTextTagAttributeInitializerMarker = "mdxJsxTextTagAttributeInitializerMarker", mdxJsxTextTagAttributeName = "mdxJsxTextTagAttributeName", mdxJsxTextTagAttributeNameLocal = "mdxJsxTextTagAttributeNameLocal", mdxJsxTextTagAttributeNamePrefixMarker = "mdxJsxTextTagAttributeNamePrefixMarker", mdxJsxTextTagAttributeNamePrimary = "mdxJsxTextTagAttributeNamePrimary", mdxJsxTextTagAttributeValueExpression = "mdxJsxTextTagAttributeValueExpression", mdxJsxTextTagAttributeValueExpressionMarker = "mdxJsxTextTagAttributeValueExpressionMarker", mdxJsxTextTagAttributeValueExpressionValue = "mdxJsxTextTagAttributeValueExpressionValue", mdxJsxTextTagAttributeValueLiteral = "mdxJsxTextTagAttributeValueLiteral", mdxJsxTextTagAttributeValueLiteralMarker = "mdxJsxTextTagAttributeValueLiteralMarker", mdxJsxTextTagAttributeValueLiteralValue = "mdxJsxTextTagAttributeValueLiteralValue", mdxJsxTextTagClosingMarker = "mdxJsxTextTagClosingMarker", mdxJsxTextTagExpressionAttribute = "mdxJsxTextTagExpressionAttribute", mdxJsxTextTagExpressionAttributeMarker = "mdxJsxTextTagExpressionAttributeMarker", mdxJsxTextTagExpressionAttributeValue = "mdxJsxTextTagExpressionAttributeValue", mdxJsxTextTagMarker = "mdxJsxTextTagMarker", mdxJsxTextTagName = "mdxJsxTextTagName", mdxJsxTextTagNameLocal = "mdxJsxTextTagNameLocal", mdxJsxTextTagNameMember = "mdxJsxTextTagNameMember", mdxJsxTextTagNameMemberMarker = "mdxJsxTextTagNameMemberMarker", mdxJsxTextTagNamePrefixMarker = "mdxJsxTextTagNamePrefixMarker", mdxJsxTextTagNamePrimary = "mdxJsxTextTagNamePrimary", mdxJsxTextTagSelfClosingMarker = "mdxJsxTextTagSelfClosingMarker")
        __obj.asInstanceOf[TokenTypeMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TokenTypeMap] (val x: Self) extends AnyVal {
        
        inline def setEsWhitespace(value: esWhitespace): Self = StObject.set(x, "esWhitespace", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTag(value: mdxJsxFlowTag): Self = StObject.set(x, "mdxJsxFlowTag", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttribute(value: mdxJsxFlowTagAttribute): Self = StObject.set(x, "mdxJsxFlowTagAttribute", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeInitializerMarker(value: mdxJsxFlowTagAttributeInitializerMarker): Self = StObject.set(x, "mdxJsxFlowTagAttributeInitializerMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeName(value: mdxJsxFlowTagAttributeName): Self = StObject.set(x, "mdxJsxFlowTagAttributeName", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeNameLocal(value: mdxJsxFlowTagAttributeNameLocal): Self = StObject.set(x, "mdxJsxFlowTagAttributeNameLocal", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeNamePrefixMarker(value: mdxJsxFlowTagAttributeNamePrefixMarker): Self = StObject.set(x, "mdxJsxFlowTagAttributeNamePrefixMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeNamePrimary(value: mdxJsxFlowTagAttributeNamePrimary): Self = StObject.set(x, "mdxJsxFlowTagAttributeNamePrimary", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeValueExpression(value: mdxJsxFlowTagAttributeValueExpression): Self = StObject.set(x, "mdxJsxFlowTagAttributeValueExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeValueExpressionMarker(value: mdxJsxFlowTagAttributeValueExpressionMarker): Self = StObject.set(x, "mdxJsxFlowTagAttributeValueExpressionMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeValueExpressionValue(value: mdxJsxFlowTagAttributeValueExpressionValue): Self = StObject.set(x, "mdxJsxFlowTagAttributeValueExpressionValue", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeValueLiteral(value: mdxJsxFlowTagAttributeValueLiteral): Self = StObject.set(x, "mdxJsxFlowTagAttributeValueLiteral", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeValueLiteralMarker(value: mdxJsxFlowTagAttributeValueLiteralMarker): Self = StObject.set(x, "mdxJsxFlowTagAttributeValueLiteralMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagAttributeValueLiteralValue(value: mdxJsxFlowTagAttributeValueLiteralValue): Self = StObject.set(x, "mdxJsxFlowTagAttributeValueLiteralValue", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagClosingMarker(value: mdxJsxFlowTagClosingMarker): Self = StObject.set(x, "mdxJsxFlowTagClosingMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagExpressionAttribute(value: mdxJsxFlowTagExpressionAttribute): Self = StObject.set(x, "mdxJsxFlowTagExpressionAttribute", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagExpressionAttributeMarker(value: mdxJsxFlowTagExpressionAttributeMarker): Self = StObject.set(x, "mdxJsxFlowTagExpressionAttributeMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagExpressionAttributeValue(value: mdxJsxFlowTagExpressionAttributeValue): Self = StObject.set(x, "mdxJsxFlowTagExpressionAttributeValue", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagMarker(value: mdxJsxFlowTagMarker): Self = StObject.set(x, "mdxJsxFlowTagMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagName(value: mdxJsxFlowTagName): Self = StObject.set(x, "mdxJsxFlowTagName", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagNameLocal(value: mdxJsxFlowTagNameLocal): Self = StObject.set(x, "mdxJsxFlowTagNameLocal", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagNameMember(value: mdxJsxFlowTagNameMember): Self = StObject.set(x, "mdxJsxFlowTagNameMember", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagNameMemberMarker(value: mdxJsxFlowTagNameMemberMarker): Self = StObject.set(x, "mdxJsxFlowTagNameMemberMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagNamePrefixMarker(value: mdxJsxFlowTagNamePrefixMarker): Self = StObject.set(x, "mdxJsxFlowTagNamePrefixMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagNamePrimary(value: mdxJsxFlowTagNamePrimary): Self = StObject.set(x, "mdxJsxFlowTagNamePrimary", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxFlowTagSelfClosingMarker(value: mdxJsxFlowTagSelfClosingMarker): Self = StObject.set(x, "mdxJsxFlowTagSelfClosingMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTag(value: mdxJsxTextTag): Self = StObject.set(x, "mdxJsxTextTag", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttribute(value: mdxJsxTextTagAttribute): Self = StObject.set(x, "mdxJsxTextTagAttribute", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeInitializerMarker(value: mdxJsxTextTagAttributeInitializerMarker): Self = StObject.set(x, "mdxJsxTextTagAttributeInitializerMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeName(value: mdxJsxTextTagAttributeName): Self = StObject.set(x, "mdxJsxTextTagAttributeName", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeNameLocal(value: mdxJsxTextTagAttributeNameLocal): Self = StObject.set(x, "mdxJsxTextTagAttributeNameLocal", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeNamePrefixMarker(value: mdxJsxTextTagAttributeNamePrefixMarker): Self = StObject.set(x, "mdxJsxTextTagAttributeNamePrefixMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeNamePrimary(value: mdxJsxTextTagAttributeNamePrimary): Self = StObject.set(x, "mdxJsxTextTagAttributeNamePrimary", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeValueExpression(value: mdxJsxTextTagAttributeValueExpression): Self = StObject.set(x, "mdxJsxTextTagAttributeValueExpression", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeValueExpressionMarker(value: mdxJsxTextTagAttributeValueExpressionMarker): Self = StObject.set(x, "mdxJsxTextTagAttributeValueExpressionMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeValueExpressionValue(value: mdxJsxTextTagAttributeValueExpressionValue): Self = StObject.set(x, "mdxJsxTextTagAttributeValueExpressionValue", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeValueLiteral(value: mdxJsxTextTagAttributeValueLiteral): Self = StObject.set(x, "mdxJsxTextTagAttributeValueLiteral", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeValueLiteralMarker(value: mdxJsxTextTagAttributeValueLiteralMarker): Self = StObject.set(x, "mdxJsxTextTagAttributeValueLiteralMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagAttributeValueLiteralValue(value: mdxJsxTextTagAttributeValueLiteralValue): Self = StObject.set(x, "mdxJsxTextTagAttributeValueLiteralValue", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagClosingMarker(value: mdxJsxTextTagClosingMarker): Self = StObject.set(x, "mdxJsxTextTagClosingMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagExpressionAttribute(value: mdxJsxTextTagExpressionAttribute): Self = StObject.set(x, "mdxJsxTextTagExpressionAttribute", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagExpressionAttributeMarker(value: mdxJsxTextTagExpressionAttributeMarker): Self = StObject.set(x, "mdxJsxTextTagExpressionAttributeMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagExpressionAttributeValue(value: mdxJsxTextTagExpressionAttributeValue): Self = StObject.set(x, "mdxJsxTextTagExpressionAttributeValue", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagMarker(value: mdxJsxTextTagMarker): Self = StObject.set(x, "mdxJsxTextTagMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagName(value: mdxJsxTextTagName): Self = StObject.set(x, "mdxJsxTextTagName", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagNameLocal(value: mdxJsxTextTagNameLocal): Self = StObject.set(x, "mdxJsxTextTagNameLocal", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagNameMember(value: mdxJsxTextTagNameMember): Self = StObject.set(x, "mdxJsxTextTagNameMember", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagNameMemberMarker(value: mdxJsxTextTagNameMemberMarker): Self = StObject.set(x, "mdxJsxTextTagNameMemberMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagNamePrefixMarker(value: mdxJsxTextTagNamePrefixMarker): Self = StObject.set(x, "mdxJsxTextTagNamePrefixMarker", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagNamePrimary(value: mdxJsxTextTagNamePrimary): Self = StObject.set(x, "mdxJsxTextTagNamePrimary", value.asInstanceOf[js.Any])
        
        inline def setMdxJsxTextTagSelfClosingMarker(value: mdxJsxTextTagSelfClosingMarker): Self = StObject.set(x, "mdxJsxTextTagSelfClosingMarker", value.asInstanceOf[js.Any])
      }
    }
  }
}
