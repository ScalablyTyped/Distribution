package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilePhotos extends js.Object {
  var photos: js.Array[js.Array[PhotoSize]]
  var total_count: scala.Double
}

object UserProfilePhotos {
  @scala.inline
  def apply(photos: js.Array[js.Array[PhotoSize]], total_count: scala.Double): UserProfilePhotos = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("photos")(photos)
    __obj.updateDynamic("total_count")(total_count)
    __obj.asInstanceOf[UserProfilePhotos]
  }
}

