package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var image: js.Array[String | Overflow]
  var placeholder: js.Array[String | WidthString]
  var root: Display
}

object Image {
  @scala.inline
  def apply(image: js.Array[String | Overflow], placeholder: js.Array[String | WidthString], root: Display): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

