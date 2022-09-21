package typings.picomatch

import typings.picomatch.anon.MaxLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  inline def apply(input: String, options: MaxLength): ParseState = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseState]
  
  @JSImport("picomatch/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParseState extends StObject {
    
    var backtrack: Boolean
    
    var braces: Double
    
    var brackets: Double
    
    var consumed: String
    
    var dot: Boolean
    
    var globstar: Boolean
    
    var index: Double
    
    var input: String
    
    var negated: Boolean
    
    var negatedExtglob: js.UndefOr[Boolean] = js.undefined
    
    var output: String
    
    var parens: Double
    
    var prefix: String
    
    var quotes: Double
    
    var start: Double
    
    var tokens: js.Array[Token]
  }
  object ParseState {
    
    inline def apply(
      backtrack: Boolean,
      braces: Double,
      brackets: Double,
      consumed: String,
      dot: Boolean,
      globstar: Boolean,
      index: Double,
      input: String,
      negated: Boolean,
      output: String,
      parens: Double,
      prefix: String,
      quotes: Double,
      start: Double,
      tokens: js.Array[Token]
    ): ParseState = {
      val __obj = js.Dynamic.literal(backtrack = backtrack.asInstanceOf[js.Any], braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parens = parens.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quotes = quotes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseState]
    }
    
    extension [Self <: ParseState](x: Self) {
      
      inline def setBacktrack(value: Boolean): Self = StObject.set(x, "backtrack", value.asInstanceOf[js.Any])
      
      inline def setBraces(value: Double): Self = StObject.set(x, "braces", value.asInstanceOf[js.Any])
      
      inline def setBrackets(value: Double): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      inline def setConsumed(value: String): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setNegatedExtglob(value: Boolean): Self = StObject.set(x, "negatedExtglob", value.asInstanceOf[js.Any])
      
      inline def setNegatedExtglobUndefined: Self = StObject.set(x, "negatedExtglob", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setParens(value: Double): Self = StObject.set(x, "parens", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setQuotes(value: Double): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait Token extends StObject {
    
    var output: Any
    
    var `type`: String
    
    var value: String
  }
  object Token {
    
    inline def apply(output: Any, `type`: String, value: String): Token = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
