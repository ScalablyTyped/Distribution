package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadFiltersMimeTypes extends js.Object {
  var extensions: String
  var title: String
}

object pluploadFiltersMimeTypes {
  @scala.inline
  def apply(extensions: String, title: String): pluploadFiltersMimeTypes = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pluploadFiltersMimeTypes]
  }
}

