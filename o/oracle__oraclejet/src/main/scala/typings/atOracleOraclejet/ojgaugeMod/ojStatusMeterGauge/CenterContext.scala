package typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CenterContext extends js.Object {
  var componentElement: Element
  var innerBounds: Bounds
  var metricLabel: String
  var outerBounds: Bounds
}

object CenterContext {
  @scala.inline
  def apply(componentElement: Element, innerBounds: Bounds, metricLabel: String, outerBounds: Bounds): CenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, innerBounds = innerBounds, metricLabel = metricLabel, outerBounds = outerBounds)
  
    __obj.asInstanceOf[CenterContext]
  }
}

