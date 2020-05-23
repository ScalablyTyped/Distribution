package typings.octokitTypes.responseHeadersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseHeaders
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  var `cache-control`: js.UndefOr[String] = js.undefined
  var `content-length`: js.UndefOr[Double] = js.undefined
  var `content-type`: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var `last-modified`: js.UndefOr[String] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var vary: js.UndefOr[String] = js.undefined
  var `x-github-mediatype`: js.UndefOr[String] = js.undefined
  var `x-github-request-id`: js.UndefOr[String] = js.undefined
  var `x-oauth-scopes`: js.UndefOr[String] = js.undefined
  var `x-ratelimit-limit`: js.UndefOr[String] = js.undefined
  var `x-ratelimit-remaining`: js.UndefOr[String] = js.undefined
  var `x-ratelimit-reset`: js.UndefOr[String] = js.undefined
}

object ResponseHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Double]] = null,
    `cache-control`: String = null,
    `content-length`: js.UndefOr[Double] = js.undefined,
    `content-type`: String = null,
    date: String = null,
    etag: String = null,
    `last-modified`: String = null,
    link: String = null,
    location: String = null,
    server: String = null,
    status: String = null,
    vary: String = null,
    `x-github-mediatype`: String = null,
    `x-github-request-id`: String = null,
    `x-oauth-scopes`: String = null,
    `x-ratelimit-limit`: String = null,
    `x-ratelimit-remaining`: String = null,
    `x-ratelimit-reset`: String = null
  ): ResponseHeaders = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`.asInstanceOf[js.Any])
    if (!js.isUndefined(`content-length`)) __obj.updateDynamic("content-length")(`content-length`.get.asInstanceOf[js.Any])
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (`last-modified` != null) __obj.updateDynamic("last-modified")(`last-modified`.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (vary != null) __obj.updateDynamic("vary")(vary.asInstanceOf[js.Any])
    if (`x-github-mediatype` != null) __obj.updateDynamic("x-github-mediatype")(`x-github-mediatype`.asInstanceOf[js.Any])
    if (`x-github-request-id` != null) __obj.updateDynamic("x-github-request-id")(`x-github-request-id`.asInstanceOf[js.Any])
    if (`x-oauth-scopes` != null) __obj.updateDynamic("x-oauth-scopes")(`x-oauth-scopes`.asInstanceOf[js.Any])
    if (`x-ratelimit-limit` != null) __obj.updateDynamic("x-ratelimit-limit")(`x-ratelimit-limit`.asInstanceOf[js.Any])
    if (`x-ratelimit-remaining` != null) __obj.updateDynamic("x-ratelimit-remaining")(`x-ratelimit-remaining`.asInstanceOf[js.Any])
    if (`x-ratelimit-reset` != null) __obj.updateDynamic("x-ratelimit-reset")(`x-ratelimit-reset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeaders]
  }
}

