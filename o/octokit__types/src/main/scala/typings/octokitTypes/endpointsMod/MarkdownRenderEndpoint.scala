package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.gfm
import typings.octokitTypes.octokitTypesStrings.markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownRenderEndpoint extends js.Object {
  /**
    * The repository context to use when creating references in `gfm` mode. Omit this parameter when using `markdown` mode.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * The rendering mode. Can be either:
    * \* `markdown` to render a document in plain Markdown, just like README.md files are rendered.
    * \* `gfm` to render a document in [GitHub Flavored Markdown](https://github.github.com/gfm/), which creates links for user mentions as well as references to SHA-1 hashes, issues, and pull requests.
    */
  var mode: js.UndefOr[markdown | gfm] = js.native
  /**
    * The Markdown text to render in HTML. Markdown content must be 400 KB or less.
    */
  var text: String = js.native
}

object MarkdownRenderEndpoint {
  @scala.inline
  def apply(text: String): MarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderEndpoint]
  }
  @scala.inline
  implicit class MarkdownRenderEndpointOps[Self <: MarkdownRenderEndpoint] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setMode(value: markdown | gfm): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

