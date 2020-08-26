package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.cloak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `21` extends js.Object {
  var previews: Array[cloak | String] = js.native
}

object `21` {
  @scala.inline
  def apply(previews: Array[cloak | String]): `21` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  @scala.inline
  implicit class `21Ops`[Self <: `21`] (val x: Self) extends AnyVal {
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
    def setPreviews(value: Array[cloak | String]): Self = this.set("previews", value.asInstanceOf[js.Any])
  }
  
}

