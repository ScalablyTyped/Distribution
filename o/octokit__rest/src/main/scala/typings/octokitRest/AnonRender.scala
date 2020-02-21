package typings.octokitRest

import typings.octokitRest.mod.Octokit.AnyResponse
import typings.octokitRest.mod.Octokit.MarkdownRenderParams
import typings.octokitRest.mod.Octokit.MarkdownRenderRawParams
import typings.octokitRest.mod.Octokit.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRender extends js.Object {
  /**
    * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  @JSName("renderRaw")
  var renderRaw_Original: AnonEndpointParamsAnyResponseMarkdownRenderRawParams = js.native
  @JSName("render")
  var render_Original: AnonEndpointParamsAnyResponseMarkdownRenderParams = js.native
  def render(): js.Promise[AnyResponse] = js.native
  def render(params: RequestOptions with MarkdownRenderParams): js.Promise[AnyResponse] = js.native
  /**
    * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  def renderRaw(): js.Promise[AnyResponse] = js.native
  def renderRaw(params: RequestOptions with MarkdownRenderRawParams): js.Promise[AnyResponse] = js.native
}

