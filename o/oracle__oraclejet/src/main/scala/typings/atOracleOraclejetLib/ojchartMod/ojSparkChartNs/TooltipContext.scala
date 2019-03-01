package typings
package atOracleOraclejetLib.ojchartMod.ojSparkChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var parentElement: stdLib.Element
}

object TooltipContext {
  @scala.inline
  def apply(color: java.lang.String, componentElement: stdLib.Element, parentElement: stdLib.Element): TooltipContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("parentElement")(parentElement)
    __obj.asInstanceOf[TooltipContext]
  }
}

