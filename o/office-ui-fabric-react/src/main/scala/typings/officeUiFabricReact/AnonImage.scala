package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var image: js.Array[String | AnonOverflow]
  var placeholder: js.Array[String | AnonWidthString]
  var root: AnonDisplay
}

object AnonImage {
  @scala.inline
  def apply(
    image: js.Array[String | AnonOverflow],
    placeholder: js.Array[String | AnonWidthString],
    root: AnonDisplay
  ): AnonImage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImage]
  }
}

