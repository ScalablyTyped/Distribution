package typings
package pDashEventLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralRulesOptions extends js.Object {
  var localeMatcher: js.UndefOr[
    pDashEventLib.pDashEventLibStrings.lookup | (pDashEventLib.pDashEventLibStrings.`best fit`)
  ] = js.undefined
  var `type`: js.UndefOr[
    pDashEventLib.pDashEventLibStrings.cardinal | pDashEventLib.pDashEventLibStrings.ordinal
  ] = js.undefined
}

object PluralRulesOptions {
  @scala.inline
  def apply(
    localeMatcher: pDashEventLib.pDashEventLibStrings.lookup | (pDashEventLib.pDashEventLibStrings.`best fit`) = null,
    `type`: pDashEventLib.pDashEventLibStrings.cardinal | pDashEventLib.pDashEventLibStrings.ordinal = null
  ): PluralRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralRulesOptions]
  }
}

