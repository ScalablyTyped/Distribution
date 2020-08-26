package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `11` extends js.Object {
  var data: js.Array[Avatarurl] = js.native
}

object `11` {
  @scala.inline
  def apply(data: js.Array[Avatarurl]): `11` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Avatarurl*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Avatarurl]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

