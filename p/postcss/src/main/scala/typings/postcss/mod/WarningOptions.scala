package typings.postcss.mod

import typings.postcss.anon.PickProcessOptionsmapfrom
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
    index: js.UndefOr[Double] = js.undefined,
    map: SourceMapOptions | Boolean = null,
    node: Node = null,
    parser: (/* css */ ParserInput, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => Root_ = null,
    plugin: String = null,
    stringifier: (/* node */ Node, /* builder */ Builder) => Unit = null,
    syntax: Syntax = null,
    to: String = null,
    word: String = null
  ): WarningOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction2(parser))
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction2(stringifier))
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarningOptions]
  }
}

