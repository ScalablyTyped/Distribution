package typings.prettier.mod

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
import typings.prettier.prettierStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<prettier.prettier.RequiredOptions> */
@js.native
trait Options extends StObject {
  
  var arrowParens: js.UndefOr[avoid | always] = js.native
  
  var bracketSpacing: js.UndefOr[Boolean] = js.native
  
  var embeddedInHtml: js.UndefOr[Boolean] = js.native
  
  var embeddedLanguageFormatting: js.UndefOr[auto | off] = js.native
  
  var endOfLine: js.UndefOr[auto | lf | crlf | cr] = js.native
  
  var filepath: js.UndefOr[String] = js.native
  
  var htmlWhitespaceSensitivity: js.UndefOr[css | strict | ignore] = js.native
  
  var insertPragma: js.UndefOr[Boolean] = js.native
  
  var jsxBracketSameLine: js.UndefOr[Boolean] = js.native
  
  var jsxSingleQuote: js.UndefOr[Boolean] = js.native
  
  var parentParser: js.UndefOr[String] = js.native
  
  var parser: js.UndefOr[(LiteralUnion[BuiltInParserName, String]) | CustomParser] = js.native
  
  var plugins: js.UndefOr[js.Array[String | Plugin[_]]] = js.native
  
  var printWidth: js.UndefOr[Double] = js.native
  
  var proseWrap: js.UndefOr[always | never | preserve] = js.native
  
  var quoteProps: js.UndefOr[`as-needed` | consistent | preserve] = js.native
  
  var rangeEnd: js.UndefOr[Double] = js.native
  
  var rangeStart: js.UndefOr[Double] = js.native
  
  var requirePragma: js.UndefOr[Boolean] = js.native
  
  var semi: js.UndefOr[Boolean] = js.native
  
  var singleQuote: js.UndefOr[Boolean] = js.native
  
  var tabWidth: js.UndefOr[Double] = js.native
  
  var trailingComma: js.UndefOr[none | es5 | all] = js.native
  
  var useTabs: js.UndefOr[Boolean] = js.native
  
  var vueIndentScriptAndStyle: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowParens(value: avoid | always): Self = StObject.set(x, "arrowParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowParensUndefined: Self = StObject.set(x, "arrowParens", js.undefined)
    
    @scala.inline
    def setBracketSpacing(value: Boolean): Self = StObject.set(x, "bracketSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketSpacingUndefined: Self = StObject.set(x, "bracketSpacing", js.undefined)
    
    @scala.inline
    def setEmbeddedInHtml(value: Boolean): Self = StObject.set(x, "embeddedInHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedInHtmlUndefined: Self = StObject.set(x, "embeddedInHtml", js.undefined)
    
    @scala.inline
    def setEmbeddedLanguageFormatting(value: auto | off): Self = StObject.set(x, "embeddedLanguageFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedLanguageFormattingUndefined: Self = StObject.set(x, "embeddedLanguageFormatting", js.undefined)
    
    @scala.inline
    def setEndOfLine(value: auto | lf | crlf | cr): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfLineUndefined: Self = StObject.set(x, "endOfLine", js.undefined)
    
    @scala.inline
    def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
    
    @scala.inline
    def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = StObject.set(x, "htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlWhitespaceSensitivityUndefined: Self = StObject.set(x, "htmlWhitespaceSensitivity", js.undefined)
    
    @scala.inline
    def setInsertPragma(value: Boolean): Self = StObject.set(x, "insertPragma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPragmaUndefined: Self = StObject.set(x, "insertPragma", js.undefined)
    
    @scala.inline
    def setJsxBracketSameLine(value: Boolean): Self = StObject.set(x, "jsxBracketSameLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxBracketSameLineUndefined: Self = StObject.set(x, "jsxBracketSameLine", js.undefined)
    
    @scala.inline
    def setJsxSingleQuote(value: Boolean): Self = StObject.set(x, "jsxSingleQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxSingleQuoteUndefined: Self = StObject.set(x, "jsxSingleQuote", js.undefined)
    
    @scala.inline
    def setParentParser(value: String): Self = StObject.set(x, "parentParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentParserUndefined: Self = StObject.set(x, "parentParser", js.undefined)
    
    @scala.inline
    def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = StObject.set(x, "parser", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[String | Plugin[_]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (String | Plugin[js.Any])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPrintWidth(value: Double): Self = StObject.set(x, "printWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintWidthUndefined: Self = StObject.set(x, "printWidth", js.undefined)
    
    @scala.inline
    def setProseWrap(value: always | never | preserve): Self = StObject.set(x, "proseWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProseWrapUndefined: Self = StObject.set(x, "proseWrap", js.undefined)
    
    @scala.inline
    def setQuoteProps(value: `as-needed` | consistent | preserve): Self = StObject.set(x, "quoteProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotePropsUndefined: Self = StObject.set(x, "quoteProps", js.undefined)
    
    @scala.inline
    def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEndUndefined: Self = StObject.set(x, "rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStartUndefined: Self = StObject.set(x, "rangeStart", js.undefined)
    
    @scala.inline
    def setRequirePragma(value: Boolean): Self = StObject.set(x, "requirePragma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePragmaUndefined: Self = StObject.set(x, "requirePragma", js.undefined)
    
    @scala.inline
    def setSemi(value: Boolean): Self = StObject.set(x, "semi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiUndefined: Self = StObject.set(x, "semi", js.undefined)
    
    @scala.inline
    def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQuoteUndefined: Self = StObject.set(x, "singleQuote", js.undefined)
    
    @scala.inline
    def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
    
    @scala.inline
    def setTrailingComma(value: none | es5 | all): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingCommaUndefined: Self = StObject.set(x, "trailingComma", js.undefined)
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    
    @scala.inline
    def setVueIndentScriptAndStyle(value: Boolean): Self = StObject.set(x, "vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVueIndentScriptAndStyleUndefined: Self = StObject.set(x, "vueIndentScriptAndStyle", js.undefined)
  }
}
