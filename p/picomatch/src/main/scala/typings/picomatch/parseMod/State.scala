package typings.picomatch.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var backtrack: Boolean
  var braces: Double
  var brackets: Double
  var consumed: String
  var globstar: Boolean
  var index: Double
  var output: String
  var parens: Double
  var start: Double
  var tokens: js.Array[Token]
}

object State {
  @scala.inline
  def apply(
    backtrack: Boolean,
    braces: Double,
    brackets: Double,
    consumed: String,
    globstar: Boolean,
    index: Double,
    output: String,
    parens: Double,
    start: Double,
    tokens: js.Array[Token]
  ): State = {
    val __obj = js.Dynamic.literal(backtrack = backtrack.asInstanceOf[js.Any], braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parens = parens.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

