package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Page object, for use in "page.set({ ... })". */
@js.native
trait PageUpdateData extends js.Object {
  /**
    *
    * Returns the view of the page.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[PageViewUpdateData] = js.native
}

object PageUpdateData {
  @scala.inline
  def apply(): PageUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageUpdateData]
  }
  @scala.inline
  implicit class PageUpdateDataOps[Self <: PageUpdateData] (val x: Self) extends AnyVal {
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
    def setView(value: PageViewUpdateData): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

