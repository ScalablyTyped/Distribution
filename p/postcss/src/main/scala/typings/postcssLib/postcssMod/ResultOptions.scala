package typings
package postcssLib.postcssMod

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
  var plugin: js.UndefOr[java.lang.String] = js.undefined
}

object ResultOptions {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    map: SourceMapOptions = null,
    node: Node = null,
    parse: Parse = null,
    parser: Parse | Syntax = null,
    plugin: java.lang.String = null,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    stringifier: Stringify | Syntax = null,
    stringify: Stringify = null,
    syntax: Syntax = null,
    to: java.lang.String = null
  ): ResultOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map)
    if (node != null) __obj.updateDynamic("node")(node)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(stringify)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ResultOptions]
  }
}

