package typings.nivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var label: String | Double
}

object AnonId {
  @scala.inline
  def apply(label: String | Double, id: String | Double = null): AnonId = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

