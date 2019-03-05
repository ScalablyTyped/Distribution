package typings
package pDashEventLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedPluralRulesOptions extends js.Object {
  var locale: java.lang.String
  var maximumFractionDigits: scala.Double
  var maximumSignificantDigits: scala.Double
  var minimumFractionDigits: scala.Double
  var minimumIntegerDigits: scala.Double
  var minimumSignificantDigits: scala.Double
  var pluralCategories: pDashEventLib.Array[java.lang.String]
  var `type`: pDashEventLib.pDashEventLibStrings.cardinal | pDashEventLib.pDashEventLibStrings.ordinal
}

object ResolvedPluralRulesOptions {
  @scala.inline
  def apply(
    locale: java.lang.String,
    maximumFractionDigits: scala.Double,
    maximumSignificantDigits: scala.Double,
    minimumFractionDigits: scala.Double,
    minimumIntegerDigits: scala.Double,
    minimumSignificantDigits: scala.Double,
    pluralCategories: pDashEventLib.Array[java.lang.String],
    `type`: pDashEventLib.pDashEventLibStrings.cardinal | pDashEventLib.pDashEventLibStrings.ordinal
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale, maximumFractionDigits = maximumFractionDigits, maximumSignificantDigits = maximumSignificantDigits, minimumFractionDigits = minimumFractionDigits, minimumIntegerDigits = minimumIntegerDigits, minimumSignificantDigits = minimumSignificantDigits, pluralCategories = pluralCategories)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
}

