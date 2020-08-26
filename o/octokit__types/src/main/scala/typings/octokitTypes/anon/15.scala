package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.switcheroo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `15` extends js.Object {
  var previews: Array[switcheroo | String] = js.native
}

object `15` {
  @scala.inline
  def apply(previews: Array[switcheroo | String]): `15` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  @scala.inline
  implicit class `15Ops`[Self <: `15`] (val x: Self) extends AnyVal {
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
    def setPreviews(value: Array[switcheroo | String]): Self = this.set("previews", value.asInstanceOf[js.Any])
  }
  
}

