package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetAllTopicsResponseData extends js.Object {
  var names: js.Array[String] = js.native
}

object ReposGetAllTopicsResponseData {
  @scala.inline
  def apply(names: js.Array[String]): ReposGetAllTopicsResponseData = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsResponseData]
  }
  @scala.inline
  implicit class ReposGetAllTopicsResponseDataOps[Self <: ReposGetAllTopicsResponseData] (val x: Self) extends AnyVal {
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
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
  }
  
}

