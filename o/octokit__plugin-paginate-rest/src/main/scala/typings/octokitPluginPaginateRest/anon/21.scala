package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Allowmergecommit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `21` extends js.Object {
  var data: js.Array[Allowmergecommit] = js.native
}

object `21` {
  @scala.inline
  def apply(data: js.Array[Allowmergecommit]): `21` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
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
    def setDataVarargs(value: Allowmergecommit*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Allowmergecommit]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

