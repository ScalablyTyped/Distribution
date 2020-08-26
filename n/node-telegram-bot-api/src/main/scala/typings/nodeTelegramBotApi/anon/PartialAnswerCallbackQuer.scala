package typings.nodeTelegramBotApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-telegram-bot-api.node-telegram-bot-api.AnswerCallbackQueryOptions> */
@js.native
trait PartialAnswerCallbackQuer extends js.Object {
  var cache_time: js.UndefOr[Double] = js.native
  var callback_query_id: js.UndefOr[String] = js.native
  var show_alert: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object PartialAnswerCallbackQuer {
  @scala.inline
  def apply(): PartialAnswerCallbackQuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnswerCallbackQuer]
  }
  @scala.inline
  implicit class PartialAnswerCallbackQuerOps[Self <: PartialAnswerCallbackQuer] (val x: Self) extends AnyVal {
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
    def setCache_time(value: Double): Self = this.set("cache_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache_time: Self = this.set("cache_time", js.undefined)
    @scala.inline
    def setCallback_query_id(value: String): Self = this.set("callback_query_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback_query_id: Self = this.set("callback_query_id", js.undefined)
    @scala.inline
    def setShow_alert(value: Boolean): Self = this.set("show_alert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow_alert: Self = this.set("show_alert", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

