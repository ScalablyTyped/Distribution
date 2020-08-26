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
import typings.prettier.prettierStrings.preserve
import typings.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends RequiredOptions {
  var originalText: String = js.native
  def locEnd(node: js.Any): Double = js.native
  def locStart(node: js.Any): Double = js.native
}

object ParserOptions {
  @scala.inline
  def apply(
    arrowParens: avoid | always,
    bracketSpacing: Boolean,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    locEnd: js.Any => Double,
    locStart: js.Any => Double,
    originalText: String,
    parser: BuiltInParserName | CustomParser,
    plugins: js.Array[String | Plugin],
    printWidth: Double,
    proseWrap: always | never | preserve,
    quoteProps: `as-needed` | consistent | preserve,
    rangeEnd: Double,
    rangeStart: Double,
    requirePragma: Boolean,
    semi: Boolean,
    singleQuote: Boolean,
    tabWidth: Double,
    trailingComma: none | es5 | all,
    useTabs: Boolean,
    vueIndentScriptAndStyle: Boolean
  ): ParserOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], locEnd = js.Any.fromFunction1(locEnd), locStart = js.Any.fromFunction1(locStart), originalText = originalText.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setLocEnd(value: js.Any => Double): Self = this.set("locEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setLocStart(value: js.Any => Double): Self = this.set("locStart", js.Any.fromFunction1(value))
    @scala.inline
    def setOriginalText(value: String): Self = this.set("originalText", value.asInstanceOf[js.Any])
  }
  
}

