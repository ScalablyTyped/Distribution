package typings.nivoBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: String | Double
  var indexValue: String | Double
  var value: Double
}

object Id {
  @scala.inline
  def apply(id: String | Double, indexValue: String | Double, value: Double): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

