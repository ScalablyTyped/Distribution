package typings.podcast.mod

import typings.podcast.podcastStrings.episodic
import typings.podcast.podcastStrings.serial
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFeedOptions extends js.Object {
  var author: String
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var customElements: js.UndefOr[js.Array[js.Object]] = js.undefined
  var customNamespaces: js.UndefOr[js.Object] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var docs: js.UndefOr[String] = js.undefined
  var generator: js.UndefOr[String] = js.undefined
  var itunesAuthor: js.UndefOr[String] = js.undefined
  var itunesCategory: js.UndefOr[js.Array[FeedItunesCategory]] = js.undefined
  var itunesExplicit: js.UndefOr[Boolean] = js.undefined
  var itunesImage: js.UndefOr[String] = js.undefined
  var itunesOwner: js.UndefOr[FeedItunesOwner] = js.undefined
  var itunesSubtitle: js.UndefOr[String] = js.undefined
  var itunesSummary: js.UndefOr[String] = js.undefined
  var itunesType: js.UndefOr[episodic | serial] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var managingEditor: js.UndefOr[String] = js.undefined
  var pubDate: js.UndefOr[Date | String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var webMaster: js.UndefOr[String] = js.undefined
}

object BaseFeedOptions {
  @scala.inline
  def apply(
    author: String,
    categories: js.Array[String] = null,
    copyright: String = null,
    customElements: js.Array[js.Object] = null,
    customNamespaces: js.Object = null,
    description: String = null,
    docs: String = null,
    generator: String = null,
    itunesAuthor: String = null,
    itunesCategory: js.Array[FeedItunesCategory] = null,
    itunesExplicit: js.UndefOr[Boolean] = js.undefined,
    itunesImage: String = null,
    itunesOwner: FeedItunesOwner = null,
    itunesSubtitle: String = null,
    itunesSummary: String = null,
    itunesType: episodic | serial = null,
    language: String = null,
    managingEditor: String = null,
    pubDate: Date | String = null,
    title: String = null,
    ttl: Int | Double = null,
    webMaster: String = null
  ): BaseFeedOptions = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (customElements != null) __obj.updateDynamic("customElements")(customElements.asInstanceOf[js.Any])
    if (customNamespaces != null) __obj.updateDynamic("customNamespaces")(customNamespaces.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (docs != null) __obj.updateDynamic("docs")(docs.asInstanceOf[js.Any])
    if (generator != null) __obj.updateDynamic("generator")(generator.asInstanceOf[js.Any])
    if (itunesAuthor != null) __obj.updateDynamic("itunesAuthor")(itunesAuthor.asInstanceOf[js.Any])
    if (itunesCategory != null) __obj.updateDynamic("itunesCategory")(itunesCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesExplicit)) __obj.updateDynamic("itunesExplicit")(itunesExplicit.asInstanceOf[js.Any])
    if (itunesImage != null) __obj.updateDynamic("itunesImage")(itunesImage.asInstanceOf[js.Any])
    if (itunesOwner != null) __obj.updateDynamic("itunesOwner")(itunesOwner.asInstanceOf[js.Any])
    if (itunesSubtitle != null) __obj.updateDynamic("itunesSubtitle")(itunesSubtitle.asInstanceOf[js.Any])
    if (itunesSummary != null) __obj.updateDynamic("itunesSummary")(itunesSummary.asInstanceOf[js.Any])
    if (itunesType != null) __obj.updateDynamic("itunesType")(itunesType.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (managingEditor != null) __obj.updateDynamic("managingEditor")(managingEditor.asInstanceOf[js.Any])
    if (pubDate != null) __obj.updateDynamic("pubDate")(pubDate.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (webMaster != null) __obj.updateDynamic("webMaster")(webMaster.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFeedOptions]
  }
}

