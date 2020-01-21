package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineTokens extends js.Object {
  /**
    * The tokenization end state.
    * A pointer will be held to this and the object should not be modified by the tokenizer after the pointer is returned.
    */
  var endState: IState
  /**
    * The list of tokens on the line.
    */
  var tokens: js.Array[IToken]
}

object ILineTokens {
  @scala.inline
  def apply(endState: IState, tokens: js.Array[IToken]): ILineTokens = {
    val __obj = js.Dynamic.literal(endState = endState.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILineTokens]
  }
}

