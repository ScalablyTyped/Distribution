package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfilePhotos extends js.Object {
  var photos: js.Array[js.Array[PhotoSize]]
  var total_count: Double
}

object UserProfilePhotos {
  @scala.inline
  def apply(photos: js.Array[js.Array[PhotoSize]], total_count: Double): UserProfilePhotos = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserProfilePhotos]
  }
}

