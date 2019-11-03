package typings.notyf.notyfDotOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfOptions extends js.Object {
  var duration: Double
  var ripple: Boolean
  var types: js.Array[DeepPartial[INotyfNotificationOptions]]
}

object INotyfOptions {
  @scala.inline
  def apply(duration: Double, ripple: Boolean, types: js.Array[DeepPartial[INotyfNotificationOptions]]): INotyfOptions = {
    val __obj = js.Dynamic.literal(duration = duration, ripple = ripple, types = types)
  
    __obj.asInstanceOf[INotyfOptions]
  }
}

