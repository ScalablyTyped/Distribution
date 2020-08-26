package typings.octokitTypes.responseHeadersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseHeaders
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  var `cache-control`: js.UndefOr[String] = js.native
  var `content-length`: js.UndefOr[Double] = js.native
  var `content-type`: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var `last-modified`: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var server: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var vary: js.UndefOr[String] = js.native
  var `x-github-mediatype`: js.UndefOr[String] = js.native
  var `x-github-request-id`: js.UndefOr[String] = js.native
  var `x-oauth-scopes`: js.UndefOr[String] = js.native
  var `x-ratelimit-limit`: js.UndefOr[String] = js.native
  var `x-ratelimit-remaining`: js.UndefOr[String] = js.native
  var `x-ratelimit-reset`: js.UndefOr[String] = js.native
}

object ResponseHeaders {
  @scala.inline
  def apply(): ResponseHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeaders]
  }
  @scala.inline
  implicit class ResponseHeadersOps[Self <: ResponseHeaders] (val x: Self) extends AnyVal {
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
    def `setCache-control`(value: String): Self = this.set("cache-control", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-control`: Self = this.set("cache-control", js.undefined)
    @scala.inline
    def `setContent-length`(value: Double): Self = this.set("content-length", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-length`: Self = this.set("content-length", js.undefined)
    @scala.inline
    def `setContent-type`(value: String): Self = this.set("content-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-type`: Self = this.set("content-type", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def `setLast-modified`(value: String): Self = this.set("last-modified", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLast-modified`: Self = this.set("last-modified", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setVary(value: String): Self = this.set("vary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVary: Self = this.set("vary", js.undefined)
    @scala.inline
    def `setX-github-mediatype`(value: String): Self = this.set("x-github-mediatype", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-github-mediatype`: Self = this.set("x-github-mediatype", js.undefined)
    @scala.inline
    def `setX-github-request-id`(value: String): Self = this.set("x-github-request-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-github-request-id`: Self = this.set("x-github-request-id", js.undefined)
    @scala.inline
    def `setX-oauth-scopes`(value: String): Self = this.set("x-oauth-scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-oauth-scopes`: Self = this.set("x-oauth-scopes", js.undefined)
    @scala.inline
    def `setX-ratelimit-limit`(value: String): Self = this.set("x-ratelimit-limit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-ratelimit-limit`: Self = this.set("x-ratelimit-limit", js.undefined)
    @scala.inline
    def `setX-ratelimit-remaining`(value: String): Self = this.set("x-ratelimit-remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-ratelimit-remaining`: Self = this.set("x-ratelimit-remaining", js.undefined)
    @scala.inline
    def `setX-ratelimit-reset`(value: String): Self = this.set("x-ratelimit-reset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-ratelimit-reset`: Self = this.set("x-ratelimit-reset", js.undefined)
  }
  
}

