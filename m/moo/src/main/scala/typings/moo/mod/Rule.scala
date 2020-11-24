package typings.moo.mod

import typings.moo.mooBooleans.`true`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  /**
    * You can have a token type that both matches tokens and contains error values.
    */
  var error: js.UndefOr[`true`] = js.native
  
  /**
    * Moo tracks detailed information about the input for you.
    * It will track line numbers, as long as you apply the `lineBreaks: true`
    * option to any tokens which might contain newlines. Moo will try to warn you if you forget to do this.
    */
  var lineBreaks: js.UndefOr[Boolean] = js.native
  
  var `match`: js.UndefOr[RegExp | String | js.Array[String]] = js.native
  
  /**
    * Moves to a new state, but does not affect the stack.
    */
  var next: js.UndefOr[String] = js.native
  
  /**
    * Returns to a previous state, by removing one or more states from the stack.
    */
  var pop: js.UndefOr[Double] = js.native
  
  /**
    * Moves the lexer to a new state, and pushes the old state onto the stack.
    */
  var push: js.UndefOr[String] = js.native
  
  /**
    * Used for mapping one set of types to another.
    * See https://github.com/no-context/moo#keywords for an example
    */
  var `type`: js.UndefOr[TypeMapper] = js.native
  
  /**
    * Moo doesn't allow capturing groups, but you can supply a transform function, value(),
    * which will be called on the value before storing it in the Token object.
    */
  var value: js.UndefOr[js.Function1[/* x */ String, String]] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setError(value: `true`): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setLineBreaks(value: Boolean): Self = this.set("lineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreaks: Self = this.set("lineBreaks", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = this.set("match", js.Array(value :_*))
    
    @scala.inline
    def setMatch(value: RegExp | String | js.Array[String]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPop(value: Double): Self = this.set("pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    
    @scala.inline
    def setPush(value: String): Self = this.set("push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    
    @scala.inline
    def setType(value: /* x */ String => String): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: /* x */ String => String): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
