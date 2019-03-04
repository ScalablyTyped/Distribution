package typings
package podcastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemOptions extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var date: stdLib.Date
  var description: java.lang.String
  var enclosure: js.UndefOr[Anon_File] = js.undefined
  var guid: java.lang.String
  var itunesAuthor: js.UndefOr[java.lang.String] = js.undefined
  var itunesDuration: js.UndefOr[scala.Double] = js.undefined
  var itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined
  var itunesKeywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var itunesSubtitle: js.UndefOr[java.lang.String] = js.undefined
  var itunesSummary: js.UndefOr[java.lang.String] = js.undefined
  var lat: js.UndefOr[scala.Double] = js.undefined
  var long: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var url: java.lang.String
}

object IItemOptions {
  @scala.inline
  def apply(
    date: stdLib.Date,
    description: java.lang.String,
    guid: java.lang.String,
    title: java.lang.String,
    url: java.lang.String,
    author: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    enclosure: Anon_File = null,
    itunesAuthor: java.lang.String = null,
    itunesDuration: scala.Int | scala.Double = null,
    itunesExplicit: js.UndefOr[scala.Boolean] = js.undefined,
    itunesKeywords: js.Array[java.lang.String] = null,
    itunesSubtitle: java.lang.String = null,
    itunesSummary: java.lang.String = null,
    lat: scala.Int | scala.Double = null,
    long: scala.Int | scala.Double = null
  ): IItemOptions = {
    val __obj = js.Dynamic.literal(date = date, description = description, guid = guid, title = title, url = url)
    if (author != null) __obj.updateDynamic("author")(author)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (enclosure != null) __obj.updateDynamic("enclosure")(enclosure)
    if (itunesAuthor != null) __obj.updateDynamic("itunesAuthor")(itunesAuthor)
    if (itunesDuration != null) __obj.updateDynamic("itunesDuration")(itunesDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(itunesExplicit)) __obj.updateDynamic("itunesExplicit")(itunesExplicit)
    if (itunesKeywords != null) __obj.updateDynamic("itunesKeywords")(itunesKeywords)
    if (itunesSubtitle != null) __obj.updateDynamic("itunesSubtitle")(itunesSubtitle)
    if (itunesSummary != null) __obj.updateDynamic("itunesSummary")(itunesSummary)
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (long != null) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
}

