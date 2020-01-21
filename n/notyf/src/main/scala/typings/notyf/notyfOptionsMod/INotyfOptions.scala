package typings.notyf.notyfOptionsMod

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
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotyfOptions]
  }
}

