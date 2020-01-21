package typings.openGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVideoMetadata extends Metadata {
  /** A description of what is in the image (not a caption). If the page specifies an `og:image` it should specify `og:image:alt`. */
  var alt: js.UndefOr[String | js.Array[String]] = js.undefined
  /** The number of pixels high. */
  var height: js.UndefOr[String | js.Array[String]] = js.undefined
  /** The  */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  /** The number of pixels wide. */
  var width: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ImageVideoMetadata {
  @scala.inline
  def apply(
    alt: String | js.Array[String] = null,
    height: String | js.Array[String] = null,
    secure_url: String | js.Array[String] = null,
    `type`: String | js.Array[String] = null,
    url: String | js.Array[String] = null,
    width: String | js.Array[String] = null
  ): ImageVideoMetadata = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (secure_url != null) __obj.updateDynamic("secure_url")(secure_url.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVideoMetadata]
  }
}

