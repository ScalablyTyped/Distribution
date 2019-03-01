package typings
package officeDashJsLib.VisioNs.InterfacesNs

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
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object PageViewData {
  @scala.inline
  def apply(zoom: scala.Int | scala.Double = null): PageViewData = {
    val __obj = js.Dynamic.literal()
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageViewData]
  }
}

