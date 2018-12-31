package typings
package numbroLib.numbroMod.numbroNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var average: js.UndefOr[scala.Boolean] = js.undefined
  var characteristic: js.UndefOr[scala.Double] = js.undefined
  var forceAverage: js.UndefOr[
    numbroLib.numbroLibStrings.trillion | numbroLib.numbroLibStrings.billion | numbroLib.numbroLibStrings.million | numbroLib.numbroLibStrings.thousand
  ] = js.undefined
  var forceSign: js.UndefOr[scala.Boolean] = js.undefined
  var mantissa: js.UndefOr[scala.Double] = js.undefined
  var negative: js.UndefOr[numbroLib.numbroLibStrings.sign | numbroLib.numbroLibStrings.parenthesis] = js.undefined
  var optionalMantissa: js.UndefOr[scala.Boolean] = js.undefined
  var output: js.UndefOr[
    numbroLib.numbroLibStrings.currency | numbroLib.numbroLibStrings.percent | numbroLib.numbroLibStrings.byte | numbroLib.numbroLibStrings.time | numbroLib.numbroLibStrings.ordinal | numbroLib.numbroLibStrings.number
  ] = js.undefined
  var postfix: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[scala.Double] = js.undefined
  var spaceSeparated: js.UndefOr[scala.Boolean] = js.undefined
  var thousandSeparated: js.UndefOr[scala.Boolean] = js.undefined
  var totalLength: js.UndefOr[scala.Double] = js.undefined
  var trimMantissa: js.UndefOr[scala.Boolean] = js.undefined
}

