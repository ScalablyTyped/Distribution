package typings
package atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CenterContext extends js.Object {
  var componentElement: stdLib.Element
  var innerBounds: Bounds
  var metricLabel: java.lang.String
  var outerBounds: Bounds
}

object CenterContext {
  @scala.inline
  def apply(
    componentElement: stdLib.Element,
    innerBounds: Bounds,
    metricLabel: java.lang.String,
    outerBounds: Bounds
  ): CenterContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("innerBounds")(innerBounds)
    __obj.updateDynamic("metricLabel")(metricLabel)
    __obj.updateDynamic("outerBounds")(outerBounds)
    __obj.asInstanceOf[CenterContext]
  }
}

