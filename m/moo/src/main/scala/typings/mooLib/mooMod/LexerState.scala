package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexerState extends js.Object {
  var col: scala.Double
  var line: scala.Double
  var state: java.lang.String
}

object LexerState {
  @scala.inline
  def apply(col: scala.Double, line: scala.Double, state: java.lang.String): LexerState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[LexerState]
  }
}

