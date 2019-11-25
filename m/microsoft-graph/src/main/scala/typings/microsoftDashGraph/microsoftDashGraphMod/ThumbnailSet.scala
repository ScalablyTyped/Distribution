package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailSet extends Entity {
  // A 1920x1920 scaled thumbnail.
  var large: js.UndefOr[Thumbnail] = js.undefined
  // A 176x176 scaled thumbnail.
  var medium: js.UndefOr[Thumbnail] = js.undefined
  // A 48x48 cropped thumbnail.
  var small: js.UndefOr[Thumbnail] = js.undefined
  // A custom thumbnail image or the original image used to generate other thumbnails.
  var source: js.UndefOr[Thumbnail] = js.undefined
}

object ThumbnailSet {
  @scala.inline
  def apply(
    id: String = null,
    large: Thumbnail = null,
    medium: Thumbnail = null,
    small: Thumbnail = null,
    source: Thumbnail = null
  ): ThumbnailSet = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailSet]
  }
}

