package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request URL and headers
  */
@js.native
trait RequestUrlAndHeaderInfo extends js.Object {
  /** Request headers */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /** Request URL */
  var url: String = js.native
}

object RequestUrlAndHeaderInfo {
  @scala.inline
  def apply(url: String): RequestUrlAndHeaderInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUrlAndHeaderInfo]
  }
  @scala.inline
  implicit class RequestUrlAndHeaderInfoOps[Self <: RequestUrlAndHeaderInfo] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

