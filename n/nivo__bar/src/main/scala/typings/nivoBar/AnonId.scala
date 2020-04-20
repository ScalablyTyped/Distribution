package typings.nivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String | Double
  var indexValue: String | Double
  var value: Double
}

object AnonId {
  @scala.inline
  def apply(id: String | Double, indexValue: String | Double, value: Double): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

