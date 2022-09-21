package typings.postcssCalc

import typings.postcss.mod.Result
import typings.postcss.nodeMod.ChildNode
import typings.postcssCalc.anon.Precision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifierMod {
  
  inline def apply(
    calc: String,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parser.CalcNode */ Any,
    originalValue: String,
    options: Precision,
    result: Result,
    item: ChildNode
  ): String = (^.asInstanceOf[js.Dynamic].apply(calc.asInstanceOf[js.Any], node.asInstanceOf[js.Any], originalValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], result.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("postcss-calc/types/lib/stringifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
