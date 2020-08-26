package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Parents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `14` extends js.Object {
  var data: js.Array[Parents] = js.native
}

object `14` {
  @scala.inline
  def apply(data: js.Array[Parents]): `14` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  @scala.inline
  implicit class `14Ops`[Self <: `14`] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: Parents*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Parents]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

