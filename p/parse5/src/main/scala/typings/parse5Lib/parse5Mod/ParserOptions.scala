package typings
package parse5Lib.parse5Mod

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
  var scriptingEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var sourceCodeLocationInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies the resulting tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.undefined
}

