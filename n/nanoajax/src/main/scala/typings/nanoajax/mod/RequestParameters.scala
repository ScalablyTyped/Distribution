package typings.nanoajax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestParameters extends js.Object {
  var body: js.UndefOr[String | FormData] = js.native
  var cors: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var method: js.UndefOr[String] = js.native
  var url: String = js.native
}

object RequestParameters {
  @scala.inline
  def apply(url: String): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
  @scala.inline
  implicit class RequestParametersOps[Self <: RequestParameters] (val x: Self) extends AnyVal {
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
    def setBody(value: String | FormData): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

