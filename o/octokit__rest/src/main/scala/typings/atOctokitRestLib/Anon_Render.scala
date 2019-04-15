package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Render extends js.Object {
  /**
    * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  @JSName("renderRaw")
  var renderRaw_Original: Anon_EndpointParamsMarkdownRenderRawParams = js.native
  @JSName("render")
  var render_Original: Anon_EndpointParamsMarkdownRenderParams = js.native
  def render(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.MarkdownRenderResponse]
  ] = js.native
  def render(params: atOctokitRestLib.atOctokitRestMod.MarkdownRenderParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.MarkdownRenderResponse]
  ] = js.native
  /**
    * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  def renderRaw(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.MarkdownRenderRawResponse]
  ] = js.native
  def renderRaw(params: atOctokitRestLib.atOctokitRestMod.MarkdownRenderRawParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.MarkdownRenderRawResponse]
  ] = js.native
}

