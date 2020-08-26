package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineQueryResultLocation
  extends InlineQueryResultLocationBase
     with InlineQueryResult {
  var `type`: location = js.native
}

object InlineQueryResultLocation {
  @scala.inline
  def apply(id: String, latitude: Double, longitude: Double, title: String, `type`: location): InlineQueryResultLocation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocation]
  }
  @scala.inline
  implicit class InlineQueryResultLocationOps[Self <: InlineQueryResultLocation] (val x: Self) extends AnyVal {
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
    def setType(value: location): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

