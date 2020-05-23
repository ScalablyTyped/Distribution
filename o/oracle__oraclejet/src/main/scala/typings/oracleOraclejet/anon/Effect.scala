package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojanimationMod.AnimationMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect
  extends /* key */ StringDictionary[js.Any] {
  var effect: AnimationMethods
}

object Effect {
  @scala.inline
  def apply(effect: AnimationMethods, StringDictionary: /* name */ StringDictionary[js.Any] = null): Effect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Effect]
  }
}

