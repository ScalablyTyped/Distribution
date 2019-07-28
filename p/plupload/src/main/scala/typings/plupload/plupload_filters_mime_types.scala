package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plupload_filters_mime_types extends js.Object {
  var extensions: String
  var title: String
}

object plupload_filters_mime_types {
  @scala.inline
  def apply(extensions: String, title: String): plupload_filters_mime_types = {
    val __obj = js.Dynamic.literal(extensions = extensions, title = title)
  
    __obj.asInstanceOf[plupload_filters_mime_types]
  }
}

