package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokensProvider extends js.Object {
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenize(line: String, state: IState): ILineTokens
}

object TokensProvider {
  @scala.inline
  def apply(getInitialState: () => IState, tokenize: (String, IState) => ILineTokens): TokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), tokenize = js.Any.fromFunction2(tokenize))
  
    __obj.asInstanceOf[TokensProvider]
  }
}

