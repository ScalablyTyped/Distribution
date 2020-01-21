package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojanimationMod.AnimationMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEffect
  extends /* key */ StringDictionary[js.Any] {
  var effect: AnimationMethods
}

object AnonEffect {
  @scala.inline
  def apply(effect: AnimationMethods, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonEffect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonEffect]
  }
}

