package typings.onsenui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: js.Any
  var params: js.UndefOr[js.Object] = js.undefined
  var parent: Element
}

object Anon_Page {
  @scala.inline
  def apply(page: js.Any, parent: Element, params: js.Object = null): Anon_Page = {
    val __obj = js.Dynamic.literal(page = page, parent = parent)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Page]
  }
}

