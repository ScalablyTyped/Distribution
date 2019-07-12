package typings
package podcastLib.podcastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFeedOptions extends js.Object {
  var author: java.lang.String
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  var customElements: js.UndefOr[js.Array[js.Object]] = js.undefined
  var customNamespaces: js.UndefOr[js.Object] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var docs: js.UndefOr[java.lang.String] = js.undefined
  var generator: js.UndefOr[java.lang.String] = js.undefined
  var itunesAuthor: js.UndefOr[java.lang.String] = js.undefined
  var itunesCategory: js.UndefOr[js.Array[FeedItunesCategory]] = js.undefined
  var itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined
  var itunesImage: js.UndefOr[java.lang.String] = js.undefined
  var itunesOwner: js.UndefOr[FeedItunesOwner] = js.undefined
  var itunesSubtitle: js.UndefOr[java.lang.String] = js.undefined
  var itunesSummary: js.UndefOr[java.lang.String] = js.undefined
  var itunesType: js.UndefOr[podcastLib.podcastLibStrings.episodic | podcastLib.podcastLibStrings.serial] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var managingEditor: js.UndefOr[java.lang.String] = js.undefined
  var pubDate: js.UndefOr[stdLib.Date | java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var webMaster: js.UndefOr[java.lang.String] = js.undefined
}

object BaseFeedOptions {
  @scala.inline
  def apply(
    author: java.lang.String,
    categories: js.Array[java.lang.String] = null,
    copyright: java.lang.String = null,
    customElements: js.Array[js.Object] = null,
    customNamespaces: js.Object = null,
    description: java.lang.String = null,
    docs: java.lang.String = null,
    generator: java.lang.String = null,
    itunesAuthor: java.lang.String = null,
    itunesCategory: js.Array[FeedItunesCategory] = null,
    itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined,
    itunesImage: java.lang.String = null,
    itunesOwner: FeedItunesOwner = null,
    itunesSubtitle: java.lang.String = null,
    itunesSummary: java.lang.String = null,
    itunesType: podcastLib.podcastLibStrings.episodic | podcastLib.podcastLibStrings.serial = null,
    language: java.lang.String = null,
    managingEditor: java.lang.String = null,
    pubDate: stdLib.Date | java.lang.String = null,
    title: java.lang.String = null,
    ttl: scala.Int | scala.Double = null,
    webMaster: java.lang.String = null
  ): BaseFeedOptions = {
    val __obj = js.Dynamic.literal(author = author)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (customElements != null) __obj.updateDynamic("customElements")(customElements)
    if (customNamespaces != null) __obj.updateDynamic("customNamespaces")(customNamespaces)
    if (description != null) __obj.updateDynamic("description")(description)
    if (docs != null) __obj.updateDynamic("docs")(docs)
    if (generator != null) __obj.updateDynamic("generator")(generator)
    if (itunesAuthor != null) __obj.updateDynamic("itunesAuthor")(itunesAuthor)
    if (itunesCategory != null) __obj.updateDynamic("itunesCategory")(itunesCategory)
    if (!js.isUndefined(itunesExplicit)) __obj.updateDynamic("itunesExplicit")(itunesExplicit)
    if (itunesImage != null) __obj.updateDynamic("itunesImage")(itunesImage)
    if (itunesOwner != null) __obj.updateDynamic("itunesOwner")(itunesOwner)
    if (itunesSubtitle != null) __obj.updateDynamic("itunesSubtitle")(itunesSubtitle)
    if (itunesSummary != null) __obj.updateDynamic("itunesSummary")(itunesSummary)
    if (itunesType != null) __obj.updateDynamic("itunesType")(itunesType.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (managingEditor != null) __obj.updateDynamic("managingEditor")(managingEditor)
    if (pubDate != null) __obj.updateDynamic("pubDate")(pubDate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (webMaster != null) __obj.updateDynamic("webMaster")(webMaster)
    __obj.asInstanceOf[BaseFeedOptions]
  }
}

