package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends js.Object {
  var Value: scala.Double
  def Clone(): INumber
}

object INumber {
  @scala.inline
  def apply(Clone: () => INumber, Value: scala.Double): INumber = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value)
  
    __obj.asInstanceOf[INumber]
  }
}

