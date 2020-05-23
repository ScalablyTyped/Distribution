package typings.mongoose.mod

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
    strength: js.UndefOr[Double] = js.undefined
  ): CollationOptions = {
    val __obj = js.Dynamic.literal()
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards.get.asInstanceOf[js.Any])
    if (caseFirst != null) __obj.updateDynamic("caseFirst")(caseFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(caseLevel)) __obj.updateDynamic("caseLevel")(caseLevel.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxVariable != null) __obj.updateDynamic("maxVariable")(maxVariable.asInstanceOf[js.Any])
    if (!js.isUndefined(numericOrdering)) __obj.updateDynamic("numericOrdering")(numericOrdering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strength)) __obj.updateDynamic("strength")(strength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollationOptions]
  }
}

