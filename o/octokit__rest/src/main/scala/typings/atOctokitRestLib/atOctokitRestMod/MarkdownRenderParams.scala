package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownRenderParams extends js.Object {
  /**
    * The repository context to use when creating references in `gfm` mode. Omit this parameter when using `markdown` mode.
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rendering mode. Can be either:  ,* \* `markdown` to render a document in plain Markdown, just like README.md files are rendered.  ,* \* `gfm` to render a document in [GitHub Flavored Markdown](https://github.github.com/gfm/), which creates links for user mentions as well as references to SHA-1 hashes, issues, and pull requests.
    */
  var mode: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.markdown | atOctokitRestLib.atOctokitRestLibStrings.gfm
  ] = js.undefined
  /**
    * The Markdown text to render in HTML. Markdown content must be 400 KB or less.
    */
  var text: java.lang.String
}

object MarkdownRenderParams {
  @scala.inline
  def apply(
    text: java.lang.String,
    context: java.lang.String = null,
    mode: atOctokitRestLib.atOctokitRestLibStrings.markdown | atOctokitRestLib.atOctokitRestLibStrings.gfm = null
  ): MarkdownRenderParams = {
    val __obj = js.Dynamic.literal(text = text)
    if (context != null) __obj.updateDynamic("context")(context)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderParams]
  }
}

