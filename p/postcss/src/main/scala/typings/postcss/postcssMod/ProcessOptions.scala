package typings.postcss.postcssMod

import typings.postcss.postcssStrings.from
import typings.postcss.postcssStrings.map
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends js.Object {
  /**
    * The path of the CSS source file. You should always set "from", because it is
    * used in source map generation and syntax error messages.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * Source map options
    */
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
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
  var to: js.UndefOr[String] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    from: String = null,
    map: SourceMapOptions | Boolean = null,
    parser: (/* css */ ParserInput, /* opts */ js.UndefOr[Pick[ProcessOptions, map | from]]) => Root = null,
    stringifier: (/* node */ Node, /* builder */ Builder) => Unit = null,
    syntax: Syntax = null,
    to: String = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2(parser))
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction2(stringifier))
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
}

