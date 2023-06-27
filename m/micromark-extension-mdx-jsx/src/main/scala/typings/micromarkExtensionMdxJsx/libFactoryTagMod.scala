package typings.micromarkExtensionMdxJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoryTagMod {
  
  @JSImport("micromark-extension-mdx-jsx/lib/factory-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryTag(
    effects: Effects,
    ok: State,
    nok: State,
    acorn: js.UndefOr[Acorn],
    acornOptions: js.UndefOr[AcornOptions],
    addResult: js.UndefOr[Boolean],
    allowLazy: js.UndefOr[Boolean],
    tagType: TokenType,
    tagMarkerType: TokenType,
    tagClosingMarkerType: TokenType,
    tagSelfClosingMarker: TokenType,
    tagNameType: TokenType,
    tagNamePrimaryType: TokenType,
    tagNameMemberMarkerType: TokenType,
    tagNameMemberType: TokenType,
    tagNamePrefixMarkerType: TokenType,
    tagNameLocalType: TokenType,
    tagExpressionAttributeType: TokenType,
    tagExpressionAttributeMarkerType: TokenType,
    tagExpressionAttributeValueType: TokenType,
    tagAttributeType: TokenType,
    tagAttributeNameType: TokenType,
    tagAttributeNamePrimaryType: TokenType,
    tagAttributeNamePrefixMarkerType: TokenType,
    tagAttributeNameLocalType: TokenType,
    tagAttributeInitializerMarkerType: TokenType,
    tagAttributeValueLiteralType: TokenType,
    tagAttributeValueLiteralMarkerType: TokenType,
    tagAttributeValueLiteralValueType: TokenType,
    tagAttributeValueExpressionType: TokenType,
    tagAttributeValueExpressionMarkerType: TokenType,
    tagAttributeValueExpressionValueType: TokenType
  ): js.Function1[
    /* code */ typings.micromarkUtilTypes.mod.Code, 
    Unit | typings.micromarkUtilTypes.mod.State
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryTag")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], nok.asInstanceOf[js.Any], acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any], allowLazy.asInstanceOf[js.Any], tagType.asInstanceOf[js.Any], tagMarkerType.asInstanceOf[js.Any], tagClosingMarkerType.asInstanceOf[js.Any], tagSelfClosingMarker.asInstanceOf[js.Any], tagNameType.asInstanceOf[js.Any], tagNamePrimaryType.asInstanceOf[js.Any], tagNameMemberMarkerType.asInstanceOf[js.Any], tagNameMemberType.asInstanceOf[js.Any], tagNamePrefixMarkerType.asInstanceOf[js.Any], tagNameLocalType.asInstanceOf[js.Any], tagExpressionAttributeType.asInstanceOf[js.Any], tagExpressionAttributeMarkerType.asInstanceOf[js.Any], tagExpressionAttributeValueType.asInstanceOf[js.Any], tagAttributeType.asInstanceOf[js.Any], tagAttributeNameType.asInstanceOf[js.Any], tagAttributeNamePrimaryType.asInstanceOf[js.Any], tagAttributeNamePrefixMarkerType.asInstanceOf[js.Any], tagAttributeNameLocalType.asInstanceOf[js.Any], tagAttributeInitializerMarkerType.asInstanceOf[js.Any], tagAttributeValueLiteralType.asInstanceOf[js.Any], tagAttributeValueLiteralMarkerType.asInstanceOf[js.Any], tagAttributeValueLiteralValueType.asInstanceOf[js.Any], tagAttributeValueExpressionType.asInstanceOf[js.Any], tagAttributeValueExpressionMarkerType.asInstanceOf[js.Any], tagAttributeValueExpressionValueType.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* code */ typings.micromarkUtilTypes.mod.Code, 
    Unit | typings.micromarkUtilTypes.mod.State
  ]]
  
  type Acorn = typings.micromarkFactoryMdxExpression.mod.Acorn
  
  type AcornOptions = typings.micromarkFactoryMdxExpression.mod.AcornOptions
  
  type Code = typings.micromarkUtilTypes.mod.Code
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenType = typings.micromarkUtilTypes.mod.TokenType
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
}
