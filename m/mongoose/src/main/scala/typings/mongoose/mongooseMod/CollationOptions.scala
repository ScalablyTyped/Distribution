package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollationOptions extends js.Object {
  var alternate: js.UndefOr[String] = js.undefined
  var backwards: js.UndefOr[Boolean] = js.undefined
  var caseFirst: js.UndefOr[String] = js.undefined
  var caseLevel: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxVariable: js.UndefOr[String] = js.undefined
  var numericOrdering: js.UndefOr[Boolean] = js.undefined
  var strength: js.UndefOr[Double] = js.undefined
}

object CollationOptions {
  @scala.inline
  def apply(
    alternate: String = null,
    backwards: js.UndefOr[Boolean] = js.undefined,
    caseFirst: String = null,
    caseLevel: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxVariable: String = null,
    numericOrdering: js.UndefOr[Boolean] = js.undefined,
    strength: Int | Double = null
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

