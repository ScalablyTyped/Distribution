package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalculation extends js.Object {
  var calculate: js.Function
  var fields: js.Array[String]
}

object ICalculation {
  @scala.inline
  def apply(calculate: js.Function, fields: js.Array[String]): ICalculation = {
    val __obj = js.Dynamic.literal(calculate = calculate.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICalculation]
  }
}

