package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pluploadFiltersMimeTypes extends js.Object {
  var extensions: String = js.native
  var title: String = js.native
}

object pluploadFiltersMimeTypes {
  @scala.inline
  def apply(extensions: String, title: String): pluploadFiltersMimeTypes = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadFiltersMimeTypes]
  }
  @scala.inline
  implicit class pluploadFiltersMimeTypesOps[Self <: pluploadFiltersMimeTypes] (val x: Self) extends AnyVal {
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
    def setExtensions(value: String): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

