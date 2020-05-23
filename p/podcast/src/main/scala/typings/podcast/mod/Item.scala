package typings.podcast.mod

import typings.podcast.podcastStrings.bonus
import typings.podcast.podcastStrings.full
import typings.podcast.podcastStrings.trailer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var customElements: js.UndefOr[js.Array[js.Object]] = js.undefined
  var date: Date | String
  var description: js.UndefOr[String] = js.undefined
  var enclosure: js.UndefOr[ItemEnclosure] = js.undefined
  var guid: js.UndefOr[String] = js.undefined
  var itunesAuthor: js.UndefOr[String] = js.undefined
  var itunesDuration: js.UndefOr[Double] = js.undefined
  var itunesEpisode: js.UndefOr[Double] = js.undefined
  var itunesEpisodeType: js.UndefOr[full | trailer | bonus] = js.undefined
  var itunesExplicit: js.UndefOr[Boolean] = js.undefined
  var itunesImage: js.UndefOr[String] = js.undefined
  var itunesSeason: js.UndefOr[Double] = js.undefined
  var itunesSubtitle: js.UndefOr[String] = js.undefined
  var itunesSummary: js.UndefOr[String] = js.undefined
  var itunesTitle: js.UndefOr[String] = js.undefined
  var lat: js.UndefOr[Double] = js.undefined
  var long: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: String
}

object Item {
  @scala.inline
  def apply(
    date: Date | String,
    url: String,
    author: String = null,
    categories: js.Array[String] = null,
    content: String = null,
    customElements: js.Array[js.Object] = null,
    description: String = null,
    enclosure: ItemEnclosure = null,
    guid: String = null,
    itunesAuthor: String = null,
    itunesDuration: js.UndefOr[Double] = js.undefined,
    itunesEpisode: js.UndefOr[Double] = js.undefined,
    itunesEpisodeType: full | trailer | bonus = null,
    itunesExplicit: js.UndefOr[Boolean] = js.undefined,
    itunesImage: String = null,
    itunesSeason: js.UndefOr[Double] = js.undefined,
    itunesSubtitle: String = null,
    itunesSummary: String = null,
    itunesTitle: String = null,
    lat: js.UndefOr[Double] = js.undefined,
    long: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): Item = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (customElements != null) __obj.updateDynamic("customElements")(customElements.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enclosure != null) __obj.updateDynamic("enclosure")(enclosure.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (itunesAuthor != null) __obj.updateDynamic("itunesAuthor")(itunesAuthor.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesDuration)) __obj.updateDynamic("itunesDuration")(itunesDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesEpisode)) __obj.updateDynamic("itunesEpisode")(itunesEpisode.get.asInstanceOf[js.Any])
    if (itunesEpisodeType != null) __obj.updateDynamic("itunesEpisodeType")(itunesEpisodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesExplicit)) __obj.updateDynamic("itunesExplicit")(itunesExplicit.get.asInstanceOf[js.Any])
    if (itunesImage != null) __obj.updateDynamic("itunesImage")(itunesImage.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesSeason)) __obj.updateDynamic("itunesSeason")(itunesSeason.get.asInstanceOf[js.Any])
    if (itunesSubtitle != null) __obj.updateDynamic("itunesSubtitle")(itunesSubtitle.asInstanceOf[js.Any])
    if (itunesSummary != null) __obj.updateDynamic("itunesSummary")(itunesSummary.asInstanceOf[js.Any])
    if (itunesTitle != null) __obj.updateDynamic("itunesTitle")(itunesTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(lat)) __obj.updateDynamic("lat")(lat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(long)) __obj.updateDynamic("long")(long.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

