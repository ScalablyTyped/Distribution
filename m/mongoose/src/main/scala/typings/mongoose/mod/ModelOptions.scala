package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://mongoosejs.com/docs/api.html#query_Query-setOptions */
@js.native
trait ModelOptions extends js.Object {
  var session: js.UndefOr[ClientSession | Null] = js.native
}

object ModelOptions {
  @scala.inline
  def apply(): ModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelOptions]
  }
  @scala.inline
  implicit class ModelOptionsOps[Self <: ModelOptions] (val x: Self) extends AnyVal {
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
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
  }
  
}

