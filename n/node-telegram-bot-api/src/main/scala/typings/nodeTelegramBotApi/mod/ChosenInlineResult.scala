package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChosenInlineResult extends js.Object {
  var from: User = js.native
  var inline_message_id: js.UndefOr[String] = js.native
  var location: js.UndefOr[Location] = js.native
  var query: String = js.native
  var result_id: String = js.native
}

object ChosenInlineResult {
  @scala.inline
  def apply(from: User, query: String, result_id: String): ChosenInlineResult = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], result_id = result_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChosenInlineResult]
  }
  @scala.inline
  implicit class ChosenInlineResultOps[Self <: ChosenInlineResult] (val x: Self) extends AnyVal {
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
    def setFrom(value: User): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult_id(value: String): Self = this.set("result_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInline_message_id(value: String): Self = this.set("inline_message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline_message_id: Self = this.set("inline_message_id", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

