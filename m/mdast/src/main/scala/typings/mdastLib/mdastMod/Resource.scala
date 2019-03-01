package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Resource {
  @scala.inline
  def apply(url: java.lang.String, title: java.lang.String = null): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Resource]
  }
}

