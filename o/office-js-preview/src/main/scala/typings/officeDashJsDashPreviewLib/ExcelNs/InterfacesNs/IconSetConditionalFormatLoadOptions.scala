package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents an IconSet criteria for conditional formatting.
         *
         * [Api set: ExcelApi 1.6]
         */

trait IconSetConditionalFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
               *
               * [Api set: ExcelApi 1.6]
               */
  var criteria: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
               *
               * [Api set: ExcelApi 1.6]
               */
  var reverseIconOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * If true, hides the values and only shows icons.
               *
               * [Api set: ExcelApi 1.6]
               */
  var showIconOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * If set, displays the IconSet option for the conditional format.
               *
               * [Api set: ExcelApi 1.6]
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
}

