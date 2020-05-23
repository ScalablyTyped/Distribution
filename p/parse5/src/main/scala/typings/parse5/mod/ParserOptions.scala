package typings.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  /**
    * The [scripting flag](https://html.spec.whatwg.org/multipage/parsing.html#scripting-flag). If set
    * to `true`, `noscript` element content will be parsed as text.
    *
    *  **Default:** `true`
    */
  var scriptingEnabled: js.UndefOr[Boolean] = js.undefined
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
  var sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the resulting tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    scriptingEnabled: js.UndefOr[Boolean] = js.undefined,
    sourceCodeLocationInfo: js.UndefOr[Boolean] = js.undefined,
    treeAdapter: TreeAdapter = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scriptingEnabled)) __obj.updateDynamic("scriptingEnabled")(scriptingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceCodeLocationInfo)) __obj.updateDynamic("sourceCodeLocationInfo")(sourceCodeLocationInfo.get.asInstanceOf[js.Any])
    if (treeAdapter != null) __obj.updateDynamic("treeAdapter")(treeAdapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

