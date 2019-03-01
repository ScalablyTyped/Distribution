package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  var items: js.Array[TextContentItem]
  var styles: js.Any
}

object TextContent {
  @scala.inline
  def apply(items: js.Array[TextContentItem], styles: js.Any): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[TextContent]
  }
}

