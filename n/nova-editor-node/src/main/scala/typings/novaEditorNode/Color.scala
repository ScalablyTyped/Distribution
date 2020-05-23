package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var components: ColorComponents
  var format: ColorFormat
}

object Color {
  @scala.inline
  def apply(components: ColorComponents, format: ColorFormat): Color = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

