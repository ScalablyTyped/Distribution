package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a rule, for all traditional rule/format pairings.
         *
         * [Api set: ExcelApi 1.6]
         */

trait ConditionalFormatRuleLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The formula, if required, to evaluate the conditional format rule on.
               *
               * [Api set: ExcelApi 1.6]
               */
  var formula: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The formula, if required, to evaluate the conditional format rule on in the user's language.
               *
               * [Api set: ExcelApi 1.6]
               */
  var formulaLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The formula, if required, to evaluate the conditional format rule on in R1C1-style notation.
               *
               * [Api set: ExcelApi 1.6]
               */
  var formulaR1C1: js.UndefOr[scala.Boolean] = js.undefined
}

