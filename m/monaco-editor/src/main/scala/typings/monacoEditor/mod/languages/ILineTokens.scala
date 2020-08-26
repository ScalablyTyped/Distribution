package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILineTokens extends js.Object {
  /**
    * The tokenization end state.
    * A pointer will be held to this and the object should not be modified by the tokenizer after the pointer is returned.
    */
  var endState: IState = js.native
  /**
    * The list of tokens on the line.
    */
  var tokens: js.Array[IToken] = js.native
}

object ILineTokens {
  @scala.inline
  def apply(endState: IState, tokens: js.Array[IToken]): ILineTokens = {
    val __obj = js.Dynamic.literal(endState = endState.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineTokens]
  }
  @scala.inline
  implicit class ILineTokensOps[Self <: ILineTokens] (val x: Self) extends AnyVal {
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
    def setEndState(value: IState): Self = this.set("endState", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: IToken*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[IToken]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
  
}

