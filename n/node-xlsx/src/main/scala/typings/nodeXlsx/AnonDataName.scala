package typings.nodeXlsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataName extends js.Object {
  var data: js.Array[js.Array[_]]
  var name: String
}

object AnonDataName {
  @scala.inline
  def apply(data: js.Array[js.Array[_]], name: String): AnonDataName = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataName]
  }
}

