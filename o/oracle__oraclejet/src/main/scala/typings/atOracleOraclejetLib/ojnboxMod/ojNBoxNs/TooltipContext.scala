package typings
package atOracleOraclejetLib.ojnboxMod.ojNBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait TooltipContext[K] extends js.Object {
  var color: java.lang.String
  var column: java.lang.String
  var componentElement: stdLib.Element
  var id: K
  var indicatorColor: java.lang.String
  var label: java.lang.String
  var parentElement: stdLib.Element
  var row: java.lang.String
  var secondaryLabel: java.lang.String
}

object TooltipContext {
  @scala.inline
  def apply[K](
    color: java.lang.String,
    column: java.lang.String,
    componentElement: stdLib.Element,
    id: K,
    indicatorColor: java.lang.String,
    label: java.lang.String,
    parentElement: stdLib.Element,
    row: java.lang.String,
    secondaryLabel: java.lang.String
  ): TooltipContext[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("componentElement")(componentElement)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("indicatorColor")(indicatorColor)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("parentElement")(parentElement)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("secondaryLabel")(secondaryLabel)
    __obj.asInstanceOf[TooltipContext[K]]
  }
}

