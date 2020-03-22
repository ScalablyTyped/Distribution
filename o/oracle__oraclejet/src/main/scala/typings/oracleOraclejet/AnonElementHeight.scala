package typings.oracleOraclejet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementHeight extends js.Object {
  var element: Element
  var height: Double
  var width: Double
}

object AnonElementHeight {
  @scala.inline
  def apply(element: Element, height: Double, width: Double): AnonElementHeight = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElementHeight]
  }
}

