package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.MapboxCenter> */
trait PartialMapboxCenter extends js.Object {
  var lat: js.UndefOr[Double] = js.undefined
  var lon: js.UndefOr[Double] = js.undefined
}

object PartialMapboxCenter {
  @scala.inline
  def apply(lat: js.UndefOr[Double] = js.undefined, lon: js.UndefOr[Double] = js.undefined): PartialMapboxCenter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lon)) __obj.updateDynamic("lon")(lon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMapboxCenter]
  }
}

