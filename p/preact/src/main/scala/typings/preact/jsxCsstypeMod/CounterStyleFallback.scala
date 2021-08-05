package typings.preact.jsxCsstypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterStyleFallback extends StObject {
  
  var additiveSymbols: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fallback: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var negative: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var pad: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var range: js.UndefOr[CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]] = js.undefined
  
  var speakAs: js.UndefOr[CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]] = js.undefined
  
  var suffix: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var symbols: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var system: js.UndefOr[CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]] = js.undefined
}
object CounterStyleFallback {
  
  inline def apply(): CounterStyleFallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterStyleFallback]
  }
  
  extension [Self <: CounterStyleFallback](x: Self) {
    
    inline def setAdditiveSymbols(value: String | js.Array[String]): Self = StObject.set(x, "additiveSymbols", value.asInstanceOf[js.Any])
    
    inline def setAdditiveSymbolsUndefined: Self = StObject.set(x, "additiveSymbols", js.undefined)
    
    inline def setAdditiveSymbolsVarargs(value: String*): Self = StObject.set(x, "additiveSymbols", js.Array(value :_*))
    
    inline def setFallback(value: String | js.Array[String]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setFallbackVarargs(value: String*): Self = StObject.set(x, "fallback", js.Array(value :_*))
    
    inline def setNegative(value: String | js.Array[String]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    inline def setNegativeVarargs(value: String*): Self = StObject.set(x, "negative", js.Array(value :_*))
    
    inline def setPad(value: String | js.Array[String]): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPadVarargs(value: String*): Self = StObject.set(x, "pad", js.Array(value :_*))
    
    inline def setPrefix(value: String | js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value :_*))
    
    inline def setRange(value: CounterStyleRangeProperty | js.Array[CounterStyleRangeProperty]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: CounterStyleRangeProperty*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    inline def setSpeakAs(value: CounterStyleSpeakAsProperty | js.Array[CounterStyleSpeakAsProperty]): Self = StObject.set(x, "speakAs", value.asInstanceOf[js.Any])
    
    inline def setSpeakAsUndefined: Self = StObject.set(x, "speakAs", js.undefined)
    
    inline def setSpeakAsVarargs(value: CounterStyleSpeakAsProperty*): Self = StObject.set(x, "speakAs", js.Array(value :_*))
    
    inline def setSuffix(value: String | js.Array[String]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSuffixVarargs(value: String*): Self = StObject.set(x, "suffix", js.Array(value :_*))
    
    inline def setSymbols(value: String | js.Array[String]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSymbolsVarargs(value: String*): Self = StObject.set(x, "symbols", js.Array(value :_*))
    
    inline def setSystem(value: CounterStyleSystemProperty | js.Array[CounterStyleSystemProperty]): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setSystemVarargs(value: CounterStyleSystemProperty*): Self = StObject.set(x, "system", js.Array(value :_*))
  }
}
