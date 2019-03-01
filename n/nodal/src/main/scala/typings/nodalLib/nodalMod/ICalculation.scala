package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalculation extends js.Object {
  var calculate: js.Function
  var fields: js.Array[java.lang.String]
}

object ICalculation {
  @scala.inline
  def apply(calculate: js.Function, fields: js.Array[java.lang.String]): ICalculation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calculate")(calculate)
    __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[ICalculation]
  }
}

