package typings
package postcssLib.postcssMod.postcssNs

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
    map: SourceMapOptions | postcssLib.postcssLibNumbers.`true` = null,
    node: Node = null,
    parser: Parser = null,
    plugin: java.lang.String = null,
    stringifier: Stringifier = null,
    syntax: Syntax = null,
    to: java.lang.String = null
  ): ResultOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[ResultOptions]
  }
}

