package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserOptions extends js.Object {
  /**
    * The [scripting flag](https://html.spec.whatwg.org/multipage/parsing.html#scripting-flag). If set
    * to `true`, `noscript` element content will be parsed as text.
    *
    *  **Default:** `true`
    */
  var scriptingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Enables source code location information. When enabled, each node (except the root node)
    * will have a `sourceCodeLocation` property. If the node is not an empty element, `sourceCodeLocation` will
    * be a {@link ElementLocation} object, otherwise it will be {@link Location}.
    * If the element was implicitly created by the parser (as part of
    * [tree correction](https://html.spec.whatwg.org/multipage/syntax.html#an-introduction-to-error-handling-and-strange-cases-in-the-parser)),
    * its `sourceCodeLocation` property will be `undefined`.
    *
    * **Default:** `false`
    */
  var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the resulting tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setScriptingEnabled(value: Boolean): Self = this.set("scriptingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptingEnabled: Self = this.set("scriptingEnabled", js.undefined)
    @scala.inline
    def setSourceCodeLocationInfo(value: Boolean): Self = this.set("sourceCodeLocationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCodeLocationInfo: Self = this.set("sourceCodeLocationInfo", js.undefined)
    @scala.inline
    def setTreeAdapter(value: TreeAdapter): Self = this.set("treeAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeAdapter: Self = this.set("treeAdapter", js.undefined)
  }
  
}

