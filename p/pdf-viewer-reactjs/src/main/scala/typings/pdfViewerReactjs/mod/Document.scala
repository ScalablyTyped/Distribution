package typings.pdfViewerReactjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var base64: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Document {
  @scala.inline
  def apply(base64: String = null, url: String = null): Document = {
    val __obj = js.Dynamic.literal()
    if (base64 != null) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

