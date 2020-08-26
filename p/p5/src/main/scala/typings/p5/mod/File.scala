package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    *   URL string containing image data.
    */
  var data: js.Any = js.native
  /**
    *   Underlying File object. All normal File methods
    *   can be called on this.
    */
  var file: js.Any = js.native
  /**
    *   File name
    */
  var name: js.Any = js.native
  /**
    *   File size
    */
  var size: js.Any = js.native
  /**
    *   File subtype (usually the file extension jpg, png,
    *   xml, etc.)
    */
  var subtype: js.Any = js.native
  /**
    *   File type (image, text, etc.)
    */
  var `type`: js.Any = js.native
}

object File {
  @scala.inline
  def apply(data: js.Any, file: js.Any, name: js.Any, size: js.Any, subtype: js.Any, `type`: js.Any): File = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: js.Any): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: js.Any): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

