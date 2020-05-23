package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageView.toJSON()". */
trait PageViewData extends js.Object {
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object PageViewData {
  @scala.inline
  def apply(zoom: js.UndefOr[Double] = js.undefined): PageViewData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewData]
  }
}

