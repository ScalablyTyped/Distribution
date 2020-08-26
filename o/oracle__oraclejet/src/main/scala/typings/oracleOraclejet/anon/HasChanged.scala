package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasChanged extends js.Object {
  var hasChanged: Boolean = js.native
}

object HasChanged {
  @scala.inline
  def apply(hasChanged: Boolean): HasChanged = {
    val __obj = js.Dynamic.literal(hasChanged = hasChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChanged]
  }
  @scala.inline
  implicit class HasChangedOps[Self <: HasChanged] (val x: Self) extends AnyVal {
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
    def setHasChanged(value: Boolean): Self = this.set("hasChanged", value.asInstanceOf[js.Any])
  }
  
}

