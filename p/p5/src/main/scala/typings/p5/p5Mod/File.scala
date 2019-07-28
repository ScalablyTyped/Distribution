package typings.p5.p5Mod

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
    val __obj = js.Dynamic.literal(data = data, file = file, name = name, size = size, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[File]
  }
}

