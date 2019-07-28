package typings.pdfjsDashDist.pdfjsDashDistMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFSource extends js.Object {
  var data: js.UndefOr[Uint8Array] = js.undefined
  var httpHeaders: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PDFSource {
  @scala.inline
  def apply(data: Uint8Array = null, httpHeaders: js.Any = null, password: String = null, url: String = null): PDFSource = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders)
    if (password != null) __obj.updateDynamic("password")(password)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PDFSource]
  }
}

