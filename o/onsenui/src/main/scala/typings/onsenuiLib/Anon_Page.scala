package typings
package onsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: js.Any
  var params: js.UndefOr[coreDashJsLib.Object] = js.undefined
  var parent: stdLib.Element
}

object Anon_Page {
  @scala.inline
  def apply(page: js.Any, parent: stdLib.Element, params: coreDashJsLib.Object = null): Anon_Page = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("parent")(parent)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Page]
  }
}

