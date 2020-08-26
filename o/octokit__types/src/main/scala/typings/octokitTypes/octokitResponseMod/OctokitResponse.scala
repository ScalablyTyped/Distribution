package typings.octokitTypes.octokitResponseMod

import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.octokitTypes.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OctokitResponse[T] extends js.Object {
  /**
    *  This is the data you would see in https://developer.Octokit.com/v3/
    */
  var data: T = js.native
  var headers: ResponseHeaders = js.native
  /**
    * http response code
    */
  var status: Double = js.native
  /**
    * URL of response after all redirects
    */
  var url: Url = js.native
}

object OctokitResponse {
  @scala.inline
  def apply[T](data: T, headers: ResponseHeaders, status: Double, url: Url): OctokitResponse[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctokitResponse[T]]
  }
  @scala.inline
  implicit class OctokitResponseOps[Self <: OctokitResponse[_], T] (val x: Self with OctokitResponse[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: ResponseHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Url): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

