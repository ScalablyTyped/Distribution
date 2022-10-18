package typings.picomatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScanMod {
  
  inline def apply(input: String): State = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[State]
  inline def apply(input: String, options: Options): State = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @JSImport("picomatch/lib/scan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var noext: js.UndefOr[Boolean] = js.undefined
    
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    var noparen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of strings representing each path "segment"
      * in the scanned glob pattern. This is automatically enabled when `options.tokens` is true
      */
    var parts: js.UndefOr[Boolean] = js.undefined
    
    var scanToEnd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of tokens (objects),
      * representing each path "segment" in the scanned glob pattern
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
    
    var unescape: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNoparen(value: Boolean): Self = StObject.set(x, "noparen", value.asInstanceOf[js.Any])
      
      inline def setNoparenUndefined: Self = StObject.set(x, "noparen", js.undefined)
      
      inline def setParts(value: Boolean): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setScanToEnd(value: Boolean): Self = StObject.set(x, "scanToEnd", value.asInstanceOf[js.Any])
      
      inline def setScanToEndUndefined: Self = StObject.set(x, "scanToEnd", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var base: String
    
    var glob: String
    
    var input: String
    
    var isBrace: Boolean
    
    var isBracket: Boolean
    
    var isExtglob: Boolean
    
    var isGlob: Boolean
    
    var isGlobstar: Boolean
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var negated: Boolean
    
    var parts: js.UndefOr[js.Array[String]] = js.undefined
    
    var prefix: String
    
    var slashes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var start: Double
    
    var tokens: js.UndefOr[js.Array[Token]] = js.undefined
  }
  object State {
    
    inline def apply(
      base: String,
      glob: String,
      input: String,
      isBrace: Boolean,
      isBracket: Boolean,
      isExtglob: Boolean,
      isGlob: Boolean,
      isGlobstar: Boolean,
      negated: Boolean,
      prefix: String,
      start: Double
    ): State = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setIsBrace(value: Boolean): Self = StObject.set(x, "isBrace", value.asInstanceOf[js.Any])
      
      inline def setIsBracket(value: Boolean): Self = StObject.set(x, "isBracket", value.asInstanceOf[js.Any])
      
      inline def setIsExtglob(value: Boolean): Self = StObject.set(x, "isExtglob", value.asInstanceOf[js.Any])
      
      inline def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
      
      inline def setIsGlobstar(value: Boolean): Self = StObject.set(x, "isGlobstar", value.asInstanceOf[js.Any])
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setSlashes(value: js.Array[Double]): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
      
      inline def setSlashesVarargs(value: Double*): Self = StObject.set(x, "slashes", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait Token extends StObject {
    
    var backslashes: js.UndefOr[Boolean] = js.undefined
    
    var depth: Double
    
    var isBrace: js.UndefOr[Boolean] = js.undefined
    
    var isExtglob: js.UndefOr[Boolean] = js.undefined
    
    var isGlob: Boolean
    
    var isGlobstar: js.UndefOr[Boolean] = js.undefined
    
    var negated: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object Token {
    
    inline def apply(depth: Double, isGlob: Boolean, value: String): Token = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setBackslashes(value: Boolean): Self = StObject.set(x, "backslashes", value.asInstanceOf[js.Any])
      
      inline def setBackslashesUndefined: Self = StObject.set(x, "backslashes", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setIsBrace(value: Boolean): Self = StObject.set(x, "isBrace", value.asInstanceOf[js.Any])
      
      inline def setIsBraceUndefined: Self = StObject.set(x, "isBrace", js.undefined)
      
      inline def setIsExtglob(value: Boolean): Self = StObject.set(x, "isExtglob", value.asInstanceOf[js.Any])
      
      inline def setIsExtglobUndefined: Self = StObject.set(x, "isExtglob", js.undefined)
      
      inline def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
      
      inline def setIsGlobstar(value: Boolean): Self = StObject.set(x, "isGlobstar", value.asInstanceOf[js.Any])
      
      inline def setIsGlobstarUndefined: Self = StObject.set(x, "isGlobstar", js.undefined)
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setNegatedUndefined: Self = StObject.set(x, "negated", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
