package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAssistant extends js.Object {
  def parseColorStrings(colorStrings: js.Array[String]): js.Array[Color]
}

object ColorAssistant {
  @scala.inline
  def apply(parseColorStrings: js.Array[String] => js.Array[Color]): ColorAssistant = {
    val __obj = js.Dynamic.literal(parseColorStrings = js.Any.fromFunction1(parseColorStrings))
    __obj.asInstanceOf[ColorAssistant]
  }
}

