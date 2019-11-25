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
    val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE.asInstanceOf[js.Any], OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE.asInstanceOf[js.Any], SPAMMING_TROLLING = SPAMMING_TROLLING.asInstanceOf[js.Any], VERBAL_ABUSE = VERBAL_ABUSE.asInstanceOf[js.Any], VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MuteReason]
  }
}

