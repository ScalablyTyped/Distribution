package typings.moo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexerState extends js.Object {
  var col: Double
  var line: Double
  var state: String
}

object LexerState {
  @scala.inline
  def apply(col: Double, line: Double, state: String): LexerState = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexerState]
  }
}

