package typings
package oembedDashParserLib.oembedDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkTypeData extends OembedData {
  @JSName("type")
  val type_LinkTypeData: oembedDashParserLib.oembedDashParserLibStrings.link
}

object LinkTypeData {
  @scala.inline
  def apply(
    `type`: oembedDashParserLib.oembedDashParserLibStrings.link,
    version: java.lang.String,
    author_name: java.lang.String = null,
    author_url: java.lang.String = null,
    cache_age: java.lang.String = null,
    provider_name: java.lang.String = null,
    provider_url: java.lang.String = null,
    thumbnail_height: scala.Int | scala.Double = null,
    thumbnail_url: java.lang.String = null,
    thumbnail_width: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): LinkTypeData = {
    val __obj = js.Dynamic.literal(version = version)
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
    __obj.asInstanceOf[LinkTypeData]
  }
}

