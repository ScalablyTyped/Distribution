package typings.messageformatParser

import typings.messageformatParser.messageformatParserStrings.argument
import typings.messageformatParser.messageformatParserStrings.content
import typings.messageformatParser.messageformatParserStrings.function
import typings.messageformatParser.messageformatParserStrings.octothorpe
import typings.messageformatParser.messageformatParserStrings.plural
import typings.messageformatParser.messageformatParserStrings.select
import typings.messageformatParser.messageformatParserStrings.selectordinal
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserMod {
  
  @JSImport("@messageformat/parser/lib/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@messageformat/parser/lib/parser", "ParseError")
  @js.native
  open class ParseError protected ()
    extends StObject
       with Error {
    def this(lt: Null, msg: String) = this()
    /** @internal */
    def this(lt: typings.moo.mod.Token, msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def parse(src: String): js.Array[Content | PlainArg | FunctionArg | Select] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Content | PlainArg | FunctionArg | Select]]
  inline def parse(src: String, options: ParseOptions): js.Array[Content | PlainArg | FunctionArg | Select] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Content | PlainArg | FunctionArg | Select]]
  
  trait Content
    extends StObject
       with Token {
    
    var ctx: Context
    
    var `type`: content
    
    var value: String
  }
  object Content {
    
    inline def apply(ctx: Context, value: String): Content = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("content")
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setType(value: content): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    /** Token start column, starting from 1 */
    var col: Double
    
    /** Token start line number, starting from 1 */
    var line: Double
    
    /** The number of line breaks consumed while parsing the token */
    var lineBreaks: Double
    
    /** Token start index from the beginning of the input string */
    var offset: Double
    
    /** The raw input source for the token */
    var text: String
  }
  object Context {
    
    inline def apply(col: Double, line: Double, lineBreaks: Double, offset: Double, text: String): Context = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineBreaks = lineBreaks.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineBreaks(value: Double): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionArg
    extends StObject
       with Token {
    
    var arg: String
    
    var ctx: Context
    
    var key: String
    
    var param: js.UndefOr[js.Array[Content | PlainArg | FunctionArg | Select | Octothorpe]] = js.undefined
    
    var `type`: function
  }
  object FunctionArg {
    
    inline def apply(arg: String, ctx: Context, key: String): FunctionArg = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[FunctionArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionArg] (val x: Self) extends AnyVal {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setParam(value: js.Array[Content | PlainArg | FunctionArg | Select | Octothorpe]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      inline def setParamVarargs(value: (Content | PlainArg | FunctionArg | Select | Octothorpe)*): Self = StObject.set(x, "param", js.Array(value*))
      
      inline def setType(value: function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Octothorpe
    extends StObject
       with Token {
    
    var ctx: Context
    
    var `type`: octothorpe
  }
  object Octothorpe {
    
    inline def apply(ctx: Context): Octothorpe = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("octothorpe")
      __obj.asInstanceOf[Octothorpe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Octothorpe] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setType(value: octothorpe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    /**
      * Array of valid plural categories for the current locale, used to validate `plural` keys.
      *
      * If undefined, the full set of valid {@link PluralCategory} keys is used.
      * To disable this check, pass in an empty array.
      */
    var cardinal: js.UndefOr[js.Array[PluralCategory]] = js.undefined
    
    /**
      * Array of valid plural categories for the current locale, used to validate `selectordinal` keys.
      *
      * If undefined, the full set of valid {@link PluralCategory} keys is used.
      * To disable this check, pass in an empty array.
      */
    var ordinal: js.UndefOr[js.Array[PluralCategory]] = js.undefined
    
    /**
      * By default, the parsing applies a few relaxations to the ICU MessageFormat spec.
      * Setting `strict: true` will disable these relaxations.
      *
      * @remarks
      * - The `argType` of `simpleArg` formatting functions will be restricted to the set of
      *   `number`, `date`, `time`, `spellout`, `ordinal`, and `duration`,
      *   rather than accepting any lower-case identifier that does not start with a number.
      *
      * - The optional `argStyle` of `simpleArg` formatting functions will not be parsed as any other text, but instead as the spec requires:
      *   "In argStyleText, every single ASCII apostrophe begins and ends quoted literal text, and unquoted \{curly braces\} must occur in matched pairs."
      *
      * - Inside a `plural` or `selectordinal` statement, a pound symbol (`#`) is replaced with the input number.
      *   By default, `#` is also parsed as a special character in nested statements too, and can be escaped using apostrophes (`'#'`).
      *   In strict mode `#` will be parsed as a special character only directly inside a `plural` or `selectordinal` statement.
      *   Outside those, `#` and `'#'` will be parsed as literal text.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setCardinal(value: js.Array[PluralCategory]): Self = StObject.set(x, "cardinal", value.asInstanceOf[js.Any])
      
      inline def setCardinalUndefined: Self = StObject.set(x, "cardinal", js.undefined)
      
      inline def setCardinalVarargs(value: PluralCategory*): Self = StObject.set(x, "cardinal", js.Array(value*))
      
      inline def setOrdinal(value: js.Array[PluralCategory]): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
      
      inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      inline def setOrdinalVarargs(value: PluralCategory*): Self = StObject.set(x, "ordinal", js.Array(value*))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait PlainArg
    extends StObject
       with Token {
    
    var arg: String
    
    var ctx: Context
    
    var `type`: argument
  }
  object PlainArg {
    
    inline def apply(arg: String, ctx: Context): PlainArg = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("argument")
      __obj.asInstanceOf[PlainArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlainArg] (val x: Self) extends AnyVal {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setType(value: argument): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.messageformatParser.messageformatParserStrings.zero
    - typings.messageformatParser.messageformatParserStrings.one
    - typings.messageformatParser.messageformatParserStrings.two
    - typings.messageformatParser.messageformatParserStrings.few
    - typings.messageformatParser.messageformatParserStrings.many
    - typings.messageformatParser.messageformatParserStrings.other
  */
  trait PluralCategory extends StObject
  object PluralCategory {
    
    inline def few: typings.messageformatParser.messageformatParserStrings.few = "few".asInstanceOf[typings.messageformatParser.messageformatParserStrings.few]
    
    inline def many: typings.messageformatParser.messageformatParserStrings.many = "many".asInstanceOf[typings.messageformatParser.messageformatParserStrings.many]
    
    inline def one: typings.messageformatParser.messageformatParserStrings.one = "one".asInstanceOf[typings.messageformatParser.messageformatParserStrings.one]
    
    inline def other: typings.messageformatParser.messageformatParserStrings.other = "other".asInstanceOf[typings.messageformatParser.messageformatParserStrings.other]
    
    inline def two: typings.messageformatParser.messageformatParserStrings.two = "two".asInstanceOf[typings.messageformatParser.messageformatParserStrings.two]
    
    inline def zero: typings.messageformatParser.messageformatParserStrings.zero = "zero".asInstanceOf[typings.messageformatParser.messageformatParserStrings.zero]
  }
  
  trait Select
    extends StObject
       with Token {
    
    var arg: String
    
    var cases: js.Array[SelectCase]
    
    var ctx: Context
    
    var pluralOffset: js.UndefOr[Double] = js.undefined
    
    var `type`: plural | select | selectordinal
  }
  object Select {
    
    inline def apply(arg: String, cases: js.Array[SelectCase], ctx: Context, `type`: plural | select | selectordinal): Select = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], cases = cases.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Select]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
      
      inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setCases(value: js.Array[SelectCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
      
      inline def setCasesVarargs(value: SelectCase*): Self = StObject.set(x, "cases", js.Array(value*))
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setPluralOffset(value: Double): Self = StObject.set(x, "pluralOffset", value.asInstanceOf[js.Any])
      
      inline def setPluralOffsetUndefined: Self = StObject.set(x, "pluralOffset", js.undefined)
      
      inline def setType(value: plural | select | selectordinal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectCase extends StObject {
    
    var ctx: Context
    
    var key: String
    
    var tokens: js.Array[Content | PlainArg | FunctionArg | Select | Octothorpe]
  }
  object SelectCase {
    
    inline def apply(
      ctx: Context,
      key: String,
      tokens: js.Array[Content | PlainArg | FunctionArg | Select | Octothorpe]
    ): SelectCase = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectCase] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[Content | PlainArg | FunctionArg | Select | Octothorpe]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: (Content | PlainArg | FunctionArg | Select | Octothorpe)*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.messageformatParser.libParserMod.Content
    - typings.messageformatParser.libParserMod.PlainArg
    - typings.messageformatParser.libParserMod.FunctionArg
    - typings.messageformatParser.libParserMod.Select
    - typings.messageformatParser.libParserMod.Octothorpe
  */
  trait Token extends StObject
  object Token {
    
    inline def Content(ctx: Context, value: String): typings.messageformatParser.libParserMod.Content = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("content")
      __obj.asInstanceOf[typings.messageformatParser.libParserMod.Content]
    }
    
    inline def FunctionArg(arg: String, ctx: Context, key: String): typings.messageformatParser.libParserMod.FunctionArg = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("function")
      __obj.asInstanceOf[typings.messageformatParser.libParserMod.FunctionArg]
    }
    
    inline def Octothorpe(ctx: Context): typings.messageformatParser.libParserMod.Octothorpe = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("octothorpe")
      __obj.asInstanceOf[typings.messageformatParser.libParserMod.Octothorpe]
    }
    
    inline def PlainArg(arg: String, ctx: Context): typings.messageformatParser.libParserMod.PlainArg = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("argument")
      __obj.asInstanceOf[typings.messageformatParser.libParserMod.PlainArg]
    }
    
    inline def Select(arg: String, cases: js.Array[SelectCase], ctx: Context, `type`: plural | select | selectordinal): typings.messageformatParser.libParserMod.Select = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], cases = cases.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.messageformatParser.libParserMod.Select]
    }
  }
}
