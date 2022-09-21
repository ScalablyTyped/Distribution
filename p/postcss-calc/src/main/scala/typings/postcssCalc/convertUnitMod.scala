package typings.postcssCalc

import typings.postcssCalc.postcssCalcBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertUnitMod {
  
  /**
    * @param {number} value
    * @param {string} sourceUnit
    * @param {string} targetUnit
    * @param {number|false} precision
    */
  inline def apply(value: Double, sourceUnit: String, targetUnit: String, precision: Double): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], sourceUnit.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(value: Double, sourceUnit: String, targetUnit: String, precision: `false`): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], sourceUnit.asInstanceOf[js.Any], targetUnit.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("postcss-calc/types/lib/convertUnit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
