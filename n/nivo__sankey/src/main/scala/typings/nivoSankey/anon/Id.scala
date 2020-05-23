package typings.nivoSankey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var label: String | Double
}

object Id {
  @scala.inline
  def apply(label: String | Double, id: String | Double = null): Id = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

