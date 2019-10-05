package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEnterRule extends js.Object {
  /**
    * The action to execute.
    */
  var action: EnterAction
  /**
    * This rule will only execute if the text after the cursor matches this regular expression.
    */
  var afterText: js.UndefOr[RegExp] = js.undefined
  /**
    * This rule will only execute if the text before the cursor matches this regular expression.
    */
  var beforeText: RegExp
  /**
    * This rule will only execute if the text above the this line matches this regular expression.
    */
  var oneLineAboveText: js.UndefOr[RegExp] = js.undefined
}

object OnEnterRule {
  @scala.inline
  def apply(action: EnterAction, beforeText: RegExp, afterText: RegExp = null, oneLineAboveText: RegExp = null): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action, beforeText = beforeText)
    if (afterText != null) __obj.updateDynamic("afterText")(afterText)
    if (oneLineAboveText != null) __obj.updateDynamic("oneLineAboveText")(oneLineAboveText)
    __obj.asInstanceOf[OnEnterRule]
  }
}

