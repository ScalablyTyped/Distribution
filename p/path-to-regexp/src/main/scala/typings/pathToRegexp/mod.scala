package typings.pathToRegexp

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-to-regexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compile[P /* <: js.Object */](str: String): PathFunction[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(str.asInstanceOf[js.Any]).asInstanceOf[PathFunction[P]]
  @scala.inline
  def compile[P /* <: js.Object */](str: String, options: ParseOptions & TokensToFunctionOptions): PathFunction[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathFunction[P]]
  
  @scala.inline
  def `match`[P /* <: js.Object */](str: Path): MatchFunction[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any]).asInstanceOf[MatchFunction[P]]
  @scala.inline
  def `match`[P /* <: js.Object */](str: Path, options: ParseOptions & TokensToRegexpOptions & RegexpToFunctionOptions): MatchFunction[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MatchFunction[P]]
  
  @scala.inline
  def parse(str: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
  @scala.inline
  def parse(str: String, options: ParseOptions): js.Array[Token] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Token]]
  
  @scala.inline
  def pathToRegexp(path: Path): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToRegexp")(path.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  @scala.inline
  def pathToRegexp(path: Path, keys: js.Array[Key]): RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToRegexp")(path.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  @scala.inline
  def pathToRegexp(path: Path, keys: js.Array[Key], options: TokensToRegexpOptions & ParseOptions): RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToRegexp")(path.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  @scala.inline
  def pathToRegexp(path: Path, keys: Unit, options: TokensToRegexpOptions & ParseOptions): RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToRegexp")(path.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  
  @scala.inline
  def regexpToFunction[P /* <: js.Object */](re: RegExp, keys: js.Array[Key]): MatchFunction[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("regexpToFunction")(re.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[MatchFunction[P]]
  @scala.inline
  def regexpToFunction[P /* <: js.Object */](re: RegExp, keys: js.Array[Key], options: RegexpToFunctionOptions): MatchFunction[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("regexpToFunction")(re.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MatchFunction[P]]
  
  @scala.inline
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToFunction")(tokens.asInstanceOf[js.Any]).asInstanceOf[PathFunction[P]]
  @scala.inline
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token], options: TokensToFunctionOptions): PathFunction[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToFunction")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PathFunction[P]]
  
  @scala.inline
  def tokensToRegexp(tokens: js.Array[Token]): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("tokensToRegexp")(tokens.asInstanceOf[js.Any]).asInstanceOf[RegExp]
  @scala.inline
  def tokensToRegexp(tokens: js.Array[Token], keys: js.Array[Key]): RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToRegexp")(tokens.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  @scala.inline
  def tokensToRegexp(tokens: js.Array[Token], keys: js.Array[Key], options: TokensToRegexpOptions): RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToRegexp")(tokens.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  @scala.inline
  def tokensToRegexp(tokens: js.Array[Token], keys: Unit, options: TokensToRegexpOptions): RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToRegexp")(tokens.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RegExp]
  
  trait Key extends StObject {
    
    var modifier: String
    
    var name: String | Double
    
    var pattern: String
    
    var prefix: String
    
    var suffix: String
  }
  object Key {
    
    @scala.inline
    def apply(modifier: String, name: String | Double, pattern: String, prefix: String, suffix: String): Key = {
      val __obj = js.Dynamic.literal(modifier = modifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  type MatchFunction[P /* <: js.Object */] = js.Function1[/* path */ String, Match_[P]]
  
  trait MatchResult[P /* <: js.Object */]
    extends StObject
       with Match_[P] {
    
    var index: Double
    
    var params: P
    
    var path: String
  }
  object MatchResult {
    
    @scala.inline
    def apply[P /* <: js.Object */](index: Double, params: P, path: String): MatchResult[P] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult[P]]
    }
    
    @scala.inline
    implicit class MatchResultMutableBuilder[Self <: MatchResult[?], P /* <: js.Object */] (val x: Self & MatchResult[P]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pathToRegexp.pathToRegexpBooleans.`false`
    - typings.pathToRegexp.mod.MatchResult[P]
  */
  trait Match_[P /* <: js.Object */] extends StObject
  
  trait ParseOptions extends StObject {
    
    /**
      * Set the default delimiter for repeat parameters. (default: `'/'`)
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * List of characters to automatically consider prefixes when parsing.
      */
    var prefixes: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setPrefixes(value: String): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    }
  }
  
  type Path = String | RegExp | (js.Array[String | RegExp])
  
  type PathFunction[P /* <: js.Object */] = js.Function1[/* data */ js.UndefOr[P], String]
  
  trait RegexpToFunctionOptions extends StObject {
    
    /**
      * Function for decoding strings for params.
      */
    var decode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
  }
  object RegexpToFunctionOptions {
    
    @scala.inline
    def apply(): RegexpToFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegexpToFunctionOptions]
    }
    
    @scala.inline
    implicit class RegexpToFunctionOptionsMutableBuilder[Self <: RegexpToFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: (/* value */ String, /* token */ Key) => String): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    }
  }
  
  type Token = String | Key
  
  trait TokensToFunctionOptions extends StObject {
    
    /**
      * Function for encoding input strings for output.
      */
    var encode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.undefined
    
    /**
      * When `true` the regexp will be case sensitive. (default: `false`)
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `false` the function can produce an invalid (unmatched) path. (default: `true`)
      */
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object TokensToFunctionOptions {
    
    @scala.inline
    def apply(): TokensToFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokensToFunctionOptions]
    }
    
    @scala.inline
    implicit class TokensToFunctionOptionsMutableBuilder[Self <: TokensToFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncode(value: (/* value */ String, /* token */ Key) => String): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  trait TokensToRegexpOptions extends StObject {
    
    /**
      * Sets the final character for non-ending optimistic matches. (default: `/`)
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Encode path tokens for use in the `RegExp`.
      */
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * When `true` the regexp will match to the end of the string. (default: `true`)
      */
    var end: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of characters that can also be "end" characters.
      */
    var endsWith: js.UndefOr[String] = js.undefined
    
    /**
      * When `true` the regexp will be case sensitive. (default: `false`)
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true` the regexp will match from the beginning of the string. (default: `true`)
      */
    var start: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true` the regexp won't allow an optional trailing delimiter to match. (default: `false`)
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object TokensToRegexpOptions {
    
    @scala.inline
    def apply(): TokensToRegexpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokensToRegexpOptions]
    }
    
    @scala.inline
    implicit class TokensToRegexpOptionsMutableBuilder[Self <: TokensToRegexpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setEndsWith(value: String): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsWithUndefined: Self = StObject.set(x, "endsWith", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
