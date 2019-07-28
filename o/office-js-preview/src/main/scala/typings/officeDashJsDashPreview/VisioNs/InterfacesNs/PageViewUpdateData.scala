package typings.officeDashJsDashPreview.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageView object, for use in "pageView.set({ ... })". */
trait PageViewUpdateData extends js.Object {
  /**
    *
    * Get and set Page's Zoom level. The value can be between 10 and 400 and denotes the percentage of zoom.
    *
    * [Api set:  1.1]
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object PageViewUpdateData {
  @scala.inline
  def apply(zoom: Int | Double = null): PageViewUpdateData = {
    val __obj = js.Dynamic.literal()
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewUpdateData]
  }
}

