package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  /**
    * The path of the CSS source file. You should always set "from", because it is
    * used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Source map options
    */
  var map: js.UndefOr[SourceMapOptions | scala.Boolean] = js.undefined
  /**
    * Function to generate AST by string.
    */
  var parser: js.UndefOr[Parser] = js.undefined
  /**
    * Class to generate string by AST.
    */
  var stringifier: js.UndefOr[Stringifier] = js.undefined
  /**
    * Object with parse and stringify.
    */
  var syntax: js.UndefOr[Syntax] = js.undefined
  /**
    * The path where you'll put the output CSS file. You should always set "to"
    * to generate correct source maps.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    map: SourceMapOptions | scala.Boolean = null,
    parser: Parser = null,
    stringifier: Stringifier = null,
    syntax: Syntax = null,
    to: java.lang.String = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ProcessOptions]
  }
}

