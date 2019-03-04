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
  def apply(Clone: js.Function0[IBooleanValue], Value: scala.Boolean): IBooleanValue = {
    val __obj = js.Dynamic.literal(Clone = Clone, Value = Value)
  
    __obj.asInstanceOf[IBooleanValue]
  }
}

