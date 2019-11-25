package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingMarkers extends js.Object {
  var end: RegExp
  var start: RegExp
}

object FoldingMarkers {
  @scala.inline
  def apply(end: RegExp, start: RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FoldingMarkers]
  }
}

