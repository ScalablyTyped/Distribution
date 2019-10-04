package typings.atPollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Page extends js.Object {
  var page: js.UndefOr[js.Any] = js.undefined
}

object Anon_Page {
  @scala.inline
  def apply(page: js.Any = null): Anon_Page = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page)
    __obj.asInstanceOf[Anon_Page]
  }
}

