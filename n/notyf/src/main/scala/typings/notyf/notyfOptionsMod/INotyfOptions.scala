package typings.notyf.notyfOptionsMod

import typings.notyf.DeepPartialINotyfNotifica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfOptions extends js.Object {
  var duration: Double
  var ripple: Boolean
  var types: js.Array[DeepPartialINotyfNotifica]
}

object INotyfOptions {
  @scala.inline
  def apply(duration: Double, ripple: Boolean, types: js.Array[DeepPartialINotyfNotifica]): INotyfOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotyfOptions]
  }
}

