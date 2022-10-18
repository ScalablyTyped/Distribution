package typings.postcssCalc

import typings.postcss.mod.Result
import typings.postcssCalc.anon.Preserve
import typings.postcssCalc.postcssCalcStrings.params
import typings.postcssCalc.postcssCalcStrings.selector
import typings.postcssCalc.postcssCalcStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibTransformMod {
  
  inline def apply(node: Any, property: value | params | selector, options: Preserve, result: Result): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], property.asInstanceOf[js.Any], options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("postcss-calc/types/lib/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
