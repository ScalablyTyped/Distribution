package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArtistsParams extends Pageable {
  var country: js.UndefOr[String] = js.undefined
}

object ChartArtistsParams {
  @scala.inline
  def apply(
    country: String = null,
    page: js.UndefOr[Double] = js.undefined,
    page_size: js.UndefOr[Double] = js.undefined
  ): ChartArtistsParams = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArtistsParams]
  }
}

