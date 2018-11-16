package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents an IconSet criteria for conditional formatting.
         *
         * [Api set: ExcelApi 1.6]
         */

trait ColorScaleConditionalFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The criteria of the color scale. Midpoint is optional when using a two point color scale.
               *
               * [Api set: ExcelApi 1.6]
               */
  var criteria: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
               *
               * [Api set: ExcelApi 1.6]
               */
  var threeColorScale: js.UndefOr[scala.Boolean] = js.undefined
}

