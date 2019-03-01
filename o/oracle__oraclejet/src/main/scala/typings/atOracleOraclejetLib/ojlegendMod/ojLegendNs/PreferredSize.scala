package typings
package atOracleOraclejetLib.ojlegendMod.ojLegendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait PreferredSize extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object PreferredSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): PreferredSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PreferredSize]
  }
}

