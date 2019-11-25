package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpandedMonarchLanguageRule extends js.Object {
  /**
    * action to take on match
    */
  var action: js.UndefOr[IMonarchLanguageAction] = js.undefined
  /**
    * or an include rule. include all rules from the included state
    */
  var include: js.UndefOr[String] = js.undefined
  /**
    * match tokens
    */
  var regex: js.UndefOr[String | RegExp] = js.undefined
}

object IExpandedMonarchLanguageRule {
  @scala.inline
  def apply(action: IMonarchLanguageAction = null, include: String = null, regex: String | RegExp = null): IExpandedMonarchLanguageRule = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpandedMonarchLanguageRule]
  }
}

