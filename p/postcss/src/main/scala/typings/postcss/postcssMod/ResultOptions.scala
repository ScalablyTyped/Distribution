package typings.postcss.postcssMod

import typings.postcss.postcssStrings.from
import typings.postcss.postcssStrings.map
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultOptions extends ProcessOptions {
  /**
    * The CSS node that was the source of the warning.
    */
  var node: js.UndefOr[Node] = js.undefined
  /**
    * Name of plugin that created this warning. Result#warn() will fill it
    * automatically with plugin.postcssPlugin value.
    */
  var plugin: js.UndefOr[String] = js.undefined
}

object ResultOptions {
  @scala.inline
  def apply(
    from: String = null,
    map: SourceMapOptions | Boolean = null,
    node: Node = null,
    parser: (/* css */ ParserInput, /* opts */ js.UndefOr[Pick[ProcessOptions, map | from]]) => Root = null,
    plugin: String = null,
    stringifier: (/* node */ Node, /* builder */ Builder) => Unit = null,
    syntax: Syntax = null,
    to: String = null
  ): ResultOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2(parser))
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction2(stringifier))
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ResultOptions]
  }
}

