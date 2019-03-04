package typings
package atOracleOraclejetLib.ojpictochartMod.ojPictoChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K] extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var count: scala.Double
  var id: K
  var name: java.lang.String
  var parentElement: stdLib.Element
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: java.lang.String,
    componentElement: stdLib.Element,
    count: scala.Double,
    id: K,
    name: java.lang.String,
    parentElement: stdLib.Element
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, count = count, id = id.asInstanceOf[js.Any], name = name, parentElement = parentElement)
  
    __obj.asInstanceOf[TooltipContext[K]]
  }
}

