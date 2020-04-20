package typings.monacoEditor.mod.languages.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputFile extends js.Object {
  var name: String
  var text: String
  var writeByteOrderMark: Boolean
}

object OutputFile {
  @scala.inline
  def apply(name: String, text: String, writeByteOrderMark: Boolean): OutputFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], writeByteOrderMark = writeByteOrderMark.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFile]
  }
}

