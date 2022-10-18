package typings.micromarkExtensionMdxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-extension-mdxjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdxjs(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxjs")().asInstanceOf[Extension]
  inline def mdxjs(options: typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxjs")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Extension = typings.micromarkUtilTypes.mod.Extension
  
  type Options = typings.micromarkExtensionMdxExpression.mod.Options
}
