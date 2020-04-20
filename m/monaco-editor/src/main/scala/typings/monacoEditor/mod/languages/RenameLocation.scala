package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameLocation extends js.Object {
  var range: IRange
  var text: String
}

object RenameLocation {
  @scala.inline
  def apply(range: IRange, text: String): RenameLocation = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameLocation]
  }
}

