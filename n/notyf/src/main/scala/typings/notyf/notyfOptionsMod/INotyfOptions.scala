package typings.notyf.notyfOptionsMod

import typings.notyf.anon.DeepPartialINotyfNotifica
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotyfOptions extends js.Object {
  var dismissible: Boolean = js.native
  var duration: Double = js.native
  var position: INotyfPosition = js.native
  var ripple: Boolean = js.native
  var types: js.Array[DeepPartialINotyfNotifica] = js.native
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
  @scala.inline
  implicit class INotyfOptionsOps[Self <: INotyfOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: INotyfPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: DeepPartialINotyfNotifica*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[DeepPartialINotyfNotifica]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

