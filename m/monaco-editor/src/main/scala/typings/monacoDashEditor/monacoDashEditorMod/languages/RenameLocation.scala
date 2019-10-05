package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
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
    val __obj = js.Dynamic.literal(range = range, text = text)
  
    __obj.asInstanceOf[RenameLocation]
  }
}

