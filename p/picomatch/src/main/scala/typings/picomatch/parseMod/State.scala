package typings.picomatch.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var backtrack: Boolean = js.native
  var braces: Double = js.native
  var brackets: Double = js.native
  var consumed: String = js.native
  var globstar: Boolean = js.native
  var index: Double = js.native
  var output: String = js.native
  var parens: Double = js.native
  var start: Double = js.native
  var tokens: js.Array[Token] = js.native
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
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBacktrack(value: Boolean): Self = this.set("backtrack", value.asInstanceOf[js.Any])
    @scala.inline
    def setBraces(value: Double): Self = this.set("braces", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrackets(value: Double): Self = this.set("brackets", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumed(value: String): Self = this.set("consumed", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobstar(value: Boolean): Self = this.set("globstar", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setParens(value: Double): Self = this.set("parens", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: Token*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[Token]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
  
}

