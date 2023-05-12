package typings.postcssCustomProperties

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformValueAstMod {
  
  @JSImport("postcss-custom-properties/dist/transform-value-ast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.ParsedValue */ Any,
    customProperties: Map[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.ParsedValue */ Any
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], customProperties.asInstanceOf[js.Any])).asInstanceOf[String]
}
