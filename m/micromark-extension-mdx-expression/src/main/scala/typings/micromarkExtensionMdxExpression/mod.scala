package typings.micromarkExtensionMdxExpression

import typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-mdx-expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxExpression(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")().asInstanceOf[Extension]
  inline def mdxExpression(options: typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxExpression")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Options = typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Options
}
