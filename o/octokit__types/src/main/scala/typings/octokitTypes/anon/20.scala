package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.groot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `20` extends js.Object {
  var previews: Array[groot | String] = js.native
}

object `20` {
  @scala.inline
  def apply(previews: Array[groot | String]): `20` = {
    val __obj = js.Dynamic.literal(previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  @scala.inline
  implicit class `20Ops`[Self <: `20`] (val x: Self) extends AnyVal {
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
    def setPreviews(value: Array[groot | String]): Self = this.set("previews", value.asInstanceOf[js.Any])
  }
  
}

