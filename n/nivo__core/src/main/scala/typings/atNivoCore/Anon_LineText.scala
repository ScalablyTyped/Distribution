package typings.atNivoCore

import typings.react.reactMod.CSSProperties
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineText extends js.Object {
  var line: Partial[CSSProperties]
  var text: Partial[CSSProperties]
}

object Anon_LineText {
  @scala.inline
  def apply(line: Partial[CSSProperties], text: Partial[CSSProperties]): Anon_LineText = {
    val __obj = js.Dynamic.literal(line = line, text = text)
  
    __obj.asInstanceOf[Anon_LineText]
  }
}

