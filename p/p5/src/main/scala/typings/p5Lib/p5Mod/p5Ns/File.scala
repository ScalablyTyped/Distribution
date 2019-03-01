package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  /**
    *   URL string containing image data.
    */
  var data: js.Any
  /**
    *   Underlying File object. All normal File methods
    *   can be called on this.
    */
  var file: js.Any
  /**
    *   File name
    */
  var name: js.Any
  /**
    *   File size
    */
  var size: js.Any
  /**
    *   File subtype (usually the file extension jpg, png,
    *   xml, etc.)
    */
  var subtype: js.Any
  /**
    *   File type (image, text, etc.)
    */
  var `type`: js.Any
}

object File {
  @scala.inline
  def apply(data: js.Any, file: js.Any, name: js.Any, size: js.Any, subtype: js.Any, `type`: js.Any): File = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[File]
  }
}

