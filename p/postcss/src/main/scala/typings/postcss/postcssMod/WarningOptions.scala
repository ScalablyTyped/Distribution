package typings.postcss.postcssMod

import typings.postcss.postcssStrings.from
import typings.postcss.postcssStrings.map
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WarningOptions extends ResultOptions {
  /**
    * The index inside a node's string that should be highlighted as
    * source of warning.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * A word inside a node's string that should be highlighted as source
    * of warning.
    */
  var word: js.UndefOr[String] = js.undefined
}

object WarningOptions {
  @scala.inline
  def apply(
    from: String = null,
    index: Int | Double = null,
    map: SourceMapOptions | Boolean = null,
    node: Node = null,
    parser: (/* css */ ParserInput, /* opts */ js.UndefOr[Pick[ProcessOptions, map | from]]) => Root = null,
    plugin: String = null,
    stringifier: (/* node */ Node, /* builder */ Builder) => Unit = null,
    syntax: Syntax = null,
    to: String = null,
    word: String = null
  ): WarningOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2(parser))
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction2(stringifier))
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    if (to != null) __obj.updateDynamic("to")(to)
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[WarningOptions]
  }
}

