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
    val __obj = js.Dynamic.literal(componentElement = componentElement, innerBounds = innerBounds, metricLabel = metricLabel, outerBounds = outerBounds)
  
    __obj.asInstanceOf[CenterContext]
  }
}

