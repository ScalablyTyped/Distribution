package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WarningOptions extends ResultOptions {
  /**
    * The index inside a node's string that should be highlighted as
    * source of warning.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * A word inside a node's string that should be highlighted as source
    * of warning.
    */
  var word: js.UndefOr[java.lang.String] = js.undefined
}

object WarningOptions {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    map: SourceMapOptions | scala.Boolean = null,
    node: Node = null,
    parser: Parser = null,
    plugin: java.lang.String = null,
    stringifier: Stringifier = null,
    syntax: Syntax = null,
    to: java.lang.String = null,
    word: java.lang.String = null
  ): WarningOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (stringifier != null) __obj.updateDynamic("stringifier")(stringifier)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[WarningOptions]
  }
}

