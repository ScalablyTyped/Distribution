package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokensProvider extends StObject {
  
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
  
  inline def apply(getInitialState: () => IState, tokenize: (String, IState) => ILineTokens): TokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), tokenize = js.Any.fromFunction2(tokenize))
    __obj.asInstanceOf[TokensProvider]
  }
  
  extension [Self <: TokensProvider](x: Self) {
    
    inline def setGetInitialState(value: () => IState): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
    
    inline def setTokenize(value: (String, IState) => ILineTokens): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
  }
}
