package typings.oembedParser.mod

import typings.oembedParser.oembedParserStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTypeData extends OembedData {
  @JSName("type")
  val type_LinkTypeData: link
}

object LinkTypeData {
  @scala.inline
  def apply(
    `type`: link,
    version: String,
    author_name: String = null,
    author_url: String = null,
    cache_age: String = null,
    provider_name: String = null,
    provider_url: String = null,
    thumbnail_height: js.UndefOr[Double] = js.undefined,
    thumbnail_url: String = null,
    thumbnail_width: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): LinkTypeData = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[LinkTypeData]
  }
}

