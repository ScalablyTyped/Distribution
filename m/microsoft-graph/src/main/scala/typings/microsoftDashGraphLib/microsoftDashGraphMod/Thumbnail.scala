package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  /** The content stream for the thumbnail. */
  var content: js.UndefOr[js.Any] = js.undefined
  /** The height of the thumbnail, in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested. */
  var sourceItemId: js.UndefOr[java.lang.String] = js.undefined
  /** The URL used to fetch the thumbnail content. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the thumbnail, in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    content: js.Any = null,
    height: scala.Int | scala.Double = null,
    sourceItemId: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sourceItemId != null) __obj.updateDynamic("sourceItemId")(sourceItemId)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

