package typings
package plugapiLib.plugapiMod.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuteReason extends js.Object {
  var NEGATIVE_ATTITUDE: scala.Double
  var OFFENSIVE_LANGUAGE: scala.Double
  var SPAMMING_TROLLING: scala.Double
  var VERBAL_ABUSE: scala.Double
  var VIOLATING_COMMUNITY_RULES: scala.Double
}

object MuteReason {
  @scala.inline
  def apply(
    NEGATIVE_ATTITUDE: scala.Double,
    OFFENSIVE_LANGUAGE: scala.Double,
    SPAMMING_TROLLING: scala.Double,
    VERBAL_ABUSE: scala.Double,
    VIOLATING_COMMUNITY_RULES: scala.Double
  ): MuteReason = {
    val __obj = js.Dynamic.literal(NEGATIVE_ATTITUDE = NEGATIVE_ATTITUDE, OFFENSIVE_LANGUAGE = OFFENSIVE_LANGUAGE, SPAMMING_TROLLING = SPAMMING_TROLLING, VERBAL_ABUSE = VERBAL_ABUSE, VIOLATING_COMMUNITY_RULES = VIOLATING_COMMUNITY_RULES)
  
    __obj.asInstanceOf[MuteReason]
  }
}

