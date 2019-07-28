package typings.oembedDashParser.oembedDashParserMod

import typings.oembedDashParser.oembedDashParserStrings.rich
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichTypeData extends OembedData {
  /** The height in pixels required to display the HTML. */
  var height: Double
  /**
    * The HTML required to display the resource.
    * The HTML should have no padding or margins.
    * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
    * The markup should be valid XHTML 1.0 Basic.
    */
  var html: String
  @JSName("type")
  val type_RichTypeData: rich
  /** The width in pixels required to display the HTML. */
  var width: Double
}

object RichTypeData {
  @scala.inline
  def apply(
    height: Double,
    html: String,
    `type`: rich,
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
  ): RichTypeData = {
    val __obj = js.Dynamic.literal(height = height, html = html, version = version, width = width)
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
    __obj.asInstanceOf[RichTypeData]
  }
}

