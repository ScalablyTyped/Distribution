package typings.mdast.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object Resource {
  @scala.inline
  def apply(url: String, title: String = null): Resource = {
    val __obj = js.Dynamic.literal(url = url)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Resource]
  }
}

