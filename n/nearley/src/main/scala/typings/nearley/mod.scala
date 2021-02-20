package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.anon.Dictkey
import typings.nearley.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nearley", "Grammar")
  @js.native
  class Grammar protected () extends StObject {
    def this(rules: js.Array[Rule]) = this()
    
    var byName: StringDictionary[js.Array[Rule]] = js.native
    
    var lexer: js.UndefOr[Lexer] = js.native
    
    var rules: js.Array[Rule] = js.native
    
    var start: String = js.native
  }
  /* static members */
  object Grammar {
    
    @JSImport("nearley", "Grammar.fromCompiled")
    @js.native
    def fromCompiled(rules: CompiledRules): Grammar = js.native
  }
  
  @JSImport("nearley", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(grammar: Grammar) = this()
    def this(grammar: Grammar, options: ParserOptions) = this()
    
    var current: Double = js.native
    
    /**
      * The Parser object can be fed data in parts with .feed(data).
      * You can then find an array of parsings with the .results property.
      * If results is empty, then there are no parsings.
      * If results contains multiple values, then that combination is ambiguous.
      *
      * @throws If there are no possible parsings, nearley will throw an error
      * whose offset property is the index of the offending token.
      */
    def feed(chunk: String): this.type = js.native
    
    def finish(): js.Array[_] = js.native
    
    var grammar: Grammar = js.native
    
    var lexer: Lexer = js.native
    
    var lexerState: js.UndefOr[LexerState] = js.native
    
    var options: ParserOptions = js.native
    
    def restore(column: Dictkey): Unit = js.native
    
    /**
      * An array of possible parsings. Each element is the thing returned by your grammar.
      *
      * Note that this is undefined before the first feed() call.
      * It isn't typed as `any[] | undefined` to spare you the null checks when it's definitely an array.
      */
    var results: js.Array[_] = js.native
    
    def save(): Dictkey = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("nearley", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reserved token for indicating a parse fail.
      */
    @JSImport("nearley", "Parser.fail")
    @js.native
    def fail: js.Object = js.native
    @scala.inline
    def fail_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fail")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nearley", "Rule")
  @js.native
  class Rule protected () extends StObject {
    def this(name: String, symbols: js.Array[_]) = this()
    def this(name: String, symbols: js.Array[_], postprocess: Postprocessor) = this()
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var postprocess: js.UndefOr[Postprocessor] = js.native
    
    var symbols: js.Array[_] = js.native
    
    def toString(withCursorAt: Double): String = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("nearley", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nearley", "Rule.highestId")
    @js.native
    def highestId: Double = js.native
    @scala.inline
    def highestId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highestId")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CompiledRules extends StObject {
    
    var Lexer: js.UndefOr[typings.nearley.mod.Lexer] = js.native
    
    var ParserRules: js.Array[ParserRule] = js.native
    
    var ParserStart: String = js.native
  }
  object CompiledRules {
    
    @scala.inline
    def apply(ParserRules: js.Array[ParserRule], ParserStart: String): CompiledRules = {
      val __obj = js.Dynamic.literal(ParserRules = ParserRules.asInstanceOf[js.Any], ParserStart = ParserStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledRules]
    }
    
    @scala.inline
    implicit class CompiledRulesMutableBuilder[Self <: CompiledRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLexer(value: Lexer): Self = StObject.set(x, "Lexer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLexerUndefined: Self = StObject.set(x, "Lexer", js.undefined)
      
      @scala.inline
      def setParserRules(value: js.Array[ParserRule]): Self = StObject.set(x, "ParserRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserRulesVarargs(value: ParserRule*): Self = StObject.set(x, "ParserRules", js.Array(value :_*))
      
      @scala.inline
      def setParserStart(value: String): Self = StObject.set(x, "ParserStart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lexer extends StObject {
    
    /**
      * Returns a string with an error message describing the line/col of the offending token.
      * You might like to include a preview of the line in question.
      */
    def formatError(token: Token, message: String): String = js.native
    
    /**
      * Returns e.g. {type, value, line, col, …}. Only the value attribute is required.
      */
    def next(): js.UndefOr[Token] = js.native
    
    /**
      * Sets the internal buffer to data, and restores line/col/state info taken from save().
      */
    def reset(data: String): Unit = js.native
    def reset(data: String, state: LexerState): Unit = js.native
    
    /**
      * Returns an object describing the current line/col etc. This allows us
      * to preserve this information between feed() calls, and also to support Parser#rewind().
      * The exact structure is lexer-specific; nearley doesn't care what's in it.
      */
    def save(): LexerState = js.native
  }
  
  type LexerState = StringDictionary[js.Any]
  
  @js.native
  trait ParserOptions extends StObject {
    
    var keepHistory: js.UndefOr[Boolean] = js.native
    
    var lexer: js.UndefOr[Lexer] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepHistory(value: Boolean): Self = StObject.set(x, "keepHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepHistoryUndefined: Self = StObject.set(x, "keepHistory", js.undefined)
      
      @scala.inline
      def setLexer(value: Lexer): Self = StObject.set(x, "lexer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLexerUndefined: Self = StObject.set(x, "lexer", js.undefined)
    }
  }
  
  @js.native
  trait ParserRule extends StObject {
    
    var name: String = js.native
    
    var postprocess: js.UndefOr[Postprocessor] = js.native
    
    var symbols: js.Array[_] = js.native
  }
  object ParserRule {
    
    @scala.inline
    def apply(name: String, symbols: js.Array[_]): ParserRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserRule]
    }
    
    @scala.inline
    implicit class ParserRuleMutableBuilder[Self <: ParserRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostprocess(
        value: (/* data */ js.Array[js.Any], /* reference */ js.UndefOr[Double], /* wantedBy */ js.UndefOr[js.Object]) => Unit
      ): Self = StObject.set(x, "postprocess", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPostprocessUndefined: Self = StObject.set(x, "postprocess", js.undefined)
      
      @scala.inline
      def setSymbols(value: js.Array[_]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolsVarargs(value: js.Any*): Self = StObject.set(x, "symbols", js.Array(value :_*))
    }
  }
  
  type Postprocessor = js.Function3[
    /* data */ js.Array[js.Any], 
    /* reference */ js.UndefOr[Double], 
    /* wantedBy */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type Token = String | Value
}
