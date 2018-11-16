package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "colorScaleConditionalFormat.toJSON()". */

trait ColorScaleConditionalFormatData extends js.Object {
  /**
               *
               * The criteria of the color scale. Midpoint is optional when using a two point color scale.
               *
               * [Api set: ExcelApi 1.6]
               */
  var criteria: js.UndefOr[officeDashJsLib.ExcelNs.ConditionalColorScaleCriteria] = js.undefined
  /**
               *
               * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
               *
               * [Api set: ExcelApi 1.6]
               */
  var threeColorScale: js.UndefOr[scala.Boolean] = js.undefined
}

