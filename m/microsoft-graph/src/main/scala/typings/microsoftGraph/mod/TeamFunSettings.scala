package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFunSettings extends js.Object {
  // If set to true, enables users to include custom memes.
  var allowCustomMemes: js.UndefOr[Boolean] = js.undefined
  // If set to true, enables Giphy use.
  var allowGiphy: js.UndefOr[Boolean] = js.undefined
  // If set to true, enables users to include stickers and memes.
  var allowStickersAndMemes: js.UndefOr[Boolean] = js.undefined
  // Giphy content rating. Possible values are: moderate, strict.
  var giphyContentRating: js.UndefOr[GiphyRatingType] = js.undefined
}

object TeamFunSettings {
  @scala.inline
  def apply(
    allowCustomMemes: js.UndefOr[Boolean] = js.undefined,
    allowGiphy: js.UndefOr[Boolean] = js.undefined,
    allowStickersAndMemes: js.UndefOr[Boolean] = js.undefined,
    giphyContentRating: GiphyRatingType = null
  ): TeamFunSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCustomMemes)) __obj.updateDynamic("allowCustomMemes")(allowCustomMemes.asInstanceOf[js.Any])
    if (!js.isUndefined(allowGiphy)) __obj.updateDynamic("allowGiphy")(allowGiphy.asInstanceOf[js.Any])
    if (!js.isUndefined(allowStickersAndMemes)) __obj.updateDynamic("allowStickersAndMemes")(allowStickersAndMemes.asInstanceOf[js.Any])
    if (giphyContentRating != null) __obj.updateDynamic("giphyContentRating")(giphyContentRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFunSettings]
  }
}

