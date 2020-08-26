package typings.officeJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the page that raised the PageRenderComplete event.
  *
  * [Api set:  1.1]
  */
@js.native
trait PageRenderCompleteEventArgs extends js.Object {
  /**
    *
    * Gets the name of the page that raised the PageLoad event.
    *
    * [Api set:  1.1]
    */
  var pageName: String = js.native
  /**
    *
    * Gets the success/failure of the PageRender event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean = js.native
}

object PageRenderCompleteEventArgs {
  @scala.inline
  def apply(pageName: String, success: Boolean): PageRenderCompleteEventArgs = {
    val __obj = js.Dynamic.literal(pageName = pageName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageRenderCompleteEventArgs]
  }
  @scala.inline
  implicit class PageRenderCompleteEventArgsOps[Self <: PageRenderCompleteEventArgs] (val x: Self) extends AnyVal {
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
    def setPageName(value: String): Self = this.set("pageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

