package typings.officeUiFabricReact.scrollablePaneDefaultExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneExampleItem extends js.Object {
  var color: String
  var index: Double
  var text: String
}

object IScrollablePaneExampleItem {
  @scala.inline
  def apply(color: String, index: Double, text: String): IScrollablePaneExampleItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneExampleItem]
  }
}

