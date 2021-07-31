package typings.picomatch

import typings.picomatch.anon.MaxLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @scala.inline
  def apply(input: String, options: MaxLength): State = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @JSImport("picomatch/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait State extends StObject {
    
    var backtrack: Boolean
    
    var braces: Double
    
    var brackets: Double
    
    var consumed: String
    
    var globstar: Boolean
    
    var index: Double
    
    var output: String
    
    var parens: Double
    
    var start: Double
    
    var tokens: js.Array[Token]
  }
  object State {
    
    @scala.inline
    def apply(
      backtrack: Boolean,
      braces: Double,
      brackets: Double,
      consumed: String,
      globstar: Boolean,
      index: Double,
      output: String,
      parens: Double,
      start: Double,
      tokens: js.Array[Token]
    ): State = {
      val __obj = js.Dynamic.literal(backtrack = backtrack.asInstanceOf[js.Any], braces = braces.asInstanceOf[js.Any], brackets = brackets.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], globstar = globstar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parens = parens.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBacktrack(value: Boolean): Self = StObject.set(x, "backtrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBraces(value: Double): Self = StObject.set(x, "braces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrackets(value: Double): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumed(value: String): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParens(value: Double): Self = StObject.set(x, "parens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    }
  }
  
  trait Token extends StObject {
    
    var output: js.Any
    
    var `type`: String
    
    var value: String
  }
  object Token {
    
    @scala.inline
    def apply(output: js.Any, `type`: String, value: String): Token = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
