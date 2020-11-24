package typings.monacoEditor.mod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentationRule extends js.Object {
  
  /**
    * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
    */
  var decreaseIndentPattern: RegExp = js.native
  
  /**
    * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
    */
  var increaseIndentPattern: RegExp = js.native
  
  /**
    * If a line matches this pattern, then **only the next line** after it should be indented once.
    */
  var indentNextLinePattern: js.UndefOr[RegExp | Null] = js.native
  
  /**
    * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
    */
  var unIndentedLinePattern: js.UndefOr[RegExp | Null] = js.native
}
object IndentationRule {
  
  @scala.inline
  def apply(decreaseIndentPattern: RegExp, increaseIndentPattern: RegExp): IndentationRule = {
    val __obj = js.Dynamic.literal(decreaseIndentPattern = decreaseIndentPattern.asInstanceOf[js.Any], increaseIndentPattern = increaseIndentPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentationRule]
  }
  
  @scala.inline
  implicit class IndentationRuleOps[Self <: IndentationRule] (val x: Self) extends AnyVal {
    
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
    def setDecreaseIndentPattern(value: RegExp): Self = this.set("decreaseIndentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseIndentPattern(value: RegExp): Self = this.set("increaseIndentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentNextLinePattern(value: RegExp): Self = this.set("indentNextLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentNextLinePattern: Self = this.set("indentNextLinePattern", js.undefined)
    
    @scala.inline
    def setIndentNextLinePatternNull: Self = this.set("indentNextLinePattern", null)
    
    @scala.inline
    def setUnIndentedLinePattern(value: RegExp): Self = this.set("unIndentedLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnIndentedLinePattern: Self = this.set("unIndentedLinePattern", js.undefined)
    
    @scala.inline
    def setUnIndentedLinePatternNull: Self = this.set("unIndentedLinePattern", null)
  }
}
