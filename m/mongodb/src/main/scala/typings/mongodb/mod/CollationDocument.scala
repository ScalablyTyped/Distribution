package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollationDocument extends js.Object {
  var alternate: js.UndefOr[String] = js.undefined
  var backwards: js.UndefOr[Boolean] = js.undefined
  var caseFirst: js.UndefOr[String] = js.undefined
  var caseLevel: js.UndefOr[Boolean] = js.undefined
  var locale: String
  var maxVariable: js.UndefOr[String] = js.undefined
  var normalization: js.UndefOr[Boolean] = js.undefined
  var numericOrdering: js.UndefOr[Boolean] = js.undefined
  var strength: js.UndefOr[scala.Double] = js.undefined
}

object CollationDocument {
  @scala.inline
  def apply(
    locale: String,
    alternate: String = null,
    backwards: js.UndefOr[Boolean] = js.undefined,
    caseFirst: String = null,
    caseLevel: js.UndefOr[Boolean] = js.undefined,
    maxVariable: String = null,
    normalization: js.UndefOr[Boolean] = js.undefined,
    numericOrdering: js.UndefOr[Boolean] = js.undefined,
    strength: js.UndefOr[scala.Double] = js.undefined
  ): CollationDocument = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards.get.asInstanceOf[js.Any])
    if (caseFirst != null) __obj.updateDynamic("caseFirst")(caseFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(caseLevel)) __obj.updateDynamic("caseLevel")(caseLevel.get.asInstanceOf[js.Any])
    if (maxVariable != null) __obj.updateDynamic("maxVariable")(maxVariable.asInstanceOf[js.Any])
    if (!js.isUndefined(normalization)) __obj.updateDynamic("normalization")(normalization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numericOrdering)) __obj.updateDynamic("numericOrdering")(numericOrdering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strength)) __obj.updateDynamic("strength")(strength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollationDocument]
  }
}

