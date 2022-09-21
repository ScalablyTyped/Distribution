package typings.nlcst.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentenceContentMap extends StObject {
  
  var punctuation: Punctuation
  
  var source: Source
  
  var symbol: Symbol
  
  var whiteSpace: WhiteSpace
  
  var word: Word
}
object SentenceContentMap {
  
  inline def apply(punctuation: Punctuation, source: Source, symbol: Symbol, whiteSpace: WhiteSpace, word: Word): SentenceContentMap = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceContentMap]
  }
  
  extension [Self <: SentenceContentMap](x: Self) {
    
    inline def setPunctuation(value: Punctuation): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setWhiteSpace(value: WhiteSpace): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
    
    inline def setWord(value: Word): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
