package typings.atOracleOraclejet.ojchartMod.ojChartNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait PieCenterContext extends js.Object {
  var componentElement: Element
  var innerBounds: js.Object
  var label: String
  var outerBounds: js.Object
}

object PieCenterContext {
  @scala.inline
  def apply(componentElement: Element, innerBounds: js.Object, label: String, outerBounds: js.Object): PieCenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, innerBounds = innerBounds, label = label, outerBounds = outerBounds)
  
    __obj.asInstanceOf[PieCenterContext]
  }
}

