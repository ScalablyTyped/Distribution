package typings.octokitTypes.requestHeadersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHeaders
  extends /* header */ StringDictionary[js.UndefOr[String | Double]] {
  /**
    * Avoid setting `headers.accept`, use `mediaType.{format|previews}` option instead.
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
    */
  var authorization: js.UndefOr[String] = js.native
  /**
    * `user-agent` is set do a default and can be overwritten as needed.
    */
  var `user-agent`: js.UndefOr[String] = js.native
}

object RequestHeaders {
  @scala.inline
  def apply(): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestHeaders]
  }
  @scala.inline
  implicit class RequestHeadersOps[Self <: RequestHeaders] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def `setUser-agent`(value: String): Self = this.set("user-agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-agent`: Self = this.set("user-agent", js.undefined)
  }
  
}

