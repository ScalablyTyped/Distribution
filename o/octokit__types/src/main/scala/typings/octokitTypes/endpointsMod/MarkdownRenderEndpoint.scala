package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.gfm
import typings.octokitTypes.octokitTypesStrings.markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownRenderEndpoint extends js.Object {
  /**
    * The repository context to use when creating references in `gfm` mode. Omit this parameter when using `markdown` mode.
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * The rendering mode. Can be either:
    * \* `markdown` to render a document in plain Markdown, just like README.md files are rendered.
    * \* `gfm` to render a document in [GitHub Flavored Markdown](https://github.github.com/gfm/), which creates links for user mentions as well as references to SHA-1 hashes, issues, and pull requests.
    */
  var mode: js.UndefOr[markdown | gfm] = js.undefined
  /**
    * The Markdown text to render in HTML. Markdown content must be 400 KB or less.
    */
  var text: String
}

object MarkdownRenderEndpoint {
  @scala.inline
  def apply(text: String, context: String = null, mode: markdown | gfm = null): MarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderEndpoint]
  }
}

