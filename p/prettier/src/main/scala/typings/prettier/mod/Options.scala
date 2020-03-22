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

/* Inlined parent std.Partial<prettier.prettier.RequiredOptions> */
trait Options extends js.Object {
  var arrowParens: js.UndefOr[avoid | always] = js.undefined
  var bracketSpacing: js.UndefOr[Boolean] = js.undefined
  var endOfLine: js.UndefOr[auto | lf | crlf | cr] = js.undefined
  var filepath: js.UndefOr[String] = js.undefined
  var htmlWhitespaceSensitivity: js.UndefOr[css | strict | ignore] = js.undefined
  var insertPragma: js.UndefOr[Boolean] = js.undefined
  var jsxBracketSameLine: js.UndefOr[Boolean] = js.undefined
  var jsxSingleQuote: js.UndefOr[Boolean] = js.undefined
  var parser: js.UndefOr[BuiltInParserName | CustomParser] = js.undefined
  var plugins: js.UndefOr[js.Array[String | Plugin]] = js.undefined
  var printWidth: js.UndefOr[Double] = js.undefined
  var proseWrap: js.UndefOr[Boolean | always | never | preserve] = js.undefined
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

object Options {
  @scala.inline
  def apply(
    arrowParens: avoid | always = null,
    bracketSpacing: js.UndefOr[Boolean] = js.undefined,
    endOfLine: auto | lf | crlf | cr = null,
    filepath: String = null,
    htmlWhitespaceSensitivity: css | strict | ignore = null,
    insertPragma: js.UndefOr[Boolean] = js.undefined,
    jsxBracketSameLine: js.UndefOr[Boolean] = js.undefined,
    jsxSingleQuote: js.UndefOr[Boolean] = js.undefined,
    parser: BuiltInParserName | CustomParser = null,
    plugins: js.Array[String | Plugin] = null,
    printWidth: Int | Double = null,
    proseWrap: Boolean | always | never | preserve = null,
    quoteProps: `as-needed` | consistent | preserve = null,
    rangeEnd: Int | Double = null,
    rangeStart: Int | Double = null,
    requirePragma: js.UndefOr[Boolean] = js.undefined,
    semi: js.UndefOr[Boolean] = js.undefined,
    singleQuote: js.UndefOr[Boolean] = js.undefined,
    tabWidth: Int | Double = null,
    trailingComma: none | es5 | all = null,
    useTabs: js.UndefOr[Boolean] = js.undefined,
    vueIndentScriptAndStyle: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrowParens != null) __obj.updateDynamic("arrowParens")(arrowParens.asInstanceOf[js.Any])
    if (!js.isUndefined(bracketSpacing)) __obj.updateDynamic("bracketSpacing")(bracketSpacing.asInstanceOf[js.Any])
    if (endOfLine != null) __obj.updateDynamic("endOfLine")(endOfLine.asInstanceOf[js.Any])
    if (filepath != null) __obj.updateDynamic("filepath")(filepath.asInstanceOf[js.Any])
    if (htmlWhitespaceSensitivity != null) __obj.updateDynamic("htmlWhitespaceSensitivity")(htmlWhitespaceSensitivity.asInstanceOf[js.Any])
    if (!js.isUndefined(insertPragma)) __obj.updateDynamic("insertPragma")(insertPragma.asInstanceOf[js.Any])
    if (!js.isUndefined(jsxBracketSameLine)) __obj.updateDynamic("jsxBracketSameLine")(jsxBracketSameLine.asInstanceOf[js.Any])
    if (!js.isUndefined(jsxSingleQuote)) __obj.updateDynamic("jsxSingleQuote")(jsxSingleQuote.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (printWidth != null) __obj.updateDynamic("printWidth")(printWidth.asInstanceOf[js.Any])
    if (proseWrap != null) __obj.updateDynamic("proseWrap")(proseWrap.asInstanceOf[js.Any])
    if (quoteProps != null) __obj.updateDynamic("quoteProps")(quoteProps.asInstanceOf[js.Any])
    if (rangeEnd != null) __obj.updateDynamic("rangeEnd")(rangeEnd.asInstanceOf[js.Any])
    if (rangeStart != null) __obj.updateDynamic("rangeStart")(rangeStart.asInstanceOf[js.Any])
    if (!js.isUndefined(requirePragma)) __obj.updateDynamic("requirePragma")(requirePragma.asInstanceOf[js.Any])
    if (!js.isUndefined(semi)) __obj.updateDynamic("semi")(semi.asInstanceOf[js.Any])
    if (!js.isUndefined(singleQuote)) __obj.updateDynamic("singleQuote")(singleQuote.asInstanceOf[js.Any])
    if (tabWidth != null) __obj.updateDynamic("tabWidth")(tabWidth.asInstanceOf[js.Any])
    if (trailingComma != null) __obj.updateDynamic("trailingComma")(trailingComma.asInstanceOf[js.Any])
    if (!js.isUndefined(useTabs)) __obj.updateDynamic("useTabs")(useTabs.asInstanceOf[js.Any])
    if (!js.isUndefined(vueIndentScriptAndStyle)) __obj.updateDynamic("vueIndentScriptAndStyle")(vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

