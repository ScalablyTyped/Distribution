package typings.naverDashWhale.whale.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProvider extends js.Object {
  var alternate_urls: js.UndefOr[js.Array[String]] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var favicon_url: js.UndefOr[String] = js.undefined
  var image_url: js.UndefOr[String] = js.undefined
  var image_url_post_params: js.UndefOr[String] = js.undefined
  var instant_url: js.UndefOr[String] = js.undefined
  var instant_url_post_params: js.UndefOr[String] = js.undefined
  var is_default: js.UndefOr[Boolean] = js.undefined
  var keyword: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prepopulated_id: js.UndefOr[Double] = js.undefined
  var search_url: String
  var search_url_post_params: js.UndefOr[String] = js.undefined
  var suggest_url: js.UndefOr[String] = js.undefined
  var suggest_url_post_params: js.UndefOr[String] = js.undefined
}

object SearchProvider {
  @scala.inline
  def apply(
    search_url: String,
    alternate_urls: js.Array[String] = null,
    encoding: String = null,
    favicon_url: String = null,
    image_url: String = null,
    image_url_post_params: String = null,
    instant_url: String = null,
    instant_url_post_params: String = null,
    is_default: js.UndefOr[Boolean] = js.undefined,
    keyword: String = null,
    name: String = null,
    prepopulated_id: Int | Double = null,
    search_url_post_params: String = null,
    suggest_url: String = null,
    suggest_url_post_params: String = null
  ): SearchProvider = {
    val __obj = js.Dynamic.literal(search_url = search_url)
    if (alternate_urls != null) __obj.updateDynamic("alternate_urls")(alternate_urls)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (favicon_url != null) __obj.updateDynamic("favicon_url")(favicon_url)
    if (image_url != null) __obj.updateDynamic("image_url")(image_url)
    if (image_url_post_params != null) __obj.updateDynamic("image_url_post_params")(image_url_post_params)
    if (instant_url != null) __obj.updateDynamic("instant_url")(instant_url)
    if (instant_url_post_params != null) __obj.updateDynamic("instant_url_post_params")(instant_url_post_params)
    if (!js.isUndefined(is_default)) __obj.updateDynamic("is_default")(is_default)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prepopulated_id != null) __obj.updateDynamic("prepopulated_id")(prepopulated_id.asInstanceOf[js.Any])
    if (search_url_post_params != null) __obj.updateDynamic("search_url_post_params")(search_url_post_params)
    if (suggest_url != null) __obj.updateDynamic("suggest_url")(suggest_url)
    if (suggest_url_post_params != null) __obj.updateDynamic("suggest_url_post_params")(suggest_url_post_params)
    __obj.asInstanceOf[SearchProvider]
  }
}

