package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementHeight extends js.Object {
  var element: typings.std.Element
  var height: Double
  var width: Double
}

object ElementHeight {
  @scala.inline
  def apply(element: typings.std.Element, height: Double, width: Double): ElementHeight = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementHeight]
  }
}

