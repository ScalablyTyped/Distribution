package typings
package atOracleOraclejetLib.ojchartMod.ojChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait PieCenterContext extends js.Object {
  var componentElement: stdLib.Element
  var innerBounds: js.Object
  var label: java.lang.String
  var outerBounds: js.Object
}

object PieCenterContext {
  @scala.inline
  def apply(
    componentElement: stdLib.Element,
    innerBounds: js.Object,
    label: java.lang.String,
    outerBounds: js.Object
  ): PieCenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, innerBounds = innerBounds, label = label, outerBounds = outerBounds)
  
    __obj.asInstanceOf[PieCenterContext]
  }
}

