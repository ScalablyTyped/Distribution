package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedTokensProvider extends StObject {
  
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  var tokenize: js.UndefOr[js.Function2[/* line */ String, /* state */ IState, ILineTokens]] = js.undefined
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenizeEncoded(line: String, state: IState): IEncodedLineTokens
}
object EncodedTokensProvider {
  
  inline def apply(getInitialState: () => IState, tokenizeEncoded: (String, IState) => IEncodedLineTokens): EncodedTokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = js.Any.fromFunction0(getInitialState), tokenizeEncoded = js.Any.fromFunction2(tokenizeEncoded))
    __obj.asInstanceOf[EncodedTokensProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedTokensProvider] (val x: Self) extends AnyVal {
    
    inline def setGetInitialState(value: () => IState): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
    
    inline def setTokenize(value: (/* line */ String, /* state */ IState) => ILineTokens): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
    
    inline def setTokenizeEncoded(value: (String, IState) => IEncodedLineTokens): Self = StObject.set(x, "tokenizeEncoded", js.Any.fromFunction2(value))
    
    inline def setTokenizeUndefined: Self = StObject.set(x, "tokenize", js.undefined)
  }
}
