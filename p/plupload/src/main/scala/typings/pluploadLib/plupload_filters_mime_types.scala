package typings
package pluploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_filters_mime_types extends js.Object {
  var extensions: java.lang.String
  var title: java.lang.String
}

object plupload_filters_mime_types {
  @scala.inline
  def apply(extensions: java.lang.String, title: java.lang.String): plupload_filters_mime_types = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extensions")(extensions)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[plupload_filters_mime_types]
  }
}

