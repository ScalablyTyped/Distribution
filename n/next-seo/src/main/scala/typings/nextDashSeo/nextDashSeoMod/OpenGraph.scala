package typings.nextDashSeo.nextDashSeoMod

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
    defaultImageHeight: Int | Double = null,
    defaultImageWidth: Int | Double = null,
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
    if (article != null) __obj.updateDynamic("article")(article)
    if (book != null) __obj.updateDynamic("book")(book)
    if (defaultImageHeight != null) __obj.updateDynamic("defaultImageHeight")(defaultImageHeight.asInstanceOf[js.Any])
    if (defaultImageWidth != null) __obj.updateDynamic("defaultImageWidth")(defaultImageWidth.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (images != null) __obj.updateDynamic("images")(images)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (site_name != null) __obj.updateDynamic("site_name")(site_name)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[OpenGraph]
  }
}

