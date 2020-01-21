package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRange extends js.Object {
  var range: IRange
}

object SelectionRange {
  @scala.inline
  def apply(range: IRange): SelectionRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectionRange]
  }
}

