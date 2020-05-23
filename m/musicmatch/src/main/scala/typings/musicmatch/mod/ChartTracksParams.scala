package typings.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTracksParams extends Pageable {
  var country: js.UndefOr[String] = js.undefined
  var f_has_lyrics: js.UndefOr[TBoolean] = js.undefined
}

object ChartTracksParams {
  @scala.inline
  def apply(
    country: String = null,
    f_has_lyrics: TBoolean = null,
    page: js.UndefOr[Double] = js.undefined,
    page_size: js.UndefOr[Double] = js.undefined
  ): ChartTracksParams = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (f_has_lyrics != null) __obj.updateDynamic("f_has_lyrics")(f_has_lyrics.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page_size)) __obj.updateDynamic("page_size")(page_size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTracksParams]
  }
}

