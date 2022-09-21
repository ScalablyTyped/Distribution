package typings.nearley

import org.scalablytyped.runtime.StringDictionary
import typings.nearley.anon.Dictkey
import typings.nearley.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nearley", "Grammar")
  @js.native
  open class Grammar protected () extends StObject {
    def this(rules: js.Array[Rule]) = this()
    
    var byName: StringDictionary[js.Array[Rule]] = js.native
    
    var lexer: js.UndefOr[Lexer] = js.native
    
    var rules: js.Array[Rule] = js.native
    
    var start: String = js.native
  }
  /* static members */
  object Grammar {
    
    @JSImport("nearley", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromCompiled(rules: CompiledRules): Grammar = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCompiled")(rules.asInstanceOf[js.Any]).asInstanceOf[Grammar]
  }
  
  @JSImport("nearley", "Parser")
  @js.native
  open class Parser protected () extends StObject {
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
    
    def finish(): js.Array[Any] = js.native
    
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
    var results: js.Array[Any] = js.native
    
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
    inline def fail_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fail")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nearley", "Rule")
  @js.native
  open class Rule protected () extends StObject {
    def this(name: String, symbols: js.Array[Any]) = this()
    def this(name: String, symbols: js.Array[Any], postprocess: Postprocessor) = this()
    
    var id: Double = js.native
    
    var name: String = js.native
    
    var postprocess: js.UndefOr[Postprocessor] = js.native
    
    var symbols: js.Array[Any] = js.native
    
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
    inline def highestId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highestId")(x.asInstanceOf[js.Any])
  }
  
  trait CompiledRules extends StObject {
    
    var Lexer: js.UndefOr[typings.nearley.mod.Lexer] = js.undefined
    
    var ParserRules: js.Array[ParserRule]
    
    var ParserStart: String
  }
  object CompiledRules {
    
    inline def apply(ParserRules: js.Array[ParserRule], ParserStart: String): CompiledRules = {
      val __obj = js.Dynamic.literal(ParserRules = ParserRules.asInstanceOf[js.Any], ParserStart = ParserStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledRules]
    }
    
    extension [Self <: CompiledRules](x: Self) {
      
      inline def setLexer(value: Lexer): Self = StObject.set(x, "Lexer", value.asInstanceOf[js.Any])
      
      inline def setLexerUndefined: Self = StObject.set(x, "Lexer", js.undefined)
      
      inline def setParserRules(value: js.Array[ParserRule]): Self = StObject.set(x, "ParserRules", value.asInstanceOf[js.Any])
      
      inline def setParserRulesVarargs(value: ParserRule*): Self = StObject.set(x, "ParserRules", js.Array(value*))
      
      inline def setParserStart(value: String): Self = StObject.set(x, "ParserStart", value.asInstanceOf[js.Any])
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
  
  type LexerState = StringDictionary[Any]
  
  trait ParserOptions extends StObject {
    
    var keepHistory: js.UndefOr[Boolean] = js.undefined
    
    var lexer: js.UndefOr[Lexer] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setKeepHistory(value: Boolean): Self = StObject.set(x, "keepHistory", value.asInstanceOf[js.Any])
      
      inline def setKeepHistoryUndefined: Self = StObject.set(x, "keepHistory", js.undefined)
      
      inline def setLexer(value: Lexer): Self = StObject.set(x, "lexer", value.asInstanceOf[js.Any])
      
      inline def setLexerUndefined: Self = StObject.set(x, "lexer", js.undefined)
    }
  }
  
  trait ParserRule extends StObject {
    
    var name: String
    
    var postprocess: js.UndefOr[Postprocessor] = js.undefined
    
    var symbols: js.Array[Any]
  }
  object ParserRule {
    
    inline def apply(name: String, symbols: js.Array[Any]): ParserRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserRule]
    }
    
    extension [Self <: ParserRule](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPostprocess(
        value: (/* data */ js.Array[Any], /* reference */ js.UndefOr[Double], /* wantedBy */ js.UndefOr[js.Object]) => Unit
      ): Self = StObject.set(x, "postprocess", js.Any.fromFunction3(value))
      
      inline def setPostprocessUndefined: Self = StObject.set(x, "postprocess", js.undefined)
      
      inline def setSymbols(value: js.Array[Any]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsVarargs(value: Any*): Self = StObject.set(x, "symbols", js.Array(value*))
    }
  }
  
  type Postprocessor = js.Function3[
    /* data */ js.Array[Any], 
    /* reference */ js.UndefOr[Double], 
    /* wantedBy */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type Token = String | Value
}
