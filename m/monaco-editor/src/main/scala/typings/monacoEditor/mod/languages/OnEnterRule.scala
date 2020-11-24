package typings.monacoEditor.mod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnEnterRule extends js.Object {
  
  /**
    * The action to execute.
    */
  var action: EnterAction = js.native
  
  /**
    * This rule will only execute if the text after the cursor matches this regular expression.
    */
  var afterText: js.UndefOr[RegExp] = js.native
  
  /**
    * This rule will only execute if the text before the cursor matches this regular expression.
    */
  var beforeText: RegExp = js.native
  
  /**
    * This rule will only execute if the text above the this line matches this regular expression.
    */
  var oneLineAboveText: js.UndefOr[RegExp] = js.native
}
object OnEnterRule {
  
  @scala.inline
  def apply(action: EnterAction, beforeText: RegExp): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], beforeText = beforeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterRule]
  }
  
  @scala.inline
  implicit class OnEnterRuleOps[Self <: OnEnterRule] (val x: Self) extends AnyVal {
    
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
    def setAction(value: EnterAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeText(value: RegExp): Self = this.set("beforeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterText(value: RegExp): Self = this.set("afterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterText: Self = this.set("afterText", js.undefined)
    
    @scala.inline
    def setOneLineAboveText(value: RegExp): Self = this.set("oneLineAboveText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneLineAboveText: Self = this.set("oneLineAboveText", js.undefined)
  }
}
