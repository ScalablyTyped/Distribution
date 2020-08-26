package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Organizationsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `19` extends js.Object {
  var data: js.Array[Organizationsurl] = js.native
}

object `19` {
  @scala.inline
  def apply(data: js.Array[Organizationsurl]): `19` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  @scala.inline
  implicit class `19Ops`[Self <: `19`] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Organizationsurl*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Organizationsurl]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

