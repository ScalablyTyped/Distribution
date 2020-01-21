package typings.onsenui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var page: js.Any
  var params: js.UndefOr[js.Object] = js.undefined
  var parent: Element
}

object AnonPage {
  @scala.inline
  def apply(page: js.Any, parent: Element, params: js.Object = null): AnonPage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPage]
  }
}

