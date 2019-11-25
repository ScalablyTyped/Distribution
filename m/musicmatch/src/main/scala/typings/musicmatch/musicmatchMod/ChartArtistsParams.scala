package typings.musicmatch.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArtistsParams extends Pageable {
  var country: js.UndefOr[String] = js.undefined
}

object ChartArtistsParams {
  @scala.inline
  def apply(country: String = null, page: Int | Double = null, page_size: Int | Double = null): ChartArtistsParams = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArtistsParams]
  }
}

