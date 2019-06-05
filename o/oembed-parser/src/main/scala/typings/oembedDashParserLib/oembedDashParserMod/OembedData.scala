package typings
package oembedDashParserLib.oembedDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OembedData extends js.Object {
  /** The name of the author/owner of the resource. */
  var author_name: js.UndefOr[java.lang.String] = js.undefined
  /** A URL for the author/owner of the resource. */
  var author_url: js.UndefOr[java.lang.String] = js.undefined
  /** The suggested cache lifetime for this resource, in seconds. Consumers may choose to use this value or not. */
  var cache_age: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the resource provider. */
  var provider_name: js.UndefOr[java.lang.String] = js.undefined
  /** The url of the resource provider. */
  var provider_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The height of the optional thumbnail.
    * If this parameter is present, thumbnail_url and thumbnail_width must also be present.
    */
  var thumbnail_height: js.UndefOr[scala.Double] = js.undefined
  /**
    * A URL to a thumbnail image representing the resource.
    * The thumbnail must respect any maxwidth and maxheight parameters.
    * If this parameter is present, thumbnail_width and thumbnail_height must also be present.
    */
  var thumbnail_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the optional thumbnail.
    * If this parameter is present, thumbnail_url and thumbnail_height must also be present.
    */
  var thumbnail_width: js.UndefOr[scala.Double] = js.undefined
  /** A text title, describing the resource. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: oembedDashParserLib.oembedDashParserLibStrings.rich | oembedDashParserLib.oembedDashParserLibStrings.video | oembedDashParserLib.oembedDashParserLibStrings.photo | oembedDashParserLib.oembedDashParserLibStrings.link
  var version: java.lang.String
}

object OembedData {
  @scala.inline
  def apply(
    `type`: oembedDashParserLib.oembedDashParserLibStrings.rich | oembedDashParserLib.oembedDashParserLibStrings.video | oembedDashParserLib.oembedDashParserLibStrings.photo | oembedDashParserLib.oembedDashParserLibStrings.link,
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
  ): OembedData = {
    val __obj = js.Dynamic.literal(version = version)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (author_name != null) __obj.updateDynamic("author_name")(author_name)
    if (author_url != null) __obj.updateDynamic("author_url")(author_url)
    if (cache_age != null) __obj.updateDynamic("cache_age")(cache_age)
    if (provider_name != null) __obj.updateDynamic("provider_name")(provider_name)
    if (provider_url != null) __obj.updateDynamic("provider_url")(provider_url)
    if (thumbnail_height != null) __obj.updateDynamic("thumbnail_height")(thumbnail_height.asInstanceOf[js.Any])
    if (thumbnail_url != null) __obj.updateDynamic("thumbnail_url")(thumbnail_url)
    if (thumbnail_width != null) __obj.updateDynamic("thumbnail_width")(thumbnail_width.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[OembedData]
  }
}

