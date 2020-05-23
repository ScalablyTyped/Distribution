package typings.oembedParser.mod

import typings.oembedParser.oembedParserStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoTypeData extends OembedData {
  /** The height in pixels of the image specified in the url parameter. */
  var height: Double
  @JSName("type")
  val type_PhotoTypeData: photo
  /**
    * The source URL of the image. Consumers should be able to insert this URL into an <img> element.
    * Only HTTP and HTTPS URLs are valid.
    */
  var url: String
  /** The width in pixels of the image specified in the url parameter. */
  var width: Double
}

object PhotoTypeData {
  @scala.inline
  def apply(
    height: Double,
    `type`: photo,
    url: String,
    version: String,
    width: Double,
    author_name: String = null,
    author_url: String = null,
    cache_age: String = null,
    provider_name: String = null,
    provider_url: String = null,
    thumbnail_height: js.UndefOr[Double] = js.undefined,
    thumbnail_url: String = null,
    thumbnail_width: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): PhotoTypeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (author_name != null) __obj.updateDynamic("author_name")(author_name.asInstanceOf[js.Any])
    if (author_url != null) __obj.updateDynamic("author_url")(author_url.asInstanceOf[js.Any])
    if (cache_age != null) __obj.updateDynamic("cache_age")(cache_age.asInstanceOf[js.Any])
    if (provider_name != null) __obj.updateDynamic("provider_name")(provider_name.asInstanceOf[js.Any])
    if (provider_url != null) __obj.updateDynamic("provider_url")(provider_url.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnail_height)) __obj.updateDynamic("thumbnail_height")(thumbnail_height.get.asInstanceOf[js.Any])
    if (thumbnail_url != null) __obj.updateDynamic("thumbnail_url")(thumbnail_url.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnail_width)) __obj.updateDynamic("thumbnail_width")(thumbnail_width.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoTypeData]
  }
}

