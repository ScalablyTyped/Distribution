package typings
package podcastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFeedOptions extends js.Object {
  var author: java.lang.String
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var docs: js.UndefOr[java.lang.String] = js.undefined
  var feed_url: java.lang.String
  var generator: js.UndefOr[java.lang.String] = js.undefined
  var image_url: js.UndefOr[java.lang.String] = js.undefined
  var itunesAuthor: js.UndefOr[java.lang.String] = js.undefined
  var itunesCategory: js.UndefOr[IItunesCategory] = js.undefined
  var itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined
  var itunesImage: js.UndefOr[java.lang.String] = js.undefined
  var itunesOwner: js.UndefOr[IItunesOwner] = js.undefined
  var itunesSubtitle: js.UndefOr[java.lang.String] = js.undefined
  var itunesSummary: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var managingEditor: js.UndefOr[java.lang.String] = js.undefined
  var pubDate: js.UndefOr[stdLib.Date] = js.undefined
  var site_url: java.lang.String
  var title: java.lang.String
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var webMaster: js.UndefOr[java.lang.String] = js.undefined
}

object IFeedOptions {
  @scala.inline
  def apply(
    author: java.lang.String,
    feed_url: java.lang.String,
    site_url: java.lang.String,
    title: java.lang.String,
    categories: js.Array[java.lang.String] = null,
    copyright: java.lang.String = null,
    description: java.lang.String = null,
    docs: java.lang.String = null,
    generator: java.lang.String = null,
    image_url: java.lang.String = null,
    itunesAuthor: java.lang.String = null,
    itunesCategory: IItunesCategory = null,
    itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined,
    itunesImage: java.lang.String = null,
    itunesOwner: IItunesOwner = null,
    itunesSubtitle: java.lang.String = null,
    itunesSummary: java.lang.String = null,
    language: java.lang.String = null,
    managingEditor: java.lang.String = null,
    pubDate: stdLib.Date = null,
    ttl: scala.Int | scala.Double = null,
    webMaster: java.lang.String = null
  ): IFeedOptions = {
    val __obj = js.Dynamic.literal(author = author, feed_url = feed_url, site_url = site_url, title = title)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (description != null) __obj.updateDynamic("description")(description)
    if (docs != null) __obj.updateDynamic("docs")(docs)
    if (generator != null) __obj.updateDynamic("generator")(generator)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    if (itunesAuthor != null) __obj.updateDynamic("itunesAuthor")(itunesAuthor)
    if (itunesCategory != null) __obj.updateDynamic("itunesCategory")(itunesCategory)
    if (!js.isUndefined(itunesExplicit)) __obj.updateDynamic("itunesExplicit")(itunesExplicit)
    if (itunesImage != null) __obj.updateDynamic("itunesImage")(itunesImage)
    if (itunesOwner != null) __obj.updateDynamic("itunesOwner")(itunesOwner)
    if (itunesSubtitle != null) __obj.updateDynamic("itunesSubtitle")(itunesSubtitle)
    if (itunesSummary != null) __obj.updateDynamic("itunesSummary")(itunesSummary)
    if (language != null) __obj.updateDynamic("language")(language)
    if (managingEditor != null) __obj.updateDynamic("managingEditor")(managingEditor)
    if (pubDate != null) __obj.updateDynamic("pubDate")(pubDate)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (webMaster != null) __obj.updateDynamic("webMaster")(webMaster)
    __obj.asInstanceOf[IFeedOptions]
  }
}

