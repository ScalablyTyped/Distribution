package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpdatesOptions extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[String]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object GetUpdatesOptions {
  @scala.inline
  def apply(): GetUpdatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpdatesOptions]
  }
  @scala.inline
  implicit class GetUpdatesOptionsOps[Self <: GetUpdatesOptions] (val x: Self) extends AnyVal {
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
    def setAllowed_updatesVarargs(value: String*): Self = this.set("allowed_updates", js.Array(value :_*))
    @scala.inline
    def setAllowed_updates(value: js.Array[String]): Self = this.set("allowed_updates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowed_updates: Self = this.set("allowed_updates", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

