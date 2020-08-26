package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAssistant extends js.Object {
  def parseColorStrings(colorStrings: js.Array[String]): js.Array[Color] = js.native
}

object ColorAssistant {
  @scala.inline
  def apply(parseColorStrings: js.Array[String] => js.Array[Color]): ColorAssistant = {
    val __obj = js.Dynamic.literal(parseColorStrings = js.Any.fromFunction1(parseColorStrings))
    __obj.asInstanceOf[ColorAssistant]
  }
  @scala.inline
  implicit class ColorAssistantOps[Self <: ColorAssistant] (val x: Self) extends AnyVal {
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
    def setParseColorStrings(value: js.Array[String] => js.Array[Color]): Self = this.set("parseColorStrings", js.Any.fromFunction1(value))
  }
  
}

