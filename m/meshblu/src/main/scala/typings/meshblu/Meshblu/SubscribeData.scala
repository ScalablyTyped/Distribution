package typings.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeData extends js.Object {
  var topics: js.UndefOr[js.Array[String]] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
  var uuid: String = js.native
}

object SubscribeData {
  @scala.inline
  def apply(uuid: String): SubscribeData = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
  @scala.inline
  implicit class SubscribeDataOps[Self <: SubscribeData] (val x: Self) extends AnyVal {
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicsVarargs(value: String*): Self = this.set("topics", js.Array(value :_*))
    @scala.inline
    def setTopics(value: js.Array[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

