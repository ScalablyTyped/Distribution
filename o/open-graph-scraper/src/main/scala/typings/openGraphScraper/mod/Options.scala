package typings.openGraphScraper.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** By default, OGS will only send back the first image/video it finds (default: `false`). */
  var allMedia: js.UndefOr[Boolean] = js.native
  /** Pass in an array of sites you don't want `og`s to run on. */
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  /** Set the accept-encoding to `gzip/deflate` (default: `true`). */
  var decompress: js.UndefOr[Boolean] = js.native
  /** Setting this to `null` might help with running `og`s on non english websites (default: `utf8`). */
  var encoding: js.UndefOr[String | Null] = js.native
  /** Defines if redirect responses should be followed automatically (default: `true`). */
  var followRedirect: js.UndefOr[Boolean] = js.native
  /** An object containing request headers. Useful for setting the user-agent. */
  var headers: js.UndefOr[Record[String, String]] = js.native
  /** You can pass in an HTML string to run `og`s on it (use without `options.url`). */
  var html: js.UndefOr[String] = js.native
  /** Max number of redirects `og`s will follow (default: `10`). */
  var maxRedirects: js.UndefOr[Double] = js.native
  /** Fetch other images if no open graph ones are found (default: `true`). */
  var ogImageFallback: js.UndefOr[Boolean] = js.native
  /** Only fetch open graph info and don't fall back on anything else (default: `false`). */
  var onlyGetOpenGraphInfo: js.UndefOr[Boolean] = js.native
  /** Sets the peekSize for the request (default: `1024`). */
  var peekSize: js.UndefOr[Double] = js.native
  /** Number of times `og`s will retry the request (default: `2`). */
  var retry: js.UndefOr[Double] = js.native
  /** Runs charset and icons on the request payload (default: `false`). */
  var runChar: js.UndefOr[Boolean] = js.native
  /** Timeout of the request in ms (default: `2000`). */
  var timeout: js.UndefOr[Double] = js.native
  /** URL of the site. */
  var url: String = js.native
  /** Returns the charset in the `og`s payload (default: `false`). */
  var withCharset: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllMedia(value: Boolean): Self = this.set("allMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllMedia: Self = this.set("allMedia", js.undefined)
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    @scala.inline
    def setDecompress(value: Boolean): Self = this.set("decompress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecompress: Self = this.set("decompress", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setFollowRedirect(value: Boolean): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    @scala.inline
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    @scala.inline
    def setOgImageFallback(value: Boolean): Self = this.set("ogImageFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOgImageFallback: Self = this.set("ogImageFallback", js.undefined)
    @scala.inline
    def setOnlyGetOpenGraphInfo(value: Boolean): Self = this.set("onlyGetOpenGraphInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyGetOpenGraphInfo: Self = this.set("onlyGetOpenGraphInfo", js.undefined)
    @scala.inline
    def setPeekSize(value: Double): Self = this.set("peekSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeekSize: Self = this.set("peekSize", js.undefined)
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setRunChar(value: Boolean): Self = this.set("runChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunChar: Self = this.set("runChar", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWithCharset(value: Boolean): Self = this.set("withCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCharset: Self = this.set("withCharset", js.undefined)
  }
  
}

