package typings.nlcst.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordContentMap extends StObject {
  
  var punctuation: Punctuation
  
  var source: Source
  
  var symbol: Symbol
  
  var text: Text
}
object WordContentMap {
  
  inline def apply(punctuation: Punctuation, source: Source, symbol: Symbol, text: Text): WordContentMap = {
    val __obj = js.Dynamic.literal(punctuation = punctuation.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordContentMap]
  }
  
  extension [Self <: WordContentMap](x: Self) {
    
    inline def setPunctuation(value: Punctuation): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
