package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollationOptions extends js.Object {
  var alternate: js.UndefOr[java.lang.String] = js.undefined
  var backwards: js.UndefOr[scala.Boolean] = js.undefined
  var caseFirst: js.UndefOr[java.lang.String] = js.undefined
  var caseLevel: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxVariable: js.UndefOr[java.lang.String] = js.undefined
  var numericOrdering: js.UndefOr[scala.Boolean] = js.undefined
  var strength: js.UndefOr[scala.Double] = js.undefined
}

object CollationOptions {
  @scala.inline
  def apply(
    alternate: java.lang.String = null,
    backwards: js.UndefOr[scala.Boolean] = js.undefined,
    caseFirst: java.lang.String = null,
    caseLevel: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    maxVariable: java.lang.String = null,
    numericOrdering: js.UndefOr[scala.Boolean] = js.undefined,
    strength: scala.Int | scala.Double = null
  ): CollationOptions = {
    val __obj = js.Dynamic.literal()
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards)
    if (caseFirst != null) __obj.updateDynamic("caseFirst")(caseFirst)
    if (!js.isUndefined(caseLevel)) __obj.updateDynamic("caseLevel")(caseLevel)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxVariable != null) __obj.updateDynamic("maxVariable")(maxVariable)
    if (!js.isUndefined(numericOrdering)) __obj.updateDynamic("numericOrdering")(numericOrdering)
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollationOptions]
  }
}

