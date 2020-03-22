package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var fontSize: String
  var lineHeight: Double
  var position: String
  var verticalAlign: String
}

object AnonPosition {
  @scala.inline
  def apply(fontSize: String, lineHeight: Double, position: String, verticalAlign: String): AnonPosition = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}

