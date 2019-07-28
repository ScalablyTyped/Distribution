package typings.oembedDashParser.oembedDashParserMod

import typings.oembedDashParser.oembedDashParserStrings.photo
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
    thumbnail_height: Int | Double = null,
    thumbnail_url: String = null,
    thumbnail_width: Int | Double = null,
    title: String = null
  ): PhotoTypeData = {
    val __obj = js.Dynamic.literal(height = height, url = url, version = version, width = width)
    __obj.updateDynamic("type")(`type`)
    if (author_name != null) __obj.updateDynamic("author_name")(author_name)
    if (author_url != null) __obj.updateDynamic("author_url")(author_url)
    if (cache_age != null) __obj.updateDynamic("cache_age")(cache_age)
    if (provider_name != null) __obj.updateDynamic("provider_name")(provider_name)
    if (provider_url != null) __obj.updateDynamic("provider_url")(provider_url)
    if (thumbnail_height != null) __obj.updateDynamic("thumbnail_height")(thumbnail_height.asInstanceOf[js.Any])
    if (thumbnail_url != null) __obj.updateDynamic("thumbnail_url")(thumbnail_url)
    if (thumbnail_width != null) __obj.updateDynamic("thumbnail_width")(thumbnail_width.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PhotoTypeData]
  }
}

