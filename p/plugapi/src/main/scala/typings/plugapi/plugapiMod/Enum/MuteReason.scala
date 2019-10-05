package typings.plugapi.plugapiMod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuteReason extends js.Object {
  var NEGATIVE_ATTITUDE: Double
  var OFFENSIVE_LANGUAGE: Double
  var SPAMMING_TROLLING: Double
  var VERBAL_ABUSE: Double
  var VIOLATING_COMMUNITY_RULES: Double
}

object MuteReason {
  @scala.inline
  def apply(
    NEGATIVE_ATTITUDE: Double,
    OFFENSIVE_LANGUAGE: Double,
    SPAMMING_TROLLING: Double,
    VERBAL_ABUSE: Double,
    VIOLATING_COMMUNITY_RULES: Double
  ): MuteReason = {
    val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE, OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE, SPAMMING_TROLLING = SPAMMING_TROLLING, VERBAL_ABUSE = VERBAL_ABUSE, VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES)
  
    __obj.asInstanceOf[MuteReason]
  }
}

