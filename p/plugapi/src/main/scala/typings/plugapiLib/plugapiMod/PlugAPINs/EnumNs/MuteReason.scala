package typings
package plugapiLib.plugapiMod.PlugAPINs.EnumNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NEGATIVE_ATTITUDE")(NEGATIVE_ATTITUDE)
    __obj.updateDynamic("OFFENSIVE_LANGUAGE")(OFFENSIVE_LANGUAGE)
    __obj.updateDynamic("SPAMMING_TROLLING")(SPAMMING_TROLLING)
    __obj.updateDynamic("VERBAL_ABUSE")(VERBAL_ABUSE)
    __obj.updateDynamic("VIOLATING_COMMUNITY_RULES")(VIOLATING_COMMUNITY_RULES)
    __obj.asInstanceOf[MuteReason]
  }
}

