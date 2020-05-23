package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraph extends js.Object {
  var article: js.UndefOr[OpenGraphArticle] = js.undefined
  var book: js.UndefOr[OpenGraphBook] = js.undefined
  var defaultImageHeight: js.UndefOr[Double] = js.undefined
  var defaultImageWidth: js.UndefOr[Double] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var images: js.UndefOr[js.Array[OpenGraphImages]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[OpenGraphProfile] = js.undefined
  var site_name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object OpenGraph {
  @scala.inline
  def apply(
    article: OpenGraphArticle = null,
    book: OpenGraphBook = null,
    defaultImageHeight: js.UndefOr[Double] = js.undefined,
    defaultImageWidth: js.UndefOr[Double] = js.undefined,
    description: String = null,
    images: js.Array[OpenGraphImages] = null,
    locale: String = null,
    profile: OpenGraphProfile = null,
    site_name: String = null,
    title: String = null,
    `type`: String = null,
    url: String = null
  ): OpenGraph = {
    val __obj = js.Dynamic.literal()
    if (article != null) __obj.updateDynamic("article")(article.asInstanceOf[js.Any])
    if (book != null) __obj.updateDynamic("book")(book.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultImageHeight)) __obj.updateDynamic("defaultImageHeight")(defaultImageHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultImageWidth)) __obj.updateDynamic("defaultImageWidth")(defaultImageWidth.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (site_name != null) __obj.updateDynamic("site_name")(site_name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraph]
  }
}

