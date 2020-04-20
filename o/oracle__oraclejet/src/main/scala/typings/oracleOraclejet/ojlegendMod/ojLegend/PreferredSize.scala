package typings.oracleOraclejet.ojlegendMod.ojLegend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait PreferredSize extends js.Object {
  var height: Double
  var width: Double
}

object PreferredSize {
  @scala.inline
  def apply(height: Double, width: Double): PreferredSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferredSize]
  }
}

