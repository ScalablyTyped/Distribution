package typings.prettier

import typings.prettier.mod.AST
import typings.prettier.mod.BuiltInParserName
import typings.prettier.mod.BuiltInParsers
import typings.prettier.mod.CustomParser
import typings.prettier.mod.LiteralUnion
import typings.prettier.mod.Options
import typings.prettier.mod.ParserOptions
import typings.prettier.mod.Plugin
import typings.prettier.prettierStrings.`as-needed`
import typings.prettier.prettierStrings.all
import typings.prettier.prettierStrings.always
import typings.prettier.prettierStrings.auto
import typings.prettier.prettierStrings.avoid
import typings.prettier.prettierStrings.consistent
import typings.prettier.prettierStrings.cr
import typings.prettier.prettierStrings.crlf
import typings.prettier.prettierStrings.css
import typings.prettier.prettierStrings.es5
import typings.prettier.prettierStrings.ignore
import typings.prettier.prettierStrings.lf
import typings.prettier.prettierStrings.never
import typings.prettier.prettierStrings.none
import typings.prettier.prettierStrings.off
import typings.prettier.prettierStrings.preserve
import typings.prettier.prettierStrings.root
import typings.prettier.prettierStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var value: js.Array[String]
  }
  object `0` {
    
    inline def apply(value: js.Array[String]): `0` = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait CursorNodeStart extends StObject {
    
    var cursorNodeStart: js.UndefOr[Double] = js.undefined
    
    var cursorNodeText: js.UndefOr[String] = js.undefined
    
    var formatted: String
  }
  object CursorNodeStart {
    
    inline def apply(formatted: String): CursorNodeStart = {
      val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorNodeStart]
    }
    
    extension [Self <: CursorNodeStart](x: Self) {
      
      inline def setCursorNodeStart(value: Double): Self = StObject.set(x, "cursorNodeStart", value.asInstanceOf[js.Any])
      
      inline def setCursorNodeStartUndefined: Self = StObject.set(x, "cursorNodeStart", js.undefined)
      
      inline def setCursorNodeText(value: String): Self = StObject.set(x, "cursorNodeText", value.asInstanceOf[js.Any])
      
      inline def setCursorNodeTextUndefined: Self = StObject.set(x, "cursorNodeText", js.undefined)
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description[Value] extends StObject {
    
    var description: String
    
    var since: js.UndefOr[String] = js.undefined
    
    var value: Value
  }
  object Description {
    
    inline def apply[Value](description: String, value: Value): Description[Value] = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description[Value]]
    }
    
    extension [Self <: Description[?], Value](x: Self & Description[Value]) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndOfLine[T] extends StObject {
    
    var endOfLine: js.UndefOr[
        js.Function5[
          /* commentNode */ js.Any, 
          /* text */ String, 
          /* options */ ParserOptions[T], 
          /* ast */ T, 
          /* isLastComment */ Boolean, 
          Boolean
        ]
      ] = js.undefined
    
    var ownLine: js.UndefOr[
        js.Function5[
          /* commentNode */ js.Any, 
          /* text */ String, 
          /* options */ ParserOptions[T], 
          /* ast */ T, 
          /* isLastComment */ Boolean, 
          Boolean
        ]
      ] = js.undefined
    
    var remaining: js.UndefOr[
        js.Function5[
          /* commentNode */ js.Any, 
          /* text */ String, 
          /* options */ ParserOptions[T], 
          /* ast */ T, 
          /* isLastComment */ Boolean, 
          Boolean
        ]
      ] = js.undefined
  }
  object EndOfLine {
    
    inline def apply[T](): EndOfLine[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndOfLine[T]]
    }
    
    extension [Self <: EndOfLine[?], T](x: Self & EndOfLine[T]) {
      
      inline def setEndOfLine(
        value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions[T], /* ast */ T, /* isLastComment */ Boolean) => Boolean
      ): Self = StObject.set(x, "endOfLine", js.Any.fromFunction5(value))
      
      inline def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
      
      inline def setOwnLine(
        value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions[T], /* ast */ T, /* isLastComment */ Boolean) => Boolean
      ): Self = StObject.set(x, "ownLine", js.Any.fromFunction5(value))
      
      inline def setOwnLineUndefined: Self = StObject.set(x, "ownLine", js.undefined)
      
      inline def setRemaining(
        value: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions[T], /* ast */ T, /* isLastComment */ Boolean) => Boolean
      ): Self = StObject.set(x, "remaining", js.Any.fromFunction5(value))
      
      inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    }
  }
  
  /* Inlined std.Partial<prettier.prettier.RequiredOptions> */
  trait PartialRequiredOptions extends StObject {
    
    var arrowParens: js.UndefOr[avoid | always] = js.undefined
    
    var bracketSpacing: js.UndefOr[Boolean] = js.undefined
    
    var embeddedInHtml: js.UndefOr[Boolean] = js.undefined
    
    var embeddedLanguageFormatting: js.UndefOr[auto | off] = js.undefined
    
    var endOfLine: js.UndefOr[auto | lf | crlf | cr] = js.undefined
    
    var filepath: js.UndefOr[String] = js.undefined
    
    var htmlWhitespaceSensitivity: js.UndefOr[css | strict | ignore] = js.undefined
    
    var insertPragma: js.UndefOr[Boolean] = js.undefined
    
    var jsxBracketSameLine: js.UndefOr[Boolean] = js.undefined
    
    var jsxSingleQuote: js.UndefOr[Boolean] = js.undefined
    
    var parentParser: js.UndefOr[String] = js.undefined
    
    var parser: js.UndefOr[(LiteralUnion[BuiltInParserName, String]) | CustomParser] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String | Plugin[js.Any]]] = js.undefined
    
    var printWidth: js.UndefOr[Double] = js.undefined
    
    var proseWrap: js.UndefOr[always | never | preserve] = js.undefined
    
    var quoteProps: js.UndefOr[`as-needed` | consistent | preserve] = js.undefined
    
    var rangeEnd: js.UndefOr[Double] = js.undefined
    
    var rangeStart: js.UndefOr[Double] = js.undefined
    
    var requirePragma: js.UndefOr[Boolean] = js.undefined
    
    var semi: js.UndefOr[Boolean] = js.undefined
    
    var singleQuote: js.UndefOr[Boolean] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var trailingComma: js.UndefOr[none | es5 | all] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
    
    var vueIndentScriptAndStyle: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRequiredOptions {
    
    inline def apply(): PartialRequiredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRequiredOptions]
    }
    
    extension [Self <: PartialRequiredOptions](x: Self) {
      
      inline def setArrowParens(value: avoid | always): Self = StObject.set(x, "arrowParens", value.asInstanceOf[js.Any])
      
      inline def setArrowParensUndefined: Self = StObject.set(x, "arrowParens", js.undefined)
      
      inline def setBracketSpacing(value: Boolean): Self = StObject.set(x, "bracketSpacing", value.asInstanceOf[js.Any])
      
      inline def setBracketSpacingUndefined: Self = StObject.set(x, "bracketSpacing", js.undefined)
      
      inline def setEmbeddedInHtml(value: Boolean): Self = StObject.set(x, "embeddedInHtml", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedInHtmlUndefined: Self = StObject.set(x, "embeddedInHtml", js.undefined)
      
      inline def setEmbeddedLanguageFormatting(value: auto | off): Self = StObject.set(x, "embeddedLanguageFormatting", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedLanguageFormattingUndefined: Self = StObject.set(x, "embeddedLanguageFormatting", js.undefined)
      
      inline def setEndOfLine(value: auto | lf | crlf | cr): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
      
      inline def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = StObject.set(x, "htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
      
      inline def setHtmlWhitespaceSensitivityUndefined: Self = StObject.set(x, "htmlWhitespaceSensitivity", js.undefined)
      
      inline def setInsertPragma(value: Boolean): Self = StObject.set(x, "insertPragma", value.asInstanceOf[js.Any])
      
      inline def setInsertPragmaUndefined: Self = StObject.set(x, "insertPragma", js.undefined)
      
      inline def setJsxBracketSameLine(value: Boolean): Self = StObject.set(x, "jsxBracketSameLine", value.asInstanceOf[js.Any])
      
      inline def setJsxBracketSameLineUndefined: Self = StObject.set(x, "jsxBracketSameLine", js.undefined)
      
      inline def setJsxSingleQuote(value: Boolean): Self = StObject.set(x, "jsxSingleQuote", value.asInstanceOf[js.Any])
      
      inline def setJsxSingleQuoteUndefined: Self = StObject.set(x, "jsxSingleQuote", js.undefined)
      
      inline def setParentParser(value: String): Self = StObject.set(x, "parentParser", value.asInstanceOf[js.Any])
      
      inline def setParentParserUndefined: Self = StObject.set(x, "parentParser", js.undefined)
      
      inline def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = StObject.set(x, "parser", js.Any.fromFunction3(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlugins(value: js.Array[String | Plugin[js.Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (String | Plugin[js.Any])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setPrintWidth(value: Double): Self = StObject.set(x, "printWidth", value.asInstanceOf[js.Any])
      
      inline def setPrintWidthUndefined: Self = StObject.set(x, "printWidth", js.undefined)
      
      inline def setProseWrap(value: always | never | preserve): Self = StObject.set(x, "proseWrap", value.asInstanceOf[js.Any])
      
      inline def setProseWrapUndefined: Self = StObject.set(x, "proseWrap", js.undefined)
      
      inline def setQuoteProps(value: `as-needed` | consistent | preserve): Self = StObject.set(x, "quoteProps", value.asInstanceOf[js.Any])
      
      inline def setQuotePropsUndefined: Self = StObject.set(x, "quoteProps", js.undefined)
      
      inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
      
      inline def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
      
      inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
      
      inline def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
      
      inline def setRequirePragma(value: Boolean): Self = StObject.set(x, "requirePragma", value.asInstanceOf[js.Any])
      
      inline def setRequirePragmaUndefined: Self = StObject.set(x, "requirePragma", js.undefined)
      
      inline def setSemi(value: Boolean): Self = StObject.set(x, "semi", value.asInstanceOf[js.Any])
      
      inline def setSemiUndefined: Self = StObject.set(x, "semi", js.undefined)
      
      inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
      
      inline def setSingleQuoteUndefined: Self = StObject.set(x, "singleQuote", js.undefined)
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setTrailingComma(value: none | es5 | all): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommaUndefined: Self = StObject.set(x, "trailingComma", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
      
      inline def setVueIndentScriptAndStyle(value: Boolean): Self = StObject.set(x, "vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
      
      inline def setVueIndentScriptAndStyleUndefined: Self = StObject.set(x, "vueIndentScriptAndStyle", js.undefined)
    }
  }
  
  trait ShouldBreak extends StObject {
    
    var shouldBreak: Boolean
  }
  object ShouldBreak {
    
    inline def apply(shouldBreak: Boolean): ShouldBreak = {
      val __obj = js.Dynamic.literal(shouldBreak = shouldBreak.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShouldBreak]
    }
    
    extension [Self <: ShouldBreak](x: Self) {
      
      inline def setShouldBreak(value: Boolean): Self = StObject.set(x, "shouldBreak", value.asInstanceOf[js.Any])
    }
  }
  
  trait Since[Value] extends StObject {
    
    var since: String
    
    var value: Value
  }
  object Since {
    
    inline def apply[Value](since: String, value: Value): Since[Value] = {
      val __obj = js.Dynamic.literal(since = since.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Since[Value]]
    }
    
    extension [Self <: Since[?], Value](x: Self & Since[Value]) {
      
      inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: root
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: js.Array[Double]
  }
  object Value {
    
    inline def apply(value: js.Array[Double]): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait ValueArray extends StObject {
    
    var value: js.Array[Boolean]
  }
  object ValueArray {
    
    inline def apply(value: js.Array[Boolean]): ValueArray = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueArray]
    }
    
    extension [Self <: ValueArray](x: Self) {
      
      inline def setValue(value: js.Array[Boolean]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Boolean*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.UndefOr[scala.Nothing] = js.undefined
  }
}
