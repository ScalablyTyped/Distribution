package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Effect
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var effect: atOracleOraclejetLib.ojanimationMod.AnimationMethods
}

object Anon_Effect {
  @scala.inline
  def apply(
    effect: atOracleOraclejetLib.ojanimationMod.AnimationMethods,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Effect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("effect")(effect)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Effect]
  }
}

