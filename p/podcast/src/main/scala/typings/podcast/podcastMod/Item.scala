package typings.podcast.podcastMod

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
    itunesDuration: Int | Double = null,
    itunesEpisode: Int | Double = null,
    itunesEpisodeType: full | trailer | bonus = null,
    itunesExplicit: js.UndefOr[Boolean] = js.undefined,
    itunesImage: String = null,
    itunesSeason: Int | Double = null,
    itunesSubtitle: String = null,
    itunesSummary: String = null,
    itunesTitle: String = null,
    lat: Int | Double = null,
    long: Int | Double = null,
    title: String = null
  ): Item = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], url = url)
    if (author != null) __obj.updateDynamic("author")(author)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (content != null) __obj.updateDynamic("content")(content)
    if (customElements != null) __obj.updateDynamic("customElements")(customElements)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enclosure != null) __obj.updateDynamic("enclosure")(enclosure)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (itunesAuthor != null) __obj.updateDynamic("itunesAuthor")(itunesAuthor)
    if (itunesDuration != null) __obj.updateDynamic("itunesDuration")(itunesDuration.asInstanceOf[js.Any])
    if (itunesEpisode != null) __obj.updateDynamic("itunesEpisode")(itunesEpisode.asInstanceOf[js.Any])
    if (itunesEpisodeType != null) __obj.updateDynamic("itunesEpisodeType")(itunesEpisodeType.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesExplicit)) __obj.updateDynamic("itunesExplicit")(itunesExplicit)
    if (itunesImage != null) __obj.updateDynamic("itunesImage")(itunesImage)
    if (itunesSeason != null) __obj.updateDynamic("itunesSeason")(itunesSeason.asInstanceOf[js.Any])
    if (itunesSubtitle != null) __obj.updateDynamic("itunesSubtitle")(itunesSubtitle)
    if (itunesSummary != null) __obj.updateDynamic("itunesSummary")(itunesSummary)
    if (itunesTitle != null) __obj.updateDynamic("itunesTitle")(itunesTitle)
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (long != null) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Item]
  }
}

