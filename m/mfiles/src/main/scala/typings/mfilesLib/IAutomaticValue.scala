package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticValue extends js.Object {
  var ANSIncrement: scala.Double
  var ANVCode: java.lang.String
  var CVSExpression: java.lang.String
  var CVVCode: java.lang.String
  var CalculationOrderNumber: scala.Double
  def Clone(): IAutomaticValue
}

object IAutomaticValue {
  @scala.inline
  def apply(
    ANSIncrement: scala.Double,
    ANVCode: java.lang.String,
    CVSExpression: java.lang.String,
    CVVCode: java.lang.String,
    CalculationOrderNumber: scala.Double,
    Clone: js.Function0[IAutomaticValue]
  ): IAutomaticValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ANSIncrement")(ANSIncrement)
    __obj.updateDynamic("ANVCode")(ANVCode)
    __obj.updateDynamic("CVSExpression")(CVSExpression)
    __obj.updateDynamic("CVVCode")(CVVCode)
    __obj.updateDynamic("CalculationOrderNumber")(CalculationOrderNumber)
    __obj.updateDynamic("Clone")(Clone)
    __obj.asInstanceOf[IAutomaticValue]
  }
}

