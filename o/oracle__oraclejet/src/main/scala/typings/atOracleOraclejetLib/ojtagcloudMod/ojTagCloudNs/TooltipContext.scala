package typings
package atOracleOraclejetLib.ojtagcloudMod.ojTagCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K] extends js.Object {
  var color: java.lang.String
  var componentElement: stdLib.Element
  var id: K
  var label: java.lang.String
  var parentElement: stdLib.Element
  var value: scala.Double
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: java.lang.String,
    componentElement: stdLib.Element,
    id: K,
    label: java.lang.String,
    parentElement: stdLib.Element,
    value: scala.Double
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal(color = color, componentElement = componentElement, id = id.asInstanceOf[js.Any], label = label, parentElement = parentElement, value = value)
  
    __obj.asInstanceOf[TooltipContext[K]]
  }
}

