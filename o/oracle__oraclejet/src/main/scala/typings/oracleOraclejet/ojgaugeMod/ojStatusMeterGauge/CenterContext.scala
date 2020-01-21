package typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge

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
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CenterContext]
  }
}

