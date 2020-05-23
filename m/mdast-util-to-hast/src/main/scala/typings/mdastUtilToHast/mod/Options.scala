package typings.mdastUtilToHast.mod

import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Whether to allow [`html`](https://github.com/syntax-tree/mdast#html) nodes and inject them as raw HTML
    *
    * Only do this when using [`hast-util-to-html`](https://github.com/syntax-tree/hast-util-to-html)
    * ([`rehype-stringify`](https://github.com/rehypejs/rehype/tree/master/packages/rehype-stringify)) or
    * [`hast-util-raw`](https://github.com/syntax-tree/hast-util-raw)
    * ([`rehype-raw`](https://github.com/rehypejs/rehype-raw)) later: `raw` nodes are not a standard part of
    * [hast](https://github.com/syntax-tree/hast).
    *
    * @default false
    */
  var allowDangerousHtml: js.UndefOr[Boolean] = js.undefined
  /**
    * Set to `true` to prefer the first when duplicate definitions are found.
    *
    * The default behavior is to prefer the last duplicate definition.
    *
    * @default false
    */
  var commonmark: js.UndefOr[Boolean] = js.undefined
  /**
    * Object mapping [mdast](https://github.com/syntax-tree/mdast)
    * [nodes](https://github.com/syntax-tree/mdast#nodes) to functions handling them.
    * Take a look at
    * [`lib/handlers/`](https://github.com/syntax-tree/mdast-util-to-hast/blob/master/lib/handlers)
    * for examples.
    */
  var handlers: js.UndefOr[Handlers] = js.undefined
  /**
    * Handler for all unknown nodes.
    *
    * Default behavior:
    *
    * * Unknown nodes with [`children`][child] are transformed to `div` elements
    * * Unknown nodes with `value` are transformed to [`text`][hast-text] nodes
    */
  var unknownHandler: js.UndefOr[Handler] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowDangerousHtml: js.UndefOr[Boolean] = js.undefined,
    commonmark: js.UndefOr[Boolean] = js.undefined,
    handlers: Handlers = null,
    unknownHandler: (/* h */ H, /* node */ Node) => js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDangerousHtml)) __obj.updateDynamic("allowDangerousHtml")(allowDangerousHtml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(commonmark)) __obj.updateDynamic("commonmark")(commonmark.get.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (unknownHandler != null) __obj.updateDynamic("unknownHandler")(js.Any.fromFunction2(unknownHandler))
    __obj.asInstanceOf[Options]
  }
}

