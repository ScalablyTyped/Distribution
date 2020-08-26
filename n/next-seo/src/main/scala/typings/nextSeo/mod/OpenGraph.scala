package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenGraph extends js.Object {
  var article: js.UndefOr[OpenGraphArticle] = js.native
  var book: js.UndefOr[OpenGraphBook] = js.native
  var defaultImageHeight: js.UndefOr[Double] = js.native
  var defaultImageWidth: js.UndefOr[Double] = js.native
  var description: js.UndefOr[String] = js.native
  var images: js.UndefOr[js.Array[OpenGraphImages]] = js.native
  var locale: js.UndefOr[String] = js.native
  var profile: js.UndefOr[OpenGraphProfile] = js.native
  var site_name: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object OpenGraph {
  @scala.inline
  def apply(): OpenGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraph]
  }
  @scala.inline
  implicit class OpenGraphOps[Self <: OpenGraph] (val x: Self) extends AnyVal {
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
    def setArticle(value: OpenGraphArticle): Self = this.set("article", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArticle: Self = this.set("article", js.undefined)
    @scala.inline
    def setBook(value: OpenGraphBook): Self = this.set("book", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBook: Self = this.set("book", js.undefined)
    @scala.inline
    def setDefaultImageHeight(value: Double): Self = this.set("defaultImageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultImageHeight: Self = this.set("defaultImageHeight", js.undefined)
    @scala.inline
    def setDefaultImageWidth(value: Double): Self = this.set("defaultImageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultImageWidth: Self = this.set("defaultImageWidth", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setImagesVarargs(value: OpenGraphImages*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[OpenGraphImages]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setProfile(value: OpenGraphProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setSite_name(value: String): Self = this.set("site_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite_name: Self = this.set("site_name", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

