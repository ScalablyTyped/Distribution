package typings.notyf.notyfOptionsMod

import typings.notyf.anon.DeepPartialINotyfNotifica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotyfOptions extends js.Object {
  var dismissible: Boolean
  var duration: Double
  var position: INotyfPosition
  var ripple: Boolean
  var types: js.Array[DeepPartialINotyfNotifica]
}

object INotyfOptions {
  @scala.inline
  def apply(
    dismissible: Boolean,
    duration: Double,
    position: INotyfPosition,
    ripple: Boolean,
    types: js.Array[DeepPartialINotyfNotifica]
  ): INotyfOptions = {
    val __obj = js.Dynamic.literal(dismissible = dismissible.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ripple = ripple.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotyfOptions]
  }
}

