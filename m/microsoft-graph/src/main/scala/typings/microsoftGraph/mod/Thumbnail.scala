package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  // The content stream for the thumbnail.
  var content: js.UndefOr[js.Any] = js.undefined
  // The height of the thumbnail, in pixels.
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is
    * requested.
    */
  var sourceItemId: js.UndefOr[String] = js.undefined
  // The URL used to fetch the thumbnail content.
  var url: js.UndefOr[String] = js.undefined
  // The width of the thumbnail, in pixels.
  var width: js.UndefOr[Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    content: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    sourceItemId: String = null,
    url: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (sourceItemId != null) __obj.updateDynamic("sourceItemId")(sourceItemId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

