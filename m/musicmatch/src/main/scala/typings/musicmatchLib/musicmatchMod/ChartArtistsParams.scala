package typings
package musicmatchLib.musicmatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArtistsParams extends Pageable {
  var country: js.UndefOr[java.lang.String] = js.undefined
}

object ChartArtistsParams {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    page_size: scala.Int | scala.Double = null
  ): ChartArtistsParams = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArtistsParams]
  }
}

