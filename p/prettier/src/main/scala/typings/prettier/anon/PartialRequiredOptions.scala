package typings.prettier.anon

import typings.prettier.mod.AST
import typings.prettier.mod.BuiltInParserName
import typings.prettier.mod.BuiltInParsers
import typings.prettier.mod.CustomParser
import typings.prettier.mod.LiteralUnion
import typings.prettier.mod.Options
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
import typings.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<prettier.prettier.RequiredOptions> */
@js.native
trait PartialRequiredOptions extends js.Object {
  
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
object PartialRequiredOptions {
  
  @scala.inline
  def apply(): PartialRequiredOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRequiredOptions]
  }
  
  @scala.inline
  implicit class PartialRequiredOptionsOps[Self <: PartialRequiredOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowParens(value: avoid | always): Self = this.set("arrowParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowParens: Self = this.set("arrowParens", js.undefined)
    
    @scala.inline
    def setBracketSpacing(value: Boolean): Self = this.set("bracketSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBracketSpacing: Self = this.set("bracketSpacing", js.undefined)
    
    @scala.inline
    def setEmbeddedInHtml(value: Boolean): Self = this.set("embeddedInHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedInHtml: Self = this.set("embeddedInHtml", js.undefined)
    
    @scala.inline
    def setEmbeddedLanguageFormatting(value: auto | off): Self = this.set("embeddedLanguageFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedLanguageFormatting: Self = this.set("embeddedLanguageFormatting", js.undefined)
    
    @scala.inline
    def setEndOfLine(value: auto | lf | crlf | cr): Self = this.set("endOfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOfLine: Self = this.set("endOfLine", js.undefined)
    
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilepath: Self = this.set("filepath", js.undefined)
    
    @scala.inline
    def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = this.set("htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlWhitespaceSensitivity: Self = this.set("htmlWhitespaceSensitivity", js.undefined)
    
    @scala.inline
    def setInsertPragma(value: Boolean): Self = this.set("insertPragma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertPragma: Self = this.set("insertPragma", js.undefined)
    
    @scala.inline
    def setJsxBracketSameLine(value: Boolean): Self = this.set("jsxBracketSameLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsxBracketSameLine: Self = this.set("jsxBracketSameLine", js.undefined)
    
    @scala.inline
    def setJsxSingleQuote(value: Boolean): Self = this.set("jsxSingleQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsxSingleQuote: Self = this.set("jsxSingleQuote", js.undefined)
    
    @scala.inline
    def setParentParser(value: String): Self = this.set("parentParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentParser: Self = this.set("parentParser", js.undefined)
    
    @scala.inline
    def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = this.set("parser", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (String | Plugin[js.Any])*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String | Plugin[_]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPrintWidth(value: Double): Self = this.set("printWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintWidth: Self = this.set("printWidth", js.undefined)
    
    @scala.inline
    def setProseWrap(value: always | never | preserve): Self = this.set("proseWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProseWrap: Self = this.set("proseWrap", js.undefined)
    
    @scala.inline
    def setQuoteProps(value: `as-needed` | consistent | preserve): Self = this.set("quoteProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteProps: Self = this.set("quoteProps", js.undefined)
    
    @scala.inline
    def setRangeEnd(value: Double): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: Double): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeStart: Self = this.set("rangeStart", js.undefined)
    
    @scala.inline
    def setRequirePragma(value: Boolean): Self = this.set("requirePragma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirePragma: Self = this.set("requirePragma", js.undefined)
    
    @scala.inline
    def setSemi(value: Boolean): Self = this.set("semi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemi: Self = this.set("semi", js.undefined)
    
    @scala.inline
    def setSingleQuote(value: Boolean): Self = this.set("singleQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleQuote: Self = this.set("singleQuote", js.undefined)
    
    @scala.inline
    def setTabWidth(value: Double): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabWidth: Self = this.set("tabWidth", js.undefined)
    
    @scala.inline
    def setTrailingComma(value: none | es5 | all): Self = this.set("trailingComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingComma: Self = this.set("trailingComma", js.undefined)
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = this.set("useTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTabs: Self = this.set("useTabs", js.undefined)
    
    @scala.inline
    def setVueIndentScriptAndStyle(value: Boolean): Self = this.set("vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVueIndentScriptAndStyle: Self = this.set("vueIndentScriptAndStyle", js.undefined)
  }
}
