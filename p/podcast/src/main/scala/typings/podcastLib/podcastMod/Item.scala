package typings
package podcastLib.podcastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var customElements: js.UndefOr[js.Array[js.Object]] = js.undefined
  var date: stdLib.Date | java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enclosure: js.UndefOr[ItemEnclosure] = js.undefined
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var itunesAuthor: js.UndefOr[java.lang.String] = js.undefined
  var itunesDuration: js.UndefOr[scala.Double] = js.undefined
  var itunesEpisode: js.UndefOr[scala.Double] = js.undefined
  var itunesEpisodeType: js.UndefOr[
    podcastLib.podcastLibStrings.full | podcastLib.podcastLibStrings.trailer | podcastLib.podcastLibStrings.bonus
  ] = js.undefined
  var itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined
  var itunesImage: js.UndefOr[java.lang.String] = js.undefined
  var itunesSeason: js.UndefOr[scala.Double] = js.undefined
  var itunesSubtitle: js.UndefOr[java.lang.String] = js.undefined
  var itunesSummary: js.UndefOr[java.lang.String] = js.undefined
  var itunesTitle: js.UndefOr[java.lang.String] = js.undefined
  var lat: js.UndefOr[scala.Double] = js.undefined
  var long: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Item {
  @scala.inline
  def apply(
    date: stdLib.Date | java.lang.String,
    url: java.lang.String,
    author: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    content: java.lang.String = null,
    customElements: js.Array[js.Object] = null,
    description: java.lang.String = null,
    enclosure: ItemEnclosure = null,
    guid: java.lang.String = null,
    itunesAuthor: java.lang.String = null,
    itunesDuration: scala.Int | scala.Double = null,
    itunesEpisode: scala.Int | scala.Double = null,
    itunesEpisodeType: podcastLib.podcastLibStrings.full | podcastLib.podcastLibStrings.trailer | podcastLib.podcastLibStrings.bonus = null,
    itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined,
    itunesImage: java.lang.String = null,
    itunesSeason: scala.Int | scala.Double = null,
    itunesSubtitle: java.lang.String = null,
    itunesSummary: java.lang.String = null,
    itunesTitle: java.lang.String = null,
    lat: scala.Int | scala.Double = null,
    long: scala.Int | scala.Double = null,
    title: java.lang.String = null
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

