package typings.officeDashJs.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Page object, for use in "page.set({ ... })". */
trait PageUpdateData extends js.Object {
  /**
    *
    * Returns the view of the page.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewUpdateData] = js.undefined
}

object PageUpdateData {
  @scala.inline
  def apply(view: PageViewUpdateData = null): PageUpdateData = {
    val __obj = js.Dynamic.literal()
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PageUpdateData]
  }
}

