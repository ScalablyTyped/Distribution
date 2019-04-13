package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends Syntax {
  /**
    * The path of the CSS source file. You should always set from, because it is
    * used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  var map: js.UndefOr[SourceMapOptions] = js.undefined
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[Parse | Syntax] = js.undefined
  /**
    * Enable Safe Mode, in which PostCSS will try to fix CSS syntax errors.
    */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Stringify | Syntax] = js.undefined
  var syntax: js.UndefOr[Syntax] = js.undefined
  /**
    * The path where you'll put the output CSS file. You should always set it
    * to generate correct source maps.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    map: SourceMapOptions = null,
    parse: Parse = null,
    parser: Parse | Syntax = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    stringifier: Stringify | Syntax = null,
    stringify: Stringify = null,
    syntax: Syntax = null,
    to: java.lang.String = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ProcessOptions]
  }
}

