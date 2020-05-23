package typings.monacoEditor.mod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentationRule extends js.Object {
  /**
    * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
    */
  var decreaseIndentPattern: RegExp
  /**
    * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
    */
  var increaseIndentPattern: RegExp
  /**
    * If a line matches this pattern, then **only the next line** after it should be indented once.
    */
  var indentNextLinePattern: js.UndefOr[RegExp | Null] = js.undefined
  /**
    * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
    */
  var unIndentedLinePattern: js.UndefOr[RegExp | Null] = js.undefined
}

object IndentationRule {
  @scala.inline
  def apply(
    decreaseIndentPattern: RegExp,
    increaseIndentPattern: RegExp,
    indentNextLinePattern: js.UndefOr[Null | RegExp] = js.undefined,
    unIndentedLinePattern: js.UndefOr[Null | RegExp] = js.undefined
  ): IndentationRule = {
    val __obj = js.Dynamic.literal(decreaseIndentPattern = decreaseIndentPattern.asInstanceOf[js.Any], increaseIndentPattern = increaseIndentPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(indentNextLinePattern)) __obj.updateDynamic("indentNextLinePattern")(indentNextLinePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(unIndentedLinePattern)) __obj.updateDynamic("unIndentedLinePattern")(unIndentedLinePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentationRule]
  }
}

