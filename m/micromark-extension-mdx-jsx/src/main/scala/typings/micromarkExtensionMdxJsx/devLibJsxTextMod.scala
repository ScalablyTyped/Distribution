package typings.micromarkExtensionMdxJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibJsxTextMod {
  
  @JSImport("micromark-extension-mdx-jsx/dev/lib/jsx-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsxText(): Construct = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")().asInstanceOf[Construct]
  inline def jsxText(acorn: Unit, acornOptions: Unit, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxText(acorn: Unit, acornOptions: AcornOptions): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxText(acorn: Unit, acornOptions: AcornOptions, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxText(acorn: Acorn): Construct = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any]).asInstanceOf[Construct]
  inline def jsxText(acorn: Acorn, acornOptions: Unit, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxText(acorn: Acorn, acornOptions: AcornOptions): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any])).asInstanceOf[Construct]
  inline def jsxText(acorn: Acorn, acornOptions: AcornOptions, addResult: Boolean): Construct = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxText")(acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any])).asInstanceOf[Construct]
  
  type Acorn = typings.micromarkFactoryMdxExpression.mod.Acorn
  
  type AcornOptions = typings.micromarkFactoryMdxExpression.mod.AcornOptions
  
  type Construct = typings.micromarkUtilTypes.mod.Construct
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
  
  type Tokenizer = typings.micromarkUtilTypes.mod.Tokenizer
}
