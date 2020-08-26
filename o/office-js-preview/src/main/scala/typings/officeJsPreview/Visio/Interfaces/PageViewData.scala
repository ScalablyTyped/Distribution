package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageView.toJSON()". */
@js.native
trait PageViewData extends js.Object {
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Double] = js.native
}

object PageViewData {
  @scala.inline
  def apply(): PageViewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageViewData]
  }
  @scala.inline
  implicit class PageViewDataOps[Self <: PageViewData] (val x: Self) extends AnyVal {
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
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

