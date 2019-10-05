package typings.plugapi.plugapiMod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanReason extends js.Object {
  var INAPPROPRIATE_GENRE: Double
  var NEGATIVE_ATTITUDE: Double
  var OFFENSIVE_MEDIA: Double
  var SPAMMING_TROLLING: Double
  var VERBAL_ABUSE: Double
}

object BanReason {
  @scala.inline
  def apply(
    INAPPROPRIATE_GENRE: Double,
    NEGATIVE_ATTITUDE: Double,
    OFFENSIVE_MEDIA: Double,
    SPAMMING_TROLLING: Double,
    VERBAL_ABUSE: Double
  ): BanReason = {
    val __obj = js.Dynamic.literal(INAPPROPRIATE_GENRE = INAPPROPRIATE_GENRE, NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE, OFFENSIVE_MEDIA = OFFENSIVE_MEDIA, SPAMMING_TROLLING = SPAMMING_TROLLING, VERBAL_ABUSE = VERBAL_ABUSE)
  
    __obj.asInstanceOf[BanReason]
  }
}

