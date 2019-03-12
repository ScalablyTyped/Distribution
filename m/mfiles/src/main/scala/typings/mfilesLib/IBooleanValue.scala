package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanValue extends js.Object {
  var Value: scala.Boolean
  def Clone(): IBooleanValue
}

object IBooleanValue {
  @scala.inline
  def apply(Clone: () => IBooleanValue, Value: scala.Boolean): IBooleanValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value)
  
    __obj.asInstanceOf[IBooleanValue]
  }
}

