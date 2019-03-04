package typings
package plugapiLib.plugapiMod.PlugAPINs.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanReason extends js.Object {
  var INAPPROPRIATE_GENRE: scala.Double
  var NEGATIVE_ATTITUDE: scala.Double
  var OFFENSIVE_MEDIA: scala.Double
  var SPAMMING_TROLLING: scala.Double
  var VERBAL_ABUSE: scala.Double
}

object BanReason {
  @scala.inline
  def apply(
    INAPPROPRIATE_GENRE: scala.Double,
    NEGATIVE_ATTITUDE: scala.Double,
    OFFENSIVE_MEDIA: scala.Double,
    SPAMMING_TROLLING: scala.Double,
    VERBAL_ABUSE: scala.Double
  ): BanReason = {
    val __obj = js.Dynamic.literal(INAPPROPRIATE_GENRE = INAPPROPRIATE_GENRE, NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE, OFFENSIVE_MEDIA = OFFENSIVE_MEDIA, SPAMMING_TROLLING = SPAMMING_TROLLING, VERBAL_ABUSE = VERBAL_ABUSE)
  
    __obj.asInstanceOf[BanReason]
  }
}

