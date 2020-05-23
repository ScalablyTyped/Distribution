package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdNumber extends js.Object {
  var id: Double
}

object IdNumber {
  @scala.inline
  def apply(id: Double): IdNumber = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNumber]
  }
}

