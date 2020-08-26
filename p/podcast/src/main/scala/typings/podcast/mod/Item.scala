package typings.podcast.mod

import typings.podcast.podcastStrings.bonus
import typings.podcast.podcastStrings.full
import typings.podcast.podcastStrings.trailer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  var author: js.UndefOr[String] = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var content: js.UndefOr[String] = js.native
  var customElements: js.UndefOr[js.Array[js.Object]] = js.native
  var date: Date | String = js.native
  var description: js.UndefOr[String] = js.native
  var enclosure: js.UndefOr[ItemEnclosure] = js.native
  var guid: js.UndefOr[String] = js.native
  var itunesAuthor: js.UndefOr[String] = js.native
  var itunesDuration: js.UndefOr[Double] = js.native
  var itunesEpisode: js.UndefOr[Double] = js.native
  var itunesEpisodeType: js.UndefOr[full | trailer | bonus] = js.native
  var itunesExplicit: js.UndefOr[Boolean] = js.native
  var itunesImage: js.UndefOr[String] = js.native
  var itunesSeason: js.UndefOr[Double] = js.native
  var itunesSubtitle: js.UndefOr[String] = js.native
  var itunesSummary: js.UndefOr[String] = js.native
  var itunesTitle: js.UndefOr[String] = js.native
  var lat: js.UndefOr[Double] = js.native
  var long: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var url: String = js.native
}

object Item {
  @scala.inline
  def apply(date: Date | String, url: String): Item = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCustomElementsVarargs(value: js.Object*): Self = this.set("customElements", js.Array(value :_*))
    @scala.inline
    def setCustomElements(value: js.Array[js.Object]): Self = this.set("customElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomElements: Self = this.set("customElements", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnclosure(value: ItemEnclosure): Self = this.set("enclosure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnclosure: Self = this.set("enclosure", js.undefined)
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setItunesAuthor(value: String): Self = this.set("itunesAuthor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesAuthor: Self = this.set("itunesAuthor", js.undefined)
    @scala.inline
    def setItunesDuration(value: Double): Self = this.set("itunesDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesDuration: Self = this.set("itunesDuration", js.undefined)
    @scala.inline
    def setItunesEpisode(value: Double): Self = this.set("itunesEpisode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesEpisode: Self = this.set("itunesEpisode", js.undefined)
    @scala.inline
    def setItunesEpisodeType(value: full | trailer | bonus): Self = this.set("itunesEpisodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesEpisodeType: Self = this.set("itunesEpisodeType", js.undefined)
    @scala.inline
    def setItunesExplicit(value: Boolean): Self = this.set("itunesExplicit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesExplicit: Self = this.set("itunesExplicit", js.undefined)
    @scala.inline
    def setItunesImage(value: String): Self = this.set("itunesImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesImage: Self = this.set("itunesImage", js.undefined)
    @scala.inline
    def setItunesSeason(value: Double): Self = this.set("itunesSeason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesSeason: Self = this.set("itunesSeason", js.undefined)
    @scala.inline
    def setItunesSubtitle(value: String): Self = this.set("itunesSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesSubtitle: Self = this.set("itunesSubtitle", js.undefined)
    @scala.inline
    def setItunesSummary(value: String): Self = this.set("itunesSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesSummary: Self = this.set("itunesSummary", js.undefined)
    @scala.inline
    def setItunesTitle(value: String): Self = this.set("itunesTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItunesTitle: Self = this.set("itunesTitle", js.undefined)
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLong(value: Double): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

