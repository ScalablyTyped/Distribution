package typings.mdastUtilToHast.mod

import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var allowDangerousHtml: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` to prefer the first when duplicate definitions are found.
    *
    * The default behavior is to prefer the last duplicate definition.
    *
    * @default false
    */
  var commonmark: js.UndefOr[Boolean] = js.native
  /**
    * Object mapping [mdast](https://github.com/syntax-tree/mdast)
    * [nodes](https://github.com/syntax-tree/mdast#nodes) to functions handling them.
    * Take a look at
    * [`lib/handlers/`](https://github.com/syntax-tree/mdast-util-to-hast/blob/master/lib/handlers)
    * for examples.
    */
  var handlers: js.UndefOr[Handlers] = js.native
  /**
    * Handler for all unknown nodes.
    *
    * Default behavior:
    *
    * * Unknown nodes with [`children`][child] are transformed to `div` elements
    * * Unknown nodes with `value` are transformed to [`text`][hast-text] nodes
    */
  var unknownHandler: js.UndefOr[Handler] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDangerousHtml(value: Boolean): Self = this.set("allowDangerousHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDangerousHtml: Self = this.set("allowDangerousHtml", js.undefined)
    @scala.inline
    def setCommonmark(value: Boolean): Self = this.set("commonmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonmark: Self = this.set("commonmark", js.undefined)
    @scala.inline
    def setHandlers(value: Handlers): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setUnknownHandler(value: (/* h */ H, /* node */ Node) => js.Any): Self = this.set("unknownHandler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUnknownHandler: Self = this.set("unknownHandler", js.undefined)
  }
  
}

