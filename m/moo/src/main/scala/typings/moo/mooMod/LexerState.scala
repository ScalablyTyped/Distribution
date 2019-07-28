package typings.moo.mooMod

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
    val __obj = js.Dynamic.literal(col = col, line = line, state = state)
  
    __obj.asInstanceOf[LexerState]
  }
}

