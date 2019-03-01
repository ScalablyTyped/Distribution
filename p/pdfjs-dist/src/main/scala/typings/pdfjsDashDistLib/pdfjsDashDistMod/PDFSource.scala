package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFSource extends js.Object {
  var data: js.UndefOr[stdLib.Uint8Array] = js.undefined
  var httpHeaders: js.UndefOr[js.Any] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object PDFSource {
  @scala.inline
  def apply(
    data: stdLib.Uint8Array = null,
    httpHeaders: js.Any = null,
    password: java.lang.String = null,
    url: java.lang.String = null
  ): PDFSource = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders)
    if (password != null) __obj.updateDynamic("password")(password)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PDFSource]
  }
}

