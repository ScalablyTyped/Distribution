package typings.naverWhale.whale.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleDetails extends js.Object {
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double = js.native
  /** The tooltip string. */
  var title: String = js.native
}

object TitleDetails {
  @scala.inline
  def apply(tabId: Double, title: String): TitleDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleDetails]
  }
  @scala.inline
  implicit class TitleDetailsOps[Self <: TitleDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTabId(value: Double): Self = this.set("tabId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

